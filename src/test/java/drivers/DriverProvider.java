package drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DriverProvider {

  @Value("$browser")
  private String browserName;
  
  private ThreadLocal<WebDriver> driverInstance = new ThreadLocal<>();

  public WebDriver getInstance() {
    if (driverInstance.get() == null) {
      DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
      desiredCapabilities.setBrowserName(browserName);
      driverInstance.set(DriverFactory.getDriver(desiredCapabilities));
    }
    return driverInstance.get();
  }

}

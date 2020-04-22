package code.drivers;

import static org.openqa.selenium.remote.BrowserType.CHROME;
import static org.openqa.selenium.remote.BrowserType.FIREFOX;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.implementation.bytecode.StackManipulation.Illegal;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.springframework.beans.factory.FactoryBean;

public class DriverFactory {

  public static WebDriver getDriver(final DesiredCapabilities capabilities){
    switch (capabilities.getBrowserName()) {
      case FIREFOX: {
        // firefox
        WebDriverManager.firefoxdriver().setup();
        return new FirefoxDriver();
      }
      case CHROME: {
        ChromeDriverManager.chromedriver().setup();
        return new ChromeDriver();
      }
      default:
        throw new IllegalArgumentException("Invalid browser name: " + capabilities);
    }
  }
//  private String browser;
//  private WebDriver driver;
//
//  public DriverFactory(String browser) {
//    this.browser = browser;
//  }
//
//  @Override
//  public WebDriver getObject() throws Exception {
//    return driver;
//  }
//
//  @Override
//  public Class<WebDriver> getObjectType() {
//    return WebDriver.class;
//  }
//
//  @Override
//  public boolean isSingleton() {
//    return true;
//  }
//
//  public WebDriver start() {
//    switch (browser) {
//      case "firefox": {
//        // firefox
//        WebDriverManager.firefoxdriver().setup();
//        driver = new FirefoxDriver();
//      }
//      break;
//      case "chrome": {
//        ChromeDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
//      }
//      break;
//    }
//    driver.manage().window().fullscreen();
//    return driver;
//  }
//
//  public void stop() {
//    if (driver != null) {
//      //Step 4- Close Driver
//      driver.close();
//
//      //Step 5- Quit Driver
//      driver.quit();
//    }
//  }
}


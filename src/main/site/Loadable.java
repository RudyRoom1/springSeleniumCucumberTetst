package code.site;

import org.openqa.selenium.WebElement;

public interface Loadable {

  WebElement getLoadableElement();

  boolean isLoaded();

  void waitForLoad();

  void waitForDisappear();

}

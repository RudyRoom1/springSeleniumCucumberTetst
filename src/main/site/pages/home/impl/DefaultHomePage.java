package code.site.pages.home.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import code.site.AbstractPage;
import code.site.components.impl.DefaultBarComponent;
import code.site.pages.home.HomePage;

@Component
public class DefaultHomePage extends AbstractPage implements HomePage {

  @Autowired
  private DefaultBarComponent defaultBarComponent;

  public String getUrl() {
    return "https://github.com/";
  }

  public DefaultBarComponent defaultBarComponent() {
    this.waitForLoad();
    return defaultBarComponent;
  }

}

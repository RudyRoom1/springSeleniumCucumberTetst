package site.pages.home.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import site.AbstractPage;
import site.components.impl.DefaultBarComponent;

@Component
public class DefaultHomePage extends AbstractPage  {

  @Autowired
  private DefaultBarComponent defaultBarComponent;

  @Override
  public String getUrl() {
    return "https://github.com/";
  }

  public DefaultBarComponent defaultBarComponent() {
    this.waitForLoad();
    return defaultBarComponent;
  }

}

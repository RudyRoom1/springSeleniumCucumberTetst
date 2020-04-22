package code.site;

import org.springframework.stereotype.Component;

@Component
public abstract class AbstractPage extends AbstractLoadable implements Page {

  public void openPage(String url) {
    driverProvider.getInstance().get(getUrl());
  }

}

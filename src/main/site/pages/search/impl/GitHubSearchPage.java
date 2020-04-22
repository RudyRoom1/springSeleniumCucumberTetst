package code.site.pages.search.impl;

import org.springframework.stereotype.Component;
import code.site.AbstractPage;

@Component
public class GitHubSearchPage extends AbstractPage {

//  @Autowired
//  private DefaultBarComponent defaultBarComponent;

  @Override
  public String getUrl() {
    return "https://github.com/search";
  }

//  public DefaultBarComponent defaultBarComponent() {
//    this.waitForLoad();
//    return defaultBarComponent;
//  }
}

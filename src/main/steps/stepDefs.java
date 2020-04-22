package code.steps;

import cucumber.api.java.en.Given;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import code.site.pages.home.impl.DefaultHomePage;

@Component
public class stepDefs {

  @Autowired
  private DefaultHomePage homePage;

  private static final Logger logger = LoggerFactory.getLogger(stepDefs.class);

  @Given("^I open GitHub homePage$")
  public void iOpenGitHubHomePage() {
    homePage.getUrl();
  }
}

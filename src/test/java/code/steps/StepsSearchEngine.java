package code.steps;

import code.spring.ApplicationConfig;
import cucumber.api.java.en.Given;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import site.pages.home.impl.DefaultHomePage;

@ContextConfiguration(classes = ApplicationConfig.class)
public class StepsSearchEngine {

  @Autowired
  private DefaultHomePage homePage;

  private static final Logger logger = LoggerFactory.getLogger(StepsSearchEngine.class);

  @Given("^I open GitHub homePage$")
  public void iOpenGitHubHomePage() {
    homePage.openPage();
  }
}

package hooks;

import com.qa.factory.DriverFactory;
import com.qa.util.ConfigReader;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

import java.util.Properties;

public class ApplicationHooks {

    private DriverFactory driverfactory;
    private WebDriver webDriver;
    private ConfigReader configReader;
    Properties prop;

    @Before(order = 0)
    public void getProperty() {
        configReader = new ConfigReader();
        prop = configReader.init_prop();
    }

    @Before(order = 1)
    public void launchBrowser() {
        String browserName = prop.getProperty("browser");
        driverfactory = new DriverFactory();
        webDriver = driverfactory.init_driver(browserName);
    }

    @After(order = 0)
    public void browserQuit() {
       webDriver.close();
   }
    @Before("@Arrays")
    public void navigateToArrayPageHome() {
        webDriver.get("https://dsportalapp.herokuapp.com/array/arrays-in-python/");
    }
    @Before("@TreePage")
    public void navigateToTreePageHome() {
        webDriver.get("https://dsportalapp.herokuapp.com/tree/overview-of-trees/");
    }


    @Before("@LinkedListPage")
    public void navigateToLinkedListHome(){webDriver.get("https://dsportalapp.herokuapp.com/linked-list/introduction/");}

    @Before("@StackPage")
    public void navigateToStackPage() {webDriver.get("https://dsportalapp.herokuapp.com/stack/operations-in-stack/");}
   // @After(order = 1)
    @Before("@GraphPage")
    public void navigateToGraphPageHome() {
        webDriver.get("https://dsportalapp.herokuapp.com/graph/graph-representations/");
    }


    // @After(order = 1)
   // public void tearDown(Scenario scenario) {
    //    if (scenario.isFailed()) {
            //take screenshot
     //       String screenShotName = scenario.getName().replaceAll(" ", "_");
      //      byte[] sourcePath = ((TakesScreenshot) webDriver).getScreenshotAs(OutputType.BYTES);
      //      scenario.attach(sourcePath, "image/png", screenShotName);
       // }
  //  }
}

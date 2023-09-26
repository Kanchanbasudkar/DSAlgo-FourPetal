package hooks;

import java.util.Properties;

import org.openqa.selenium.WebDriver;

import com.qa.factory.DriverFactory;
import com.qa.util.ConfigReader;

import io.cucumber.java.After;
import io.cucumber.java.Before;

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

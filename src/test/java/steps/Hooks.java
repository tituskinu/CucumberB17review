package steps;

import io.cucumber.java.Scenario;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.TakesScreenshot;
import utils.CommonMethods;

public class Hooks extends CommonMethods {
    @Before
    public void start(){
        openBrowserAndLaunchApplication();
    }
    @After
    public void end(Scenario Scenario){
       // TakesScreenshot("failed/"+Scenario);
        closeBrowser();
    }

}

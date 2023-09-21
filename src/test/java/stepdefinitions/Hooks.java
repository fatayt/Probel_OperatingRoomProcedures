package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.ConfigReader;
import utilities.Driver;

import java.io.IOException;
import java.time.Duration;

public class Hooks {


    @Before
    public void setUp(Scenario scenario) {

        Driver.getDriver().manage().window().maximize();
        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        Driver.getDriver().get(ConfigReader.getProperty("probel_WebUrl"));
        System.out.println("scenario name =" + scenario.getName());



    }

    @After
    public void tearDown(Scenario scenario) throws IOException {
        if (scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);

            scenario.attach(screenshot, "image/png", "Screenshots");

        }
       // Driver.closeDriver();
    }
}

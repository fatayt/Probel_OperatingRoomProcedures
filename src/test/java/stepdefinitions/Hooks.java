package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.ConfigReader;
import utilities.Driver;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Hooks {


    @Before
    public void setUp(Scenario scenario) {

        Driver.getDriver().manage().window().maximize();
        Driver.getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        Driver.getDriver().get(ConfigReader.getProperty("probel_WebUrl"));

        System.out.println("scenario started");
       // System.out.println("scenario id =" + scenario.getId());
        System.out.println("scenario name =" + scenario.getName());



    }

    @After
    public void tearDown(Scenario scenario) throws IOException {
        if (scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);

            scenario.attach(screenshot, "image/png", "Screenshots");

        }
        Driver.closeDriver();
    }
}

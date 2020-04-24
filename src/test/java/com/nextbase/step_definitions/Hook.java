package com.nextbase.step_definitions;

import com.nextbase.utilities.Driver;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.util.concurrent.TimeUnit;

//import java.util.concurrent.TimeUnit;

public class Hook {
    private static Logger logger=Logger.getLogger(Hook.class);

    @Before
    public void setup(){
        logger.info("===============================");
        logger.info("Test setup");
        Driver.get().manage().window().maximize();
      //  Driver.get().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @After
    public void teardown(Scenario scenario){

        if(scenario.isFailed()){
            logger.error("Test failed");
            TakesScreenshot screenShot = (TakesScreenshot) Driver.get();
            byte[] screen = screenShot.getScreenshotAs(OutputType.BYTES);
            scenario.embed(screen,"image/png","Name of screenshot");
        }else {
            logger.info("Cleanup!");
            logger.info("Test completed!");
        }
        logger.info("===================================");

        Driver.close();

    }
}

package com.flipkart.step_Definitions;

import com.flipkart.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {
    public void setup(){
        System.out.println("----> @Before running beforeeach SCENARIOS");
    }


    @After   // import @After coming from io.cucumber.java
    public void teardownMethod(Scenario scenario) { // take screenshot method
        if (scenario.isFailed()){ // if one of our ecenarios failed then take a screenshot
            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }
        System.out.println("---->@After running after each SCENARIOS");
        Driver.closeDriver();// it wil open me the browser wich i am  using
    }




    /*
    ----> @Before each SCENARIOS
    User is on the login page of the Library application.
    User enters librarian username.
    User enters librarian password.
    User sees the dashboard
    @After running for each SCENARIOS
    ----> @Before each SCENARIOS

     */
//@BeforeStep
    public static void beforeStep(){
        System.out.println("---->@BeforeStep running before each steps");
    }
    //@AfterStep
    public static void teardownAfterStep(){
        System.out.println("---->@AfterStep running after each steps");
    }
}






package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


    @RunWith(Cucumber.class)
    @CucumberOptions(features = {"C:\\Users\\dpate\\SeleniumFrameworkDemo\\src\\test\\java\\features\\RahulDropDown.feature"},
            glue = {"stepDef"},
            plugin = {"pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
            monochrome = true,// It will Present Nicely
            publish = true // It will Publish
    )
    public class RunnerClass {


    }
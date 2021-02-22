package com.appium.runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "json:target/cucumber-reports/Cucumber.json",
                "junit:target/cucumber-reports/Cucumber.xml",
                "html:target/cucumber-reports",
                "rerun:target/rerun.txt"},
        features = "src/test/resources/features",
        glue = "com/appium/step_definitions",
        dryRun = false,
        tags = "@wip"
)
public class CukesRunner {

}

package runner;

import io.cucumber.junit.*;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "features",
        glue = "stepsDefinitions",
        tags = "@Teste",
        plugin = {"pretty", "html:evidencias/teste-cucumber-report.html"})

public class RunnerTest {
}

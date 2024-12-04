package test.steps;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/features/calcul_determinant.feature",
        glue = {"test.steps"},
        plugin = {"html:target/cucumber-reports/cucumber-report.html"}
)
public class RunCucumberTest {
}
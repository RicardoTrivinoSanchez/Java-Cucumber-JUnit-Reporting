package parallel;
;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin= {
        "timeline:target/reports/timeline",
        "html:target/reports/html",
        "pretty",
        "json:target/report.json",
        "de.monochromata.cucumber.report.PrettyReports:target/pretty-cucumber"
})
public class RunCucumberTest {
}
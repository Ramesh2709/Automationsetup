package runnerpack5;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="Features5",glue={"stepdefinition"},plugin= {"pretty","json:cucumber5/target/cucumber-reports/Cucumber.json",
"junit:cucumber5/target/cucumber-reports/Cucumber.xml","html:cucumber5/target/cucumber-reports"},monochrome=true)

public class runner5 {

}

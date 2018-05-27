package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features= {"src/test/java/features/POMCreateLead.feature"},glue= {"steps","pages"}
, tags= {"@sanity or @regression"}, monochrome=true)

public class RunTest {

}
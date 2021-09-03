package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features= "C:/Users/thiru/IdeaProjects/CucumberProject/src/test/java/Featurefiles/OrangeLogin_Test.feature", glue="StepDefinition")


public class OrangeLogin_RunnerClass {
}

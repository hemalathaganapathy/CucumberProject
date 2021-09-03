
package Runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= "C:/Users/thiru/IdeaProjects/CucumberProject/src/test/java/Featurefiles/OpenGoogle.feature", glue="StepDefinition")
public class RunnerClass {

}
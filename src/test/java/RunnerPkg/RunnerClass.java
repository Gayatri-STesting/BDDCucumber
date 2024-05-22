package RunnerPkg;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
	features= {"src/test/resources/BDDAppFeatureFolder/BDDFile.feature"},
	glue = {"BDDPKGSteps"}
)

public class RunnerClass extends AbstractTestNGCucumberTests
{
	
	
	

}

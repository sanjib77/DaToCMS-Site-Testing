package co.capstone.runner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.FeatureWrapper;
import io.cucumber.testng.PickleWrapper;
import io.cucumber.testng.TestNGCucumberRunner;

@CucumberOptions(
				features="src\\test\\resources\\Feature",
				glue="stepdefinations",
					monochrome=true,
					publish=true)
public class Runner {
private TestNGCucumberRunner testNGCucumberRunner;
	
	@BeforeClass(alwaysRun = true)
	public void setup() throws Exception{
		testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
		
	}
	
	@Test(dataProvider="features")
	public void featue(PickleWrapper pickle,FeatureWrapper cucumberfeature) {
		testNGCucumberRunner.runScenario(pickle.getPickle());
	}
	
	@DataProvider
	public Object[][] features(){
		return testNGCucumberRunner.provideScenarios();
	}
	
	@AfterClass(alwaysRun = true)
	public void tearDown() {
		testNGCucumberRunner.finish();
	}
}

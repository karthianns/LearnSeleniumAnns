package steps;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import wdMethods.SeMethods;

public class Hooks extends SeMethods  {

	@Before
	public void before(Scenario sc)
	{
		System.out.println("The Name is " +sc.getName());
		System.out.println("The ID is " +sc.getId());
		startResult();
		startTestModule(sc.getName(), sc.getId());	
		test = startTestCase(sc.getName());
				test.assignCategory("Smoke");
				test.assignAuthor("Anns");
				startApp("chrome");	
	}

	@After
	public void after(Scenario sc)
	{
		System.out.println("Test case Execution Status: " + sc.getStatus());
		closeAllBrowsers();
		endResult();
	}
}

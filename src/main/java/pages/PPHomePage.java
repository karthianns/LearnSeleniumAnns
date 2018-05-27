package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class PPHomePage extends ProjectMethods{ 

	public PPHomePage() {		
		PageFactory.initElements(driver,this);
	}	

	@FindBy(how=How.ID, using="signup-button")
	WebElement eleSignUp;

	@And("Click on SignUp")
	public PPHomePage2 clickSignUp()
	{
		click(eleSignUp);
		return new PPHomePage2();
	}
}

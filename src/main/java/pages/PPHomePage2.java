package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class PPHomePage2 extends ProjectMethods {

	public PPHomePage2() {		
		PageFactory.initElements(driver,this);
	}

	@FindBy(how=How.ID, using="radio-personal")
	WebElement eleShoppersRadio;

	@And("Selecting Radio button")
	public PPHomePage2 clickForShoppersRadioButton()
	{
		click(eleShoppersRadio);
		return this;
	}

	@FindBy(how=How.LINK_TEXT, using = "Next")
	WebElement eleClickNext;

	@And("Click Next")
	public PPSignUpPage clickNext()
	{
		click(eleClickNext);
		return new PPSignUpPage();
	}

}

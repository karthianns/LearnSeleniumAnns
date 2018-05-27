package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class PPSignUpPage extends ProjectMethods {

	public PPSignUpPage() {		
		PageFactory.initElements(driver,this);
	}

	@FindBy(how=How.ID, using="country")
	WebElement eleCountryDd;

	@And("Selecting Country")
	public PPSignUpPage selectCountry(String country)
	{
		
		selectDropDownUsingText(eleCountryDd, country);
		return this;
	}


}

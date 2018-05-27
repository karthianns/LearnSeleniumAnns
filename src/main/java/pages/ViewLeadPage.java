package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Then;
import wdMethods.ProjectMethods;

public class ViewLeadPage extends ProjectMethods {

	public ViewLeadPage() {
		PageFactory.initElements(driver,this);
	}

	@FindBy(how=How.ID, using = "viewLead_firstName_sp")
	WebElement eleViewLeadFName;
	
	public ViewLeadPage verifyFName(String viewLeadFName)
	{
		verifyPartialText(eleViewLeadFName, viewLeadFName);
		return this;
	}
	
	@Then("Create Lead is sucessful")
	public ViewLeadPage verifyCreateLead()
	{
		System.out.println("Create Lead is Successful");
		return this;
	}
}

package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import wdMethods.ProjectMethods;

public class CreateLeadPage extends ProjectMethods {

	public CreateLeadPage() {
		PageFactory.initElements(driver,this);
	}

	@FindBy(how=How.ID, using ="createLeadForm_companyName")
	WebElement eleCName;

	@And("Enter the companyName as (.*)")
	public CreateLeadPage enterCName(String cName)
	{
		type(eleCName, cName);
		return this;
	}

	@FindBy(how=How.ID, using ="createLeadForm_firstName")
	WebElement eleFName;

	@And("Enter the firstName as (.*)")
	public CreateLeadPage enterFName(String fName)
	{
		type(eleFName, fName);
		return this;
	}

	@FindBy(how=How.ID, using ="createLeadForm_lastName")
	WebElement eleLName;

	@And("Enter the lastName as (.*)")
	public CreateLeadPage enterLName(String lName)
	{
		type(eleLName, lName);
		return this;
	}

	@FindBy(how=How.CLASS_NAME, using = "smallSubmit")
	WebElement eleCreateLeadButton;

	@When("Click on submitButton")
	public ViewLeadPage clickCreateLeadButton()
	{
		click(eleCreateLeadButton);
		return new ViewLeadPage();
	}
}

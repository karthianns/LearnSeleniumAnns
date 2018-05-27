package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC003_CreateLead extends ProjectMethods {

	@BeforeTest
	public void setData() {
		testCaseName="TC003_CreateLead";
		testDescription="Create a New Lead";
		testNodes="Leads";
		category="Funtional Testing";
		authors="Karthik";
		browserName="chrome";
		dataSheetName="TC003";
	}
	@Test(dataProvider="fetchData")
	public void CreateLead(String uName,String password, String cName, String fName, String lName, String viewLeadFName) {
		
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(password)
		.clickLogIn()
		.clickCrmSfa()
		.clickLeads()
		.clickCreateLeadLink()
		.enterCName(cName)
		.enterFName(fName)
		.enterLName(lName)
		.clickCreateLeadButton()
		.verifyFName(viewLeadFName);
	}
}

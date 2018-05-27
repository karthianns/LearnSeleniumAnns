package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.PPHomePage;
import wdMethods.ProjectMethods;

public class TC004_PayPal extends ProjectMethods {

	@BeforeTest
	public void PPSignUp() {
		testCaseName="TC004_PayPal";
		testDescription="Sign Up in PayPal";
		testNodes="Sign-Up";
		category="Funtional Testing";
		authors="Karthik";
		browserName="chrome";
		dataSheetName="TC004";
	}

	@Test(dataProvider="fetchData")
	public void signUp (String country) {

		new PPHomePage()
		.clickSignUp()
		.clickForShoppersRadioButton()
		.clickNext()
		.selectCountry(country);
	}
}	


















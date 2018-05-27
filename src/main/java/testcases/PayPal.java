package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PayPal {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.paypal.com/in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementById("signup-button").click();
		boolean radio = driver.findElementById("radio-personal").isSelected();
		if(radio)
		{
			System.out.println("For Shoppers Radio button is already selected ");
		}
		else
		{
			driver.findElementById("radio-personal").click();
			System.out.println("For Shoppers Radio button is selected now ");
		}
		
		driver.findElementByLinkText("Next").click();
		WebElement country = driver.findElementById("country");
		Select dd = new Select(country);
		dd.selectByVisibleText("Australia");
		
		// After selecting Australia as country
		
		driver.findElementById("paypalAccountData_firstName").sendKeys("Vicky");
		driver.findElementById("paypalAccountData_middleName").sendKeys("Mama");
		driver.findElementById("paypalAccountData_lastName").sendKeys("V");
		driver.findElementById("paypalAccountData_email").sendKeys("vicky.mama123@gmail.com");
		driver.findElementById("paypalAccountData_password").sendKeys("suresh4205");
		driver.findElementById("paypalAccountData_confirmPassword").sendKeys("suresh4205");
		
		
	
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
	//	driver.quit();
	}

}

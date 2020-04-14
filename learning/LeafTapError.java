package learning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LeafTapError {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");

	    ChromeDriver driver = new ChromeDriver();
	    driver.get("http://leaftaps.com/opentaps/control/main");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	    driver.findElementById("username").sendKeys("Demosalesmanager");
	    driver.findElementById("password").sendKeys("crmsfa");
	    driver.findElementByClassName("decorativeSubmit").click();
	    driver.findElementByXPath("//a[text()[normalize-space()='CRM/SFA']]").click();
	    driver.findElementByPartialLinkText("Accounts").click();
	    driver.findElementByXPath("//a[@href='/crmsfa/control/createAccountForm']").click();
	    driver.findElementById("accountName").sendKeys("pofddtoo");
	    driver.findElementById("primaryPhoneNumber").sendKeys("8939701");
	    driver.findElementByName("industryEnumId").sendKeys("Aerospace");
	    WebElement ele = driver.findElementByName("ownershipEnumId");
	    Select dd = new Select(ele);
	    dd.selectByIndex(1);
	    WebElement ele1 = driver.findElement(By.id("dataSourceId"));
	    Select dd1 = new Select(ele1);
	    dd1.selectByVisibleText("Cold Call");


	    WebElement ele3 = driver.findElement(By.id("initialTeamPartyId"));
	    Select dd3 = new Select(ele3);
	    dd3.selectByValue("DemoSalesTeam1");
 
	    
	    driver.findElementByClassName("smallSubmit").click();
	    String error = driver.findElementByXPath("//li[@class='errorMessage']").getText();
	    System.out.println(error);
	    
	    

	}

}

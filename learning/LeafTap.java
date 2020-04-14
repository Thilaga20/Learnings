package learning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafTap {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");

    ChromeDriver driver = new ChromeDriver();
    driver.get("http://leaftaps.com/opentaps/control/main");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
    driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
    driver.findElementById("password").sendKeys("crmsfa");
    driver.findElementByClassName("decorativeSubmit").click();
    driver.findElementByXPath("//a[text()[normalize-space()='CRM/SFA']]").click();
    driver.findElementByPartialLinkText("Accounts").click();
    driver.findElementByXPath("//a[@href='/crmsfa/control/createAccountForm']").click();
    driver.findElementById("accountName").sendKeys("pofddtoo");
    driver.findElementById("primaryPhoneNumber").sendKeys("8939701");
    driver.findElementByClassName("smallSubmit").click();
    String accountname = driver.findElementByXPath("(//span[@class='tabletext'])[3]").getText();
    System.out.println(accountname);
    
    

    
    
    

    
    
    
    
    



	
	}

}

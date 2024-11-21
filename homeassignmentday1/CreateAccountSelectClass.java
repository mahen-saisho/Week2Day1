package week2.homeassignmentday1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountSelectClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://leaftaps.com/opentaps/control/main");
		
//Login Page:		
		WebElement username = driver.findElement(By.xpath("//label[text()='Username']/following-sibling::input"));
		username.sendKeys("Demosalesmanager");
		WebElement password=driver.findElement(By.xpath("//label[text()='Password']/following-sibling::input"));
		password.sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
//Click CRM Link
		driver.findElement(By.xpath("//div[@id='label']/a")).click();
//Click Account Tab
		driver.findElement(By.xpath("//a[text()='Accounts']")).click();
//Create an Account
		driver.findElement(By.xpath("//a[text()='Create Account']")).click();
		driver.findElement(By.id("accountName")).sendKeys("Mahendran123");  //Account Name
		driver.findElement(By.xpath("(//textarea[@class='inputBox'])[1]")).sendKeys("Selenium Automation Tester");	//Enter Description
		driver.findElement(By.xpath("(//select[@name='industryEnumId']/option)[4]")).click();
//SelectByVisibleText		
		WebElement ownership = driver.findElement(By.name("ownershipEnumId"));
		Select select = new Select(ownership);
		select.selectByVisibleText("S-Corporation");
//SelectByValue	
		WebElement employee = driver.findElement(By.name("dataSourceId"));
		Select selectemployee = new Select(employee);
		selectemployee.selectByValue("LEAD_EMPLOYEE");
//SelectByIndex
		WebElement campaign = driver.findElement(By.id("marketingCampaignId"));
		Select selectindex = new Select(campaign);
		selectindex.selectByIndex(6);
//SelectByValue		
		WebElement employee1 = driver.findElement(By.name("generalStateProvinceGeoId"));
		Select selectemployeevalue = new Select(employee1);
		selectemployeevalue.selectByValue("TX");
		
		
		String title = driver.getTitle();
		System.out.println(title);
	}

}

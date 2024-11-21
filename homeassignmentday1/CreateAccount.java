package week2.homeassignmentday1;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
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
		driver.findElement(By.id("accountName")).sendKeys("Mahendran Testacc");  //Account Name
		driver.findElement(By.xpath("(//textarea[@class='inputBox'])[1]")).sendKeys("Selenium Automation Tester");	//Enter Description
		driver.findElement(By.id("numberEmployees")).sendKeys("43");	//Number of employee
		WebElement sitename = driver.findElement(By.id("officeSiteName"));
		sitename.sendKeys("Mahendran Test-Site2");	//Site Name
//		driver.findElement(By.className("smallSubmit")).click(); //click create button
		
		String title = driver.getTitle();
		System.out.println(title);
	}

}


//ID: Demosalesmanager
//Password: crmsfa
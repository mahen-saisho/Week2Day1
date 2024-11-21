package week2.homeassignmentday1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//Login Page:		
		WebElement username = driver.findElement(By.xpath("//label[text()='Username']/following-sibling::input"));
		username.sendKeys("Demosalesmanager");
		WebElement password=driver.findElement(By.xpath("//label[text()='Password']/following-sibling::input"));
		password.sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
//Click CRM Link
		driver.findElement(By.xpath("//div[@id='label']/a")).click();
//Click Lead Tab
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
//Create Lead	
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Mahe-Company");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Mahendran");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("mahe");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Automating Site Practice");
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		
		String title = driver.getTitle();
		System.out.println(title);
			
	}

}

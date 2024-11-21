package week2.homeassignmentday1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookCreateAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://en-gb.facebook.com/");
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Mahendran");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("G");
		driver.findElement(By.xpath("(//input[contains(@class, 'inputtext')])[5]")).sendKeys("maheg3096@gmail.com");
		driver.findElement(By.xpath("//input[contains(@name, 'reg_pass')]")).sendKeys("Test@123");
	//Select day by selectByValue	
		WebElement day = driver.findElement(By.id("day"));
		Select selectday = new Select(day);
		selectday.selectByValue("30");
	//Select Month by selectByVisibleText	
		WebElement month = driver.findElement(By.id("month"));
		Select selectmonth = new Select(month);
		selectmonth.selectByVisibleText("Nov");
	//Select Year by selectByValue		
		WebElement year = driver.findElement(By.id("year"));
		Select selectyear = new Select(year);
		selectyear.selectByValue("1996");
		
		driver.findElement(By.xpath("//input[@value='2']")).click();

	}

}

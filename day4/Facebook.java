package week3.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) {
		// Step 1: Download and set the path 
		
		// Step 2: Launch the chromebrowser
		ChromeDriver driver = new ChromeDriver(); 
		
		//load url
		driver.get("https://en-gb.facebook.com/"); 
		
		// Step 4: Maximise the window
		driver.manage().window().maximize();
		
		// Step 5: Add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		// Step 6: Click on Create New Account button
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		// Step 7: Enter the first name
		WebElement firstName = driver.findElement(By.name("firstname"));
		firstName.sendKeys("Sathya");
		
		// Step 8: Enter the last name
		driver.findElement(By.name("lastname")).sendKeys("A");
		
		// Step 9: Enter the mobile number
		driver.findElement(By.name("reg_email__")).sendKeys("9999999999");
		
		// Step 10: Enter the password
		driver.findElement(By.name("reg_passwd__")).sendKeys("Sathya@1000");
				
		// Step 11: Handle all the three drop downs
		WebElement date = driver.findElement(By.name("birthday_day"));
		Select date1 = new Select(date);
		date1.selectByValue("10");
		
		WebElement month = driver.findElement(By.name("birthday_month"));
		Select month1 = new Select(month);
		month1.selectByIndex(10);
		
		WebElement year = driver.findElement(By.name("birthday_year"));
		Select year1 = new Select(year);
		year1.selectByVisibleText("1999");
						
		// Step 12: Select the radio button "Female" 
		driver.findElement(By.xpath("//input[@type='radio']")).click();
		
		driver.close();
	
		          
	}

}

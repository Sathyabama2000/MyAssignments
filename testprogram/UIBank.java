package testprogram;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UIBank {

	public static void main(String[] args) {
		//launch the browser
		ChromeDriver driver=new ChromeDriver();
		
		//load the url
		driver.get("https://uibank.uipath.com/register-account");
		
		// Maximize the Browser
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		
		//Enter your name
		driver.findElement(By.id("firstName")).sendKeys("sathya");
		
		//Select your title
		WebElement title = driver.findElement(By.id("title"));
		Select title1=new Select(title);
		title1.selectByVisibleText("Ms");
		
		//Enter your Initial
		driver.findElement(By.id("middleName")).sendKeys("A");
		
		//Enter your Last Name
		driver.findElement(By.id("lastName")).sendKeys("Arunachalam");
		
		//Select Gender
		WebElement gender = driver.findElement(By.name("gender"));
		Select gender1=new Select(gender);
		gender1.selectByVisibleText("Female");
		
		//Select Employment Status by using selectByVisibleText()
		WebElement status = driver.findElement(By.name("employmentStatus"));
		Select status1=new Select(status);
		status1.selectByVisibleText("Full-time");
		
		//Enter your name
		driver.findElement(By.id("username")).sendKeys("sathya");
		
		//Enter your EmailAddress  
		driver.findElement(By.id("email")).sendKeys("sathya@gmail.com");
		
		//Enter your Password
		driver.findElement(By.id("password")).sendKeys("password");
		
		//Close your Browser
		driver.close();
		
	}

}

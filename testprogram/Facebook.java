package testprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.time.Duration;

public class Facebook {

	public static void main(String[] args) {
		//launch the browser
				ChromeDriver driver = new ChromeDriver();
				
				//load the URL
				driver.get("https://www.facebook.com/");
				
				//Maximize the Browser
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
				
				//Click on Create New Account button
				driver.findElement(By.linkText("Create new account")).click();
								
				//Enter first name
				driver.findElement(By.name("firstname")).sendKeys("Sathya");
				
				// Enter last name
				driver.findElement(By.name("lastname")).sendKeys("A");
				
				//Enter your mobile number
				driver.findElement(By.name("reg_email__")).sendKeys("9999999999");
				
				//Enter your password
				driver.findElement(By.name("reg_passwd__")).sendKeys("sathya@100");
				
				//Select  date
				WebElement date = driver.findElement(By.id("day"));
				Select date1 = new Select(date);
				date1.selectByValue("1");
				
				//Select month
				WebElement month = driver.findElement(By.id("month"));
				Select month1 = new Select(month);
				month1.selectByIndex(5);
				
				//Select year
				WebElement year = driver.findElement(By.id("year"));
				Select year1 = new Select(year);
				year1.selectByVisibleText("1996");
				
				//Click on your Gender
				driver.findElement(By.xpath("//input[@value='1']")).click();
				
				//Close the Browser
				driver.close();


	}

}

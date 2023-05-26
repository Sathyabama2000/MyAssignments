package fridaytest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TamilMatrimony {

	public static void main(String[] args) throws InterruptedException {  
		        //launch the browser
				ChromeDriver driver = new ChromeDriver();
				//load the URL
				driver.get("https://www.tamilmatrimony.in/");
				//Maximize the Browser
				driver.manage().window().maximize();
				Thread.sleep(5000);
				//Select the Matrimony profile for YourSelf
				WebElement profile = driver.findElement(By.id("REGISTERED_BY"));
				Select profile1 = new Select(profile);
				profile1.selectByVisibleText("Friend");
				//Enter Name
				driver.findElement(By.id("NAME")).sendKeys("Virat");
				//Click on Gender
				driver.findElement(By.id("gendermale")).click();
				//Select Date  
				WebElement date = driver.findElement(By.id("DOBDAY"));
				Select date1 = new Select(date);
				date1.selectByVisibleText("31");
				//Select month
				WebElement month = driver.findElement(By.id("DOBMONTH"));
				Select month1 = new Select(month);
				month1.selectByIndex(9);
				//Select year
				WebElement year = driver.findElement(By.id("DOBYEAR"));
				Select year1 = new Select(year);
				year1.selectByValue("1999");
				//Select your Religion
				WebElement religion = driver.findElement(By.id("RELIGION"));
				Select religion1 = new Select(religion);
				religion1.selectByValue("1");
				//Select your Mother Tongue
				WebElement motherTongue = driver.findElement(By.id("MOTHERTONGUE"));
				Select motherTongue1 = new Select(motherTongue);
				motherTongue1.selectByValue("47");
				//Select your country
				WebElement country = driver.findElement(By.id("COUNTRY"));
				Select country1 = new Select(country);
				country1.selectByVisibleText("India");
				//Enter your MobileNumber
				driver.findElement(By.id("MOBILENO")).sendKeys("9999999998");
				//Enter your E-mail ID
				driver.findElement(By.id("EMAIL")).sendKeys("viratk@gmail.com");
				Thread.sleep(2000);
				//Close the Browser
                driver.close();
				
				
     
	}

}

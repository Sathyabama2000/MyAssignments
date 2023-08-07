package week3.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AcmeSystem {

	public static void main(String[] args) {
		        //launch browser
				ChromeDriver driver = new ChromeDriver();
				//maximize the window
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				//Load url 
				driver.get("https://acme-test.uipath.com/login");
				//Enter email
				driver.findElement(By.id("email")).sendKeys("kumar.testleaf@gmail.com");
				//Enter Password
				driver.findElement(By.id("password")).sendKeys("leaf@12");
		        //Click on login button
				driver.findElement(By.xpath("//button[@type='submit']")).click();
				// Get the title of the page and print
				String title = driver.getTitle();
				System.out.println("Title of the page: "+title );
				//Click on Log Out
				driver.findElement(By.linkText("Log Out")).click();
				
				//Close the browser
				driver.close();
				

	}

}

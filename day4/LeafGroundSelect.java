package week3.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LeafGroundSelect {

	public static void main(String[] args) throws InterruptedException {
		// launch the browser
		ChromeDriver driver = new ChromeDriver();

		// load the URL
		driver.get("https://leafground.com/select.xhtml");

		// Maximize the Browser
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// tool
		WebElement tool = driver.findElement(By.className("ui-selectonemenu"));
		Select tool1 = new Select(tool);
		tool1.selectByVisibleText("Selenium");

		// country
		driver.findElement(By.id("j_idt87:country_label")).click();
		driver.findElement(By.id("j_idt87:country_3")).click();
		
		// Confirm Cities belongs to Country is loaded
		Thread.sleep(3000);
		//driver.findElement(By.id("j_idt87:city_label")).click();
		driver.findElement(By.xpath("//label[text()='Select City']")).click();
		String city1 = driver.findElement(By.xpath("//li[@id='j_idt87:city_1']")).getText();
		String city2 = driver.findElement(By.xpath("//li[@id='j_idt87:city_2']")).getText();
		String city3 = driver.findElement(By.xpath("//li[@id='j_idt87:city_3']")).getText();
		  if ((city1.contains("Bengaluru")) && (city2.contains("Chennai")) &&
		  (city3.contains("Delhi"))) 
		  {
			  System.out.println("verified");
		  
		  }
		 
		// course
		WebElement course = driver.findElement(By.id("j_idt87:auto-complete_input"));
		course.sendKeys("Selenium WebDriver");
		driver.findElement(By.xpath("//span[text()='Selenium']")).click();

		// Choose language randomly
		driver.findElement(By.xpath("//label[text()='Select Language']")).click();
		driver.findElement(By.xpath("//li[text()='English']")).click();

		// select two
		Thread.sleep(5000);
		driver.findElement(By.xpath("//label[text()='Select Values']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//li[text()='Two']")).click();

	    driver.close();

	}

}

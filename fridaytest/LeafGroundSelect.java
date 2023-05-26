package fridaytest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LeafGroundSelect {

	public static void main(String[] args) throws InterruptedException {
		
			//launch the browser
			ChromeDriver driver = new ChromeDriver();
			//load the URL
			driver.get("https://leafground.com/select.xhtml");
			//Maximize the Browser
			driver.manage().window().maximize();
			Thread.sleep(5000);
			//tool
			WebElement tool = driver.findElement(By.className("ui-selectonemenu"));
			Select tool1 = new Select(tool);
			tool1.selectByVisibleText("Selenium");
			//country
			driver.findElement(By.id("j_idt87:country_label")).click();
			driver.findElement(By.id("j_idt87:country_3")).click();
			//Confirm Cities belongs to Country is loaded
			//driver.findElement(By.id("j_idt87:city_label")).click();
			
			//course
			WebElement course=driver.findElement(By.id("j_idt87:auto-complete_input"));
			course.click();
			course.sendKeys("Selenium WebDriver");
			//driver.findElement(By.xpath("//span[@class='ui-button-text']"));
			driver.findElement(By.xpath("//li[text()='Selenium WebDriver']")).click();
			
			
			

	}

}

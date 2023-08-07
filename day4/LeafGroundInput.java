package week3.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGroundInput {

	public static void main(String[] args) throws InterruptedException {
		 //launch the browser
		ChromeDriver driver = new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		// Launch  URL
		driver.get("https://www.leafground.com/input.xhtml");
		
		//Type your name
		driver.findElement(By.id("j_idt88:name")).sendKeys("Sathya");
		
		//Append Country to this City
		driver.findElement(By.id("j_idt88:j_idt91")).sendKeys(",India");
		
		//Verify if text box is disabled
		Boolean check = driver.findElement(By.id("j_idt88:j_idt93")).isEnabled();
		if(check==false)
		{
			System.out.println("text box is disabled");
		}
		
		//Clear the typed text
		driver.findElement(By.id("j_idt88:j_idt95")).clear();
		
		//Retrieve the typed text
		
		//Type email and Tab. Confirm control moved to next element 
		WebElement tab=driver.findElement(By.id("j_idt88:j_idt99"));
		tab.sendKeys("testleaf@100");
		tab.sendKeys(Keys.TAB+"tab");
		
		
		//Type about yourself
		driver.findElement(By.id("j_idt88:j_idt101")).sendKeys("optimistic person excited to learn automation");
		
		//Just Press Enter and confirm error message
		driver.findElement(By.id("j_idt106:thisform:age")).sendKeys(Keys.ENTER);
		String error = driver.findElement(By.className("ui-message-error-detail")).getText();
		if(error.contains("Age is mandatory"))
		{
			System.out.println("error message");
		}
		
		//Click and Confirm Label Position Changes
		Point location = driver.findElement(By.xpath("//label[text()='Username']")).getLocation();
		driver.findElement(By.id("j_idt106:float-input")).click();
		Point location1 = driver.findElement(By.xpath("//label[text()='Username']")).getLocation();
		if(!location.equals(location1)) {
			System.out.println("position changed");
		}
		
		//Type your name and choose the third option
		driver.findElement(By.id("j_idt106:auto-complete_input")).sendKeys("Sathya");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@id='j_idt106:auto-complete_panel']//li[3]")).click();
		
		//Type your DOB (mm/dd/yyyy) and confirm date chosen
		driver.findElement(By.id("j_idt106:j_idt116_input")).sendKeys("06/15/2023");
		//String text = driver.findElement(By.xpath("//span[text()='June']")).getText();
		String text2 = driver.findElement(By.xpath("//span[text()='2023']")).getText();
		String text3 = driver.findElement(By.xpath("//a[text()='15']")).getText();
		if(("2023".contains(text2))&&("15".contains(text3)))
		{
			System.out.println("confirmed");
		}
		
		//Type number and spin to confirm value changed
		WebElement number = driver.findElement(By.id("j_idt106:j_idt118_input"));
		number.sendKeys("9");
		driver.findElement(By.xpath("//span[@id='j_idt106:j_idt118']/a")).click();
		String value = number.getText();
		if(!value.equals("9"))
		{
			System.out.println("value changed");
		}
		else {
			System.out.println("value not changed");
		}
		
		//Type random number (1-100) and confirm slider moves correctly
		 driver.findElement(By.id("j_idt106:slider")).sendKeys("50"); 
		 WebElement b14 = driver.findElement(By.xpath("//div[@id='j_idt106:j_idt120']/div"));
		 String style = b14.getAttribute("style"); 
		 System.out.println(style);
		 Thread.sleep(5000);
				 
		//Click and Confirm Keyboard appears
		 driver.findElement(By.id("j_idt106:j_idt122")).click();
	     boolean keyboard = driver.findElement(By.xpath("//div[contains(@class,'shadow keypad-popup')]")).isDisplayed();
	     System.out.println(keyboard);
		 if (keyboard==true)
		 {
			System.out.println("keyboard is displayed");
		 }
	}

}

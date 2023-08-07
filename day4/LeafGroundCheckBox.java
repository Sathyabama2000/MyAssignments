package week3.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGroundCheckBox {

	public static void main(String[] args) throws InterruptedException {
		 //launch the browser
		ChromeDriver driver = new ChromeDriver();
		//load the URL
		driver.get("https://www.leafground.com/checkbox.xhtml");
		
		//Maximize the Browser
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Thread.sleep(5000);
		
		//Basic Checkbox
		driver.findElement(By.xpath("//span[text()='Basic']")).click();
		
		//Notification
		driver.findElement(By.xpath("//span[text()='Ajax']")).click();
		
		// favorite language
		driver.findElement(By.xpath("//label[text()='Java']")).click();
							
		//Tri State Checkbox
		driver.findElement(By.xpath("//*[@id=\"j_idt87:ajaxTriState\"]/div[2]")).click();
				
		//Toggle Switch
		driver.findElement(By.className("ui-toggleswitch-slider")).click();
		
		//Verify if check box is disabled
		boolean checkBox =driver.findElement(By.xpath("//*[@id=\"j_idt87:j_idt102_input\"]")).isEnabled();
		if(checkBox==false)
		{
	    System.out.println("checkbox is disabled");
		}
	   
	    //Select Multiple
		driver.findElement(By.xpath("//ul[@data-label='Cities']")).click();
		driver.findElement(By.xpath( "//*[@id=\"j_idt87:multiple_panel\"]/div[1]/div[1]")).click();
	    driver.findElement(By.xpath("//a[@aria-label='Close']")).click(); 
	    
	    driver.close();

	}

}

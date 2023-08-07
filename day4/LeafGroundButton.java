package week3.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import java.time.Duration;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGroundButton {

	public static void main(String[] args) throws InterruptedException {
		        //launch the browser
				ChromeDriver driver = new ChromeDriver();
				
				//maximize the window
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				
				// Launch  URL
				driver.get("https://www.leafground.com/button.xhtml\r\n");
				
				//Click and Confirm title
				driver.findElement(By.xpath("//span[text()='Click']")).click();
				String title=driver.getTitle();
				if(title.contains("Dashboard"))
				{
					System.out.println("title is verified");
				}
				
				//Confirm if the button is disabled
				driver.navigate().back();
				Boolean button = driver.findElement(By.xpath("//span[text()='Disabled']")).isEnabled();
				if(button)
				{
					System.out.println("button is disabled");
				}
				
				
				//Find the position of the Submit button
				Point location = driver.findElement(By.xpath("(//span[text()='Submit'])[1]")).getLocation();
				System.out.println(location);
				
				//Find the Save button color
				WebElement save=driver.findElement(By.name("j_idt88:j_idt96"));
				String color=save.getCssValue("color");
				System.out.println(color);
				
				//Find the height and width(size) of this button
				Dimension size = driver.findElement(By.xpath("(//span[text()='Submit'])[2]")).getSize();
				System.out.println(size);
				
				//Mouse over and confirm the color changed
				
				WebElement over=driver.findElement(By.xpath("//span[text()='Success']"));
		    	//String color1=over.getAttribute("style");
				String color1=over.getCssValue("background-color");
				//String color1=save.getCssValue("color");
				System.out.println(color1);
				over.click();
								
				WebElement over1=driver.findElement(By.xpath("//span[text()='Success']"));
				//String color2=over1.getAttribute("style");
				String color2=over1.getCssValue("background-color");
				//String color1=save.getCssValue("color");
				System.out.println(color2);
				if(!color1.equals(color2))
				{ 
					System.out.println("color changed");
				 				 
				 }
				
				//Click Image Button and Click on any hidden button
				driver.findElement(By.xpath("//span[text()='Image']")).click();
				driver.findElement(By.name("j_idt88:j_idt96")).click();
				
				//rounded buttons
				driver.findElement(By.xpath("//span[text()='Primary']")).click();
				int count=1;
				driver.findElement(By.xpath("//span[text()='Secondary']")).click();
				count++;
				driver.findElement(By.xpath("(//span[text()='Success'])[2]")).click();
				count++;
				driver.findElement(By.xpath("//span[text()='Info']")).click();
		        count++;
		        System.out.println(count);


	}

}

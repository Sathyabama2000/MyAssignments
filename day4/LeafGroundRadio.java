package week3.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGroundRadio {

	public static void main(String[] args) {
		//launch the browser
		ChromeDriver driver = new ChromeDriver();
		//load the URL
		driver.get("https://www.leafground.com/radio.xhtml");
		//Maximize the Browser
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//favorite browser
		driver.findElement(By.xpath("//label[text()='Chrome']")).click();
		
		//UnSelectable
		driver.findElement(By.xpath("//label[text()='Chennai']")).click();
		driver.findElement(By.xpath("//label[text()='Chennai']")).click();
		boolean selected = driver.findElement(By.xpath("//label[text()='Chennai']")).isSelected();
		if(selected==false)
		{
			System.out.println("selectable and unselectable");
		}
		
		//Find the default select radio button
		WebElement defaultRadio=driver.findElement(By.xpath("//label[text()='Safari']"));
		defaultRadio.click();
		boolean enabled =defaultRadio.isEnabled();
		if(enabled==true)
		{
			System.out.println("safari is the default");
		}
		
		//Select the age group (only if not selected)
		boolean selected2 = driver.findElement(By.xpath("//label[text()='1-20 Years']")).isSelected();
		if(selected2==false)
		{
			System.out.println("it is selected only when not selected");
			driver.findElement(By.xpath("//label[text()='1-20 Years']")).click();
		}
		//driver.close();

	}

}

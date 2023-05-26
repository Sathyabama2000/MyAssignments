package fridaytest;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGroundButton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//launch the browser
		ChromeDriver driver = new ChromeDriver();
		//load the URL
		driver.get("https://www.leafground.com/button.xhtml");
		//Maximize the Browser
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//Click and Confirm title
		driver.findElement(By.className("ui-button-text ui-c")).click();
		String title=driver.getTitle();
		if(title.contains("Dashboard"))
		{
			System.out.println("title is verified");
		}
		//Confirm if the button is disabled
		Boolean button = driver.findElement(By.name("j_idt88:j_idt92")).isEnabled();
		if(button==false)
		{
			System.out.println("button is disabled");
		}

	}

}

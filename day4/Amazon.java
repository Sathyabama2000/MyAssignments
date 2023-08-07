package week3.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		 //launch the browser
		ChromeDriver driver = new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		// Launch  URL
		driver.get(" https://www.amazon.in/");
		
		//Type "Bags" in the Search box
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Bags");
		
		// Choose the item in the result (bags for boys)
		
		driver.findElement(By.xpath("//div[@aria-label='bags for boys']")).click();
		//driver.findElement(By.xpath("//span[text()='for boys']")).click();
		
		// Print the total number of results (like 50000)  1-48 of over 50,000 results for "bags for boys"
	    WebElement result=driver.findElement(By.xpath("//span[text()='1-48 of over 50,000 results for']"));
		String result3=result.getText();
		System.out.println(" the total number of results:" + result3 );
		
		//Select the first 2 brands in the left menu  (like American Tourister, Generic)
		driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[4]")).click();
		driver.findElement(By.xpath("//span[text()='Zipline']")).click();
		
		//Choose New Arrivals (Sort)
		driver.findElement(By.xpath("//span[text()='Last 90 days']")).click();
		
		//Print the first resulting bag info (name, discounted price)
		driver.findElement(By.xpath("//img[@class='s-image']")).click();
		WebElement  bag=driver.findElement(By.tagName("h1"));
		String name=bag.getText();
		WebElement bag1=driver.findElement(By.xpath("//span[@class='a-price-whole']"));
		String name1=bag1.getText();
		System.out.println("name:"+name+"price:"+name1);
	
		// Get the page title 
		String title=driver.getTitle();
		System.out.println(title);
	
		//close the browser
		driver.close();
		

}

	}



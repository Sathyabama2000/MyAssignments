package week3.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Pvr {

	public static void main(String[] args) throws InterruptedException {
		 //launch the browser
		ChromeDriver driver = new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		// Launch  URL
		driver.get("https://www.pvrcinemas.com/");
		
		//Click  on Movie Library
		driver.findElement(By.className("nav-icon")).click();
		
		driver.findElement(By.xpath("//a[text()='Movie Library']")).click();
		//Select the City -->chennai
		WebElement city= driver.findElement(By.name("city"));
		//city.click();
		Select citydd = new Select(city);
		citydd.selectByVisibleText("Chennai");
		//Select the Genre-->Animation
		WebElement genre= driver.findElement(By.name("genre"));
		Select genredd = new Select(genre);
		genredd.selectByVisibleText("ANIMATION");
		
		//Select the Language-->english
		WebElement lang= driver.findElement(By.name("lang"));
		Select langdd = new Select(lang);
		langdd.selectByVisibleText("ENGLISH");
		
		// Click on Apply
		driver.findElement(By.xpath("//button[text()='Apply']")).click();
		
		// Click on first resulting animation movie
		Thread.sleep(30000);
		driver.findElement(By.xpath("//div[text()='Paw Patrol']")).click();
				
		// Click proceed to book
		driver.findElement(By.xpath("//button[text()='Proceed To Book']")).click();
		
		//Enter the all fields  cinema , Name, date, Prefered show time, no of seats, food and beverages,Email and Mobile
		//cinema
		WebElement cinema=driver.findElement(By.name("cinemaName"));
		Select cinemadd = new Select(cinema);
		cinemadd.selectByValue("PVR Heritage RSL ECR Chennai");
		//name
		//input[@name='name']
		driver.findElement(By.name("name")).sendKeys("Sathya");
		//date
		driver.findElement(By.xpath("(//input[@type='text'])[6]")).click();
		driver.findElement(By.xpath("//span[text()='12']")).click();
		//time
		WebElement time=driver.findElement(By.name("timings"));
		Select timedd = new Select(time);
		timedd.selectByVisibleText("03:00 PM - 06:00 PM");
		//seat
		driver.findElement(By.name("noOfTickets")).sendKeys("10");
		//mobile
		driver.findElement(By.xpath("//input[@name='mobile']")).sendKeys("9999998999");
		//email
		driver.findElement(By.name("email")).sendKeys("sathya10@gmail.com");
		//f&b
		WebElement food=driver.findElement(By.name("food"));
		Select fooddd = new Select(food);
		fooddd.selectByVisibleText("No");
		//other
		driver.findElement(By.name("comment")).sendKeys("nothing");
			
		//	 Click on copy to self 
		driver.findElement(By.className("display-block")).click();
		
		//Click on  Send Request
		driver.findElement(By.xpath("//button[text()='SEND REQUEST']")).click();
		
		// Click cancel
		//iver.findElement(By.xpath("//button[text()='CANCEL']")).click();
		driver.findElement(By.xpath("(//button[text()='CANCEL'])[2]")).click();
		// Close the OTP dialog
		
		driver.findElement(By.xpath("//button[text()='×']")).click();
		Thread.sleep(3000);

		//Verify the tile of the page
		String title = "Movie Library";
		System.out.println("title:"+title);
		String title1=driver.getTitle();
		if(title.equals(title1))
		{
			System.out.println("title is verified");
		}
		else
		{
			System.out.println("title is not verified");
		}

		
	}

	}



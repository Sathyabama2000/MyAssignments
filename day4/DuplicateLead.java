package week3.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

	public static void main(String[] args) {
		//launch the browser
		ChromeDriver driver = new ChromeDriver();
		//maximize the window
		driver.manage().window().maximize();
		// Launch  URL
		driver.get("http://leaftaps.com/opentaps/control/main");
	    // Enter UserName 
	    driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
	    // Enter Password 
	    driver.findElement(By.id("password")).sendKeys("crmsfa");
	    // Click on Login Button 
	    driver.findElement(By.className("decorativeSubmit")).click();
	    //Click on CRM/SFA Link
		driver.findElement(By.linkText("CRM/SFA")).click();
		//Click on Leads link
		driver.findElement(By.linkText("Leads")).click();
		//Click on Find leads
		driver.findElement(By.linkText("Find Leads")).click();
		//Click on Email
		driver.findElement(By.xpath("//span[text()='Email']")).click();
		
		//	Enter Email
		 driver.findElement(By.name("emailAddress")).sendKeys("abc@gmail.com");
		
			
		//Capture name of First Resulting lead and Click First Resulting lead 
		
		WebElement firstLead = driver.findElement(By.xpath("(//a[@class='linktext'])[6]"));//stale element exception
			
		// WebElement firstLead = driver.findElement(By.xpath("(//a[contains(@class,'linktext')])"));
		String lead = firstLead.getText();
		firstLead.click();
			
		//Click Duplicate Lead
		driver.findElement(By.xpath("//a[text()='Duplicate Lead']")).click();
		
		//Verify the title as 'Duplicate Lead' 
		String title = driver.getTitle();
		System.out.println(title);
		if( title.contains("Duplicate Lead"))
		{
			System.out.println("title is verified");
		}
		else
		{
			System.out.println("title is not verified");
		}
		//Click Create Lead 
		driver.findElement(By.className("smallSubmit")).click();
		//Confirm the duplicated lead name is same as captured name 
		WebElement leadName = driver.findElement(By.id("viewLead_firstName_sp"));
		String lead1 = leadName.getText();
		if(lead.contains(lead1))
		{
			System.out.println("duplicated lead name is same as captured name");
		}
		else
		{
			System.out.println("duplicated lead name is not same as captured name");
		}
		//Close the browser (Do not log out)
		//driver.close();

	}

}

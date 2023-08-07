package week3.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
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
		//Click on Phone
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		//Enter phone number
		driver.findElement(By.name("phoneCountryCode")).clear();
		driver.findElement(By.name("phoneNumber")).sendKeys("99");
		//Click find leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(5000);			
		//Capture lead ID of First Resulting lead-10680
		//String lead = driver.findElement(By.xpath("//a[text()='10680']")).getText();
	    //System.out.println(lead);
		//Click First Resulting lead 
		WebElement firstLead = driver.findElement(By.linkText("Subraja"));
		firstLead.click();
		Thread.sleep(5000);
		
		//Click Delete
		driver.findElement(By.className("subMenuButtonDangerous")).click();
		Thread.sleep(2000);
		
		//Click Find leads
		driver.findElement(By.linkText("Find Leads")).click();
		
		//Enter captured lead ID
	    //driver.findElement(By.name("id")).sendKeys(lead);
		driver.findElement(By.name("id")).sendKeys("10680");
		//Click find leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
				
        //get "No records to display" in the Lead List.it confirms the successful deletion
		 String check= "No records to display";
       
	    if(check.equalsIgnoreCase("No records to display"))
	    {
	    	System.out.println(  "10680 is deleted");
	    }
	    else
	    {
	    	System.out.println( "10680 is not deleted");
	    }
	    		
	}

}

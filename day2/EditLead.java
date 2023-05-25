package week4.day2;

import org.openqa.selenium.By;
//import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

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
		//Enter first name
		driver.findElement(By.xpath("//input[@id='ext-gen248']")).sendKeys("firstname");
		//Click on Find leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		// Click on first resulting lead
		driver.findElement(By.xpath("//a[text()='Lastname']")).click();
		// Verify title of the page
		String title = driver.getTitle();
		if (title.contains("View Lead | opentaps CRM")) {
			System.out.println("Title is verified");
		} else {
			System.out.println("Title is not verified");
		}
		//Click Edit
		driver.findElement(By.linkText("Edit")).click();
		//Change the company name
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("Testleaf");
		//Click Update
		driver.findElement(By.name("submitButton")).click();
		//Confirm the changed name appears
		WebElement confirm= driver.findElement(By.className("requiredField"));
		WebElement confirm1= driver.findElement(By.id("viewLead_companyName_sp"));
		if(confirm==confirm1)
		{
			System.out.println("changed name appeared successfully");
		}
		//Close the browser (Do not log out)
		driver.close();
		Thread.sleep(3000);
		
	
	}

}

package week3.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

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
				//Click on Leads Button
				driver.findElement(By.linkText("Leads")).click();
				//Click on Create Lead 
				WebElement createLead = driver.findElement(By.linkText("Create Lead"));
				createLead.click();
				//Enter CompanyName Field Using id Locator
			    WebElement companyName = driver.findElement(By.id("createLeadForm_companyName"));
			    // Enter FirstName Field Using id Locator
				WebElement firstName = driver.findElement(By.id("createLeadForm_firstName"));
				firstName.sendKeys("Jyothika");
				//Enter LastName Field Using id Locator
				WebElement lastName = driver.findElement(By.id("createLeadForm_lastName"));
				lastName.sendKeys("Sharma");
				//Enter FirstName(Local) Field Using id Locator
				WebElement firstNameLocal = driver.findElement(By.id("createLeadForm_firstNameLocal"));
				firstNameLocal.sendKeys("sharma");companyName.sendKeys("Testleaf");
				//Enter Department Field Using any Locator of Your Choice
				WebElement department = driver.findElement(By.id("createLeadForm_departmentName"));
				department.sendKeys("Testing");
				//Enter Description Field Using any Locator of your choice 
				WebElement description = driver.findElement(By.name("description"));
				description.sendKeys("Testleaf Software Solutions");
				Thread.sleep(3000);
				//Enter your email in the E-mail address Field using the locator of your choice
				WebElement Email = driver.findElement(By.name("primaryEmail"));
				Email.sendKeys("testleaf100@gmail.com");
				// Select State/Province as NewYork Using Visible Text
				WebElement statedd=driver.findElement(By.name("generalStateProvinceGeoId"));
				Select stateDD=new Select(statedd);
				stateDD.selectByVisibleText("New York");
				Thread.sleep(3000);
				//Click on Create Button
				WebElement createButton = driver.findElement(By.className("smallSubmit"));
			    createButton.click();
			    //Click on edit button
			    driver.findElement(By.linkText("Edit")).click();
			    // Clear the Description Field using .clear()
				WebElement description1 = driver.findElement(By.id("updateLeadForm_description"));
				description1.clear();
			    //Fill ImportantNote Field with Any text
				WebElement impNote = driver.findElement(By.id("updateLeadForm_importantNote"));
				impNote.sendKeys("description field is cleared");
			    //Click on update buttonsubmitButton
				WebElement update = driver.findElement(By.name("submitButton"));
			    update.click();
			    //Get the Title of Resulting Page
			    String title1 = "View Lead | opentaps CRM";
			    String title2=driver.getTitle();
			    if(title1.equals(title2))
			    {
			    	System.out.println("title name displayed successfully");
			    }
			    else
			    {
			    	System.out.println("title name is not displayed successfully");
			    }
                driver.close();
			    
				
	}
}

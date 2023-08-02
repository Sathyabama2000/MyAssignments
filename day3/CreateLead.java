package week3.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	public static void main(String[] args) throws InterruptedException {
		        //launch browser
				ChromeDriver driver = new ChromeDriver();
				//maximize the window
				driver.manage().window().maximize();
				//create URL
				driver.get("http://leaftaps.com/opentaps/");
				// Enter UserName and Password Using Id Locator
				WebElement username = driver.findElement(By.id("username"));
				//Enter password as DemoSalesManager
				username.sendKeys("DemoSalesManager");
				//Locate password field
				WebElement password = driver.findElement(By.id("password"));
				//Enter password as crmsfa
				password.sendKeys("crmsfa");
				//Click on Login Button using Class Locator
				WebElement loginButton = driver.findElement(By.className("decorativeSubmit"));
				loginButton.click();
				//Click on CRM/SFA Link
				WebElement crmsfa = driver.findElement(By.linkText("CRM/SFA"));
				crmsfa.click();
				Thread.sleep(2000);
				// Click on Leads Button
				WebElement leadsTab = driver.findElement(By.linkText("Leads"));
				leadsTab.click();
			    // Click on Create Lead 
				WebElement createLead = driver.findElement(By.linkText("Create Lead"));
				createLead.click();
				//Enter CompanyName Field Using id Locator
				WebElement companyName = driver.findElement(By.id("createLeadForm_companyName"));
				companyName.sendKeys("Testleaf");
				// Enter FirstName Field Using id Locator
				WebElement FirstName = driver.findElement(By.id("createLeadForm_firstName"));
				FirstName.sendKeys("Jyothika");
				//Enter LastName Field Using id Locator
				WebElement LastName = driver.findElement(By.id("createLeadForm_lastName"));
				LastName.sendKeys("Sharma");
				//Enter FirstName(Local) Field Using id Locator
				WebElement FirstNameLocal = driver.findElement(By.id("createLeadForm_firstNameLocal"));
				FirstNameLocal.sendKeys("sharma");
				//Enter Department Field Using any Locator of Your Choice
				WebElement Department = driver.findElement(By.id("createLeadForm_departmentName"));
				Department.sendKeys("Testing");
				//Enter Description Field Using any Locator of your choice 
				WebElement Description = driver.findElement(By.name("description"));
				Description.sendKeys("Testleaf Software Solutions");
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
				//Get the Title of Resulting Page
				String title1 = "Create Lead | opentaps CRM";
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

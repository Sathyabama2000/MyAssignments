package week4.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContact {

	public static void main(String[] args) {
		//launch the browser
		ChromeDriver driver = new ChromeDriver();
		//maximize the window
		driver.manage().window().maximize();
		// Launch  URL
		driver.get("http://leaftaps.com/opentaps/");
		// Enter UserName Using Id Locator
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		// Enter Password Using Id Locator
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		// Click on Login Button using Class Locator
		driver.findElement(By.className("decorativeSubmit")).click();
		//Click on CRM/SFA Link
		driver.findElement(By.linkText("CRM/SFA")).click();
		// Click on contacts Button
		driver.findElement(By.linkText("Contacts")).click();
		//Click on Create Contact
		driver.findElement(By.linkText("Create Contact")).click();
		//Enter FirstName Field Using id Locator
		driver.findElement(By.id("firstNameField")).sendKeys("Anushka");
		//Enter LastName Field Using id Locator
		driver.findElement(By.id("lastNameField")).sendKeys("Sharma");
		// Enter FirstName(Local) Field Using id Locator
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Anu");
		// Enter LastName(Local) Field Using id Locator
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Sharma");
		//Enter Department Field Using any Locator of Your Choice
		driver.findElement(By.name("departmentName")).sendKeys("Testing");
		//Enter Description Field Using any Locator of your choice
		driver.findElement(By.name("description")).sendKeys("Testleaf Software Solutions");
		//Enter your email in the E-mail address Field using the locator of your choice
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("anushkasharma@gmail.com");
		//Select State/Province as NewYork Using Visible Text
		WebElement state = driver.findElement(By.name("generalStateProvinceGeoId"));
		Select state1 = new Select(state);
		state1.selectByVisibleText("New York");
		// Click on Create Contact
		driver.findElement(By.name("submitButton")).click();
		//Click on edit button
		driver.findElement(By.linkText("Edit")).click();
		//Clear the Description Field using .clear
		driver.findElement(By.name("description")).clear();
		//Fill ImportantNote Field with Any text
		driver.findElement(By.name("importantNote")).sendKeys("Fill the details briefly");
		//Click on update button using Xpath locator
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		//Get the Title of Resulting Page
		String Title=driver.getTitle();
		System.out.println("Title of resulting page: "+Title);
		driver.close(); 
		
	}

}

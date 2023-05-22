package week4.day1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

	public static void main(String[] args) throws InterruptedException {
	
		//launch browser
		ChromeDriver driver = new ChromeDriver();
		//maximize the window
		driver.manage().window().maximize();
		//create URL
		driver.get("http://leaftaps.com/opentaps/");
		// Locate username field
		WebElement username = driver.findElement(By.id("username"));
		//Enter password as DemoSalesManager
		username.sendKeys("DemoSalesManager");
		//Locate password field
		WebElement password = driver.findElement(By.id("password"));
		//Enter password as crmsfa
		password.sendKeys("crmsfa");
		//Click on the Login button
		WebElement loginButton = driver.findElement(By.className("decorativeSubmit"));
		loginButton.click();
		// Click on the crmsfa link
		WebElement crmsfa = driver.findElement(By.linkText("CRM/SFA"));
		crmsfa.click();
		// Click on the leads tab
		WebElement leadsTab = driver.findElement(By.linkText("Leads"));
		leadsTab.click();
		//Click on the create lead 
		WebElement createLead = driver.findElement(By.linkText("Create Lead"));
		createLead.click();
		//Enter companyName as TestLeaf
		WebElement companyName = driver.findElement(By.id("createLeadForm_companyName"));
		companyName.sendKeys("Testleaf");
		//Enter first name
		WebElement FirstName = driver.findElement(By.id("createLeadForm_firstName"));
		FirstName.sendKeys("Anushka");
		//Enter last name
		WebElement LastName = driver.findElement(By.id("createLeadForm_lastName"));
		LastName.sendKeys("Sharma");
		//Enter FirstName(Local)
		WebElement FirstNameLocal = driver.findElement(By.id("createLeadForm_firstNameLocal"));
		FirstNameLocal.sendKeys("Anu");
		//Enter Department field
		WebElement Department = driver.findElement(By.id("createLeadForm_departmentName"));
		Department.sendKeys("Testing");
		Thread.sleep(5000);
	    //Enter Description
		WebElement Description = driver.findElement(By.name("description"));
		Description.sendKeys("Testleaf Software Solutions");
		//Enter the E-mail
		WebElement Email = driver.findElement(By.name("primaryEmail"));
		Email.sendKeys("testleaf100@gmail.com");
		//click on create button
		WebElement createButton = driver.findElement(By.className("x-btn-text"));
		createButton.click();
		Thread.sleep(5000);
		//close the browser
		driver.close();
		
		
		

	}

}

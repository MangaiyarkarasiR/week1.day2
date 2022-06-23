package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead 
{
public static void main(String[] args) 
{
	WebDriverManager.chromedriver().setup();
//	open the browser
	ChromeDriver driver=new ChromeDriver();
//	Maximise the browser window
	driver.manage().window().maximize();
//	Load the URL
	driver.get("http://leaftaps.com/opentaps/control/login");
//	enter the user name using id locator
WebElement findUserNameElement = driver.findElement(By.id("username"));
findUserNameElement.sendKeys("Demosalesmanager");	

//enter the password using id locator

WebElement findPasswordElement = driver.findElement(By.id("password"));
findPasswordElement.sendKeys("crmsfa");	

//Click on Login Button Class Locator

WebElement loginButton = driver.findElement(By.className("decorativeSubmit"));
loginButton.click();

//Click on CRMSFA using Link text

WebElement crmsfaElement = driver.findElement(By.linkText("CRM/SFA"));
crmsfaElement.click();

//Click on Leads Button Using Link Text

WebElement leadsElement = driver.findElement(By.linkText("Leads"));
leadsElement.click();

//Click on Create Lead Button Using Link Text

WebElement createLeadElement = driver.findElement(By.linkText("Create Lead"));
createLeadElement.click();

//Enter the Company Name using id Locator

WebElement companyNameElement = driver.findElement(By.id("createLeadForm_companyName"));
companyNameElement.sendKeys("Mepco");

//Enter the First Name using id Locator

WebElement firstNameElement = driver.findElement(By.id("createLeadForm_firstName"));
firstNameElement.sendKeys("Mangai");

//Enter the Last Name using id Locator

WebElement lastNameElement = driver.findElement(By.id("createLeadForm_lastName"));
lastNameElement.sendKeys("Madhan");

//Enter the First name Local using id Locator

WebElement firstNameLocalElement = driver.findElement(By.id("createLeadForm_firstNameLocal"));
firstNameLocalElement.sendKeys("R");

//Enter the Department Name  using Class Locator

WebElement departmentElement = driver.findElement(By.id("createLeadForm_departmentName"));
departmentElement.sendKeys("Admin");

//Enter the description using 

WebElement descriptionElement = driver.findElement(By.id("createLeadForm_description"));
descriptionElement.sendKeys("Test Leaf admin"); 

//enter email address using id locator

WebElement emailElement = driver.findElement(By.id("createLeadForm_primaryEmail"));
emailElement.sendKeys("mangai.raj93@gmail.com");

//select state  as New York by visible test

WebElement sourceDropdownElement = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
Select state=new Select(sourceDropdownElement);
state.selectByVisibleText("New York");  

//Click on create Lead button using className locator

WebElement createLeadButton = driver.findElement(By.className("smallSubmit"));
createLeadButton.click();

//Get the Title of the resulting page

String title =driver.getTitle();
System.out.println(title);

//Click on Edit Button

 WebElement EditButton = driver.findElement(By.linkText("Edit"));
 EditButton.click();
 
 WebElement clearDescritption = driver.findElement(By.id("updateLeadForm_description"));
 
 clearDescritption.clear();

 
// Enter Any text to Important Note filed

 WebElement importantNoteField = driver.findElement(By.id("updateLeadForm_importantNote"));
 importantNoteField.sendKeys("Primary Email Is Mandatory"); 
 
// Click on Update Button
 WebElement updateButton = driver.findElement(By.className("smallSubmit"));
 updateButton.click();

// Get the Title of the resulting page 
 String title2 =driver.getTitle();
 System.out.println(title2);
 
}
}

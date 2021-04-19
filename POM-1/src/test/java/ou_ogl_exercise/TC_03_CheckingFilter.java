package ou_ogl_exercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TC_03_CheckingFilter {
	WebDriver driver;
	 
	 //Constructor 
	 public TC_03_CheckingFilter(WebDriver driver) {
	  this.driver=driver;
	 }
	 
	 //Locator for Categories
	 By CategoryImage = By.xpath("//div[text()='Categories']");
	 	 
	 //Locator for Checkboxes(Databases,BaseImage)-Categories
	 By BaseImage=By.xpath("//input[@type='checkbox' and @value='base']");
	 By Database=By.xpath("//input[@type='checkbox' and @value='database']");
	 
	 //To verify BaseImage is clicked from categories checkbox and displayed
		 
	 public void verifyBaseImage() {
	        boolean baseimg=driver.findElement(CategoryImage).isDisplayed();
			driver.findElement(BaseImage).click();
		    System.out.println("The base image is verified and is present in home page"+ " "+baseimg);
		 }
	 
	//To verify Database is clicked from categories checkbox and displayed
	 public void verifyDataBase() {
		    boolean db=driver.findElement(CategoryImage).isDisplayed();
			driver.findElement(Database).click();
		    System.out.println("The database checkbox is present in home page"+ " "+db);
		    System.out.println("-------------------------------------------------------");
		
		 }
}

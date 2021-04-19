package ou_ogl_exercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TC_01_1c_CategoryVerify {
	WebDriver driver;
	 
	 //Constructor 
	 public TC_01_1c_CategoryVerify(WebDriver driver) {
	 
	 this.driver=driver;
	 }
	 
	 //Locator for Categories
	 By CategoryImage = By.xpath("//div[text()='Categories']");
	 
	 
	 //Locator for Checkboxes-Categories
	 By Analytics=By.xpath("//input[@type='checkbox' and @value='analytics']");
	 By BaseImage=By.xpath("//input[@type='checkbox' and @value='base']");
	 By Database=By.xpath("//input[@type='checkbox' and @value='database']");
	 By Storage=By.xpath("//input[@type='checkbox' and @value='storage']");
	 
	 
	 
		 //Methods to verify all the checkbox is present under categories
	 public void verifyCategories() {
		boolean ctg=driver.findElement(CategoryImage).isDisplayed();
		if(ctg==true)
	System.out.println("The category tab displayed in login page of docker ");
	 }
	 public void verifyAnalytics() {
			boolean analytics=driver.findElement(CategoryImage).isDisplayed();
			if(analytics==true)
			{
		System.out.println("The verified Analytics checkbox is present in login page of docker ");
		 }
	 }
	 public void verifyBaseImage() {
			boolean baseimg=driver.findElement(CategoryImage).isDisplayed();
			if(baseimg==true)
			{
		System.out.println("The base image is verified and is present in home page");
		 }
	 }
	 public void verifyDataBase() {
		 
			boolean db=driver.findElement(CategoryImage).isDisplayed();
			if(db==true)
		System.out.println("The database checkbox is present in home page");
		 }
	 public void verifyStorage() {
			boolean storage=driver.findElement(CategoryImage).isDisplayed();
			if(storage==true)
		System.out.println("The storage checkbox is present in home page");
		System.out.println("--------------------------------------------------------");
		 }

}

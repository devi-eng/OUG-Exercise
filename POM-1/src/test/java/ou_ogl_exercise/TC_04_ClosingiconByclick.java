package ou_ogl_exercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TC_04_ClosingiconByclick {
	WebDriver driver;
	 
	 //Constructor 
	     public TC_04_ClosingiconByclick(WebDriver driver) {
	 	 this.driver=driver;	
	 	 }
	 		 
	 //Locator for Closing the Database icon
	  By closingIcon=By.xpath("//div[text()='Databases']");
	
	  //Method to close Database from pane and to verify unselected in checkbox
	 public void closeIconandVerifying() throws InterruptedException
	 {
		            Thread.sleep(2000);
					driver.findElement(closingIcon).click();
			        boolean closeclick=driver.findElement(closingIcon).isSelected();
		            System.out.println("The database icon is closed by clicking and it is not enabled hence false matches"+" "+closeclick);
		            System.out.println("-------------------------------------------------------------------------------------------");
		 }
	 }



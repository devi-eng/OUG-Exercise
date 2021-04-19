/**
 * 
 */
package ou_ogl_exercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author Devi 
 * Exercise 1B, to verify whether two checkbox is present under Images
 *
 */
public class TC_01_1b_DockerImageVerify {
	
	WebDriver driver;
	 
	 //Constructor 
	 public TC_01_1b_DockerImageVerify(WebDriver driver) {
	 
	 this.driver=driver;
	 }
	 
	 //Locator for Images
	 By ContainerImage = By.xpath("//div[text()='Images']");
	 
	 //Locator for Checkboxes
	 By VerifiedPublisher=By.xpath("//input[@type='checkbox' and @value='store']");
	 By officialImages=By.xpath("//input[@type='checkbox' and @value='official']");
	 
	 //Method to verify 2 checkbox(VerifiedPublisher,OfficialImages) under Images 
	 public void verifyImage() {
		boolean i=driver.findElement(ContainerImage).isDisplayed();
	System.out.println("The image tab displayed in login page of docker "+i);
	 }
	 public void verifyVerifiedPublisher() {
			boolean pub=driver.findElement(ContainerImage).isDisplayed();
		System.out.println("The verified publisher checkbox displayed in login page of docker "+ pub);
		 }
	 public void verifyOfficialImages() {
			boolean off=driver.findElement(ContainerImage).isDisplayed();
		System.out.println("The official Images checkbox displayed in login page of docker "+ off);
		System.out.println("--------------------------------------------------------");
		 
		 }
}

	 



package ou_ogl_exercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TC_02_ClickVerifiedPublisher {

	WebDriver driver;
	 
	 //Constructor that will be automatically called as soon as the object of the class is created
	 public TC_02_ClickVerifiedPublisher(WebDriver driver) {
	 
	 this.driver=driver;
	 }
	 
	 //Locator for Image
	 By ContainerImage = By.xpath("//div[text()='Images']");
	 
	 //Locator for Checkboxes
	 
	 By VerifiedPublisher=By.xpath("//input[@type='checkbox' and @value='store']");
		
	 
	By textdisplaywhenClick=By.xpath("//*[@class='dChip styles__chip___3ZtYi styles__clickable___1fzXr styles__withIcon___2uxjQ styles__closeFilter___1OZwH']");
	 
	
	
	 //Method to click VerifiedPublisher
	
	 public void verifyVerifiedPublisher() 
	 {
		boolean pub=driver.findElement(ContainerImage).isDisplayed();
		
		if(pub=true)
		{
			System.out.println("The verified publisher checkbox displayed in login page of docker ");	
		}
		driver.findElement(VerifiedPublisher).click();
	 } 
		
			
	 public void displayWhenClick()
	 {
		boolean whenclick=driver.findElement(textdisplaywhenClick).isDisplayed();
		
		if(whenclick=true)
		{
		System.out.println("When clicked verified publisher the content publisher gets displayed on the top of the pane");
		
		System.out.println("-----------------------------------------------------------------------------------");
	 }
	 }
}

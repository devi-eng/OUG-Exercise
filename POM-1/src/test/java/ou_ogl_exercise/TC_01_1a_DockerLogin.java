package ou_ogl_exercise;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TC_01_1a_DockerLogin {
	  
		WebDriver driver;
				 
		 //Constructor 
		 public TC_01_1a_DockerLogin(WebDriver driver) {
		 this.driver=driver;
		 }
		 //Locator for Container		 
		 By ContainerClickBtn = By.xpath("//button[text()='Containers']");
		 
		 
		 //Method to click login button
		 public void clickLogin() {
		driver.findElement(ContainerClickBtn).click();
		
			String urlobtained="https://hub.docker.com/search?type=image";
			System.out.println("The given url is to check whether it landed in the container is"+urlobtained);
			String currenturl = driver.getCurrentUrl();
			System.out.println("the container name landed is"+ currenturl);
			Assert.assertEquals(urlobtained, currenturl);
 		    boolean e=driver.findElement(ContainerClickBtn).isDisplayed();
		    System.out.println("The container tab displayed in login page of docker "+e);
		    System.out.println("--------------------------------------------------------");
		 			 
		    
		 }
}

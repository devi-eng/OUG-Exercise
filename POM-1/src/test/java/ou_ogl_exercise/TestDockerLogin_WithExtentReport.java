package ou_ogl_exercise;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;


public class TestDockerLogin_WithExtentReport {
	ExtentHtmlReporter htmlReporter;
	   ExtentReports extent;
	   ExtentTest test ;
	   WebDriver driver;
	   
	   @BeforeSuite
		public void setup()
		{
		 htmlReporter = new ExtentHtmlReporter("./Reports/extent-new.html");
		 htmlReporter.config().setTheme(Theme.DARK);
		    
	     // create ExtentReports and attach reporter(s)
	     extent = new ExtentReports();
	     extent.attachReporter(htmlReporter);	
	     driver=new ChromeDriver();
	      
		}
    @Test(priority = 1)
    public void testMethodForExercise1a() throws InterruptedException, IOException
    {
    	 test = extent.createTest("Automated-Report-TC_1a", "Report Generation for HubDocker ");	
    	 driver=new ChromeDriver();
    	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	 driver.get("https://hub.docker.com/search"); 
	 //Creating object and accessing method for Verifying landing in container tab in home page
	 TC_01_1a_DockerLogin lp = new TC_01_1a_DockerLogin(driver);
	 lp.clickLogin();
	 test.pass("Page landed in container tab");
	// log with snapshot
     test.pass("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
     
     // test with snapshot
     test.addScreenCaptureFromPath("screenshot.png");
    }
    
  //Creating object of home page and verifying the image and under that 2 checkbox availability
    
    @Test(priority = 2)
    public void testMethodForExercise1b() throws InterruptedException
    {
    	test = extent.createTest("Automated-Report-TC_1b", "Report Generation for HubDocker ");	
    	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	 driver.get("https://hub.docker.com/search");
    	TC_01_1b_DockerImageVerify img = new TC_01_1b_DockerImageVerify(driver);
		 img.verifyImage();
		 img.verifyVerifiedPublisher();
		 img.verifyOfficialImages();
		 test.pass("Image is been verified and under that two tab verifiedPublisher and verifyOfficialImage is been displayed");
    }

    //Creating object of home page and verifying the checkboxes present under Categories 
    @Test(priority =3)
    public void testMethodForExercise1c() throws InterruptedException
    {
    	test = extent.createTest("Automated-Report-for exercise-TC_1c", "Report Generation for HubDocker ");	
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://hub.docker.com/search");
        TC_01_1c_CategoryVerify cv=new TC_01_1c_CategoryVerify(driver);
		 cv.verifyCategories();
		 cv.verifyAnalytics();
		 cv.verifyBaseImage();
		 cv.verifyDataBase();
		 cv.verifyStorage();
		 test.pass("Category is been verified and under that analytics,BaseImage,DataBases,Storage is been displayed");
    }
    
  //Exercise 2 -to verify the verified publisher by clicking and the verified publisher tab is displayed in filter
    
    @Test(priority =4)
    public void testMethodForExercise2() throws InterruptedException
    {
    	test = extent.createTest("Automated-Report-exercise-TC_02", "Report Generation for HubDocker ");	
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	driver.get("https://hub.docker.com/search"); 
    	TC_02_ClickVerifiedPublisher cvp = new TC_02_ClickVerifiedPublisher(driver);
		 cvp.verifyVerifiedPublisher();
		 Thread.sleep(3000);
		 cvp.displayWhenClick();
		 test.pass("VerifiedPublisher is clicked and verified that Publisher Content is displayed on pane");
    }
    
  //Exercise3-To verify additional filters are added along with publisher content
    
    @Test(priority =5)
    public void testMethodForExercise3() throws InterruptedException
    {
    	test = extent.createTest("Automated-Report-exercise-TC_03 ", "Report Generation for HubDocker ");	
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	driver.get("https://hub.docker.com/search"); 
    	 //Creating object of home page class
   	   //TC_02_ClickVerifiedPublisher cvp = new TC_02_ClickVerifiedPublisher(driver);
   	   //cvp.verifyVerifiedPublisher();
   	   //cvp.displayWhenClick();
   	   TC_03_CheckingFilter cf=new TC_03_CheckingFilter(driver);
	   cf.verifyBaseImage();
	   cf.verifyDataBase();
	   test.pass("Clicked BaseImage and DataBases and verified the additional filters are displayed on the pane");
    }
		//Exercise4-Closing and verifying whether checkbox is unchecked
    
    @Test(priority =6)
    public void testMethodForExercise4() throws InterruptedException
    {
    	test = extent.createTest("Automated-Report-exercise-TC_04", "Report Generation for HubDocker ");	
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	driver.get("https://hub.docker.com/search"); 
    	
    	TC_02_ClickVerifiedPublisher cvp = new TC_02_ClickVerifiedPublisher(driver);
       	 cvp.verifyVerifiedPublisher();
       	 cvp.displayWhenClick();
         TC_03_CheckingFilter cf=new TC_03_CheckingFilter(driver);
         cf.verifyBaseImage();
    	 cf.verifyDataBase();
    	 
    	 TC_04_ClosingiconByclick cc=new TC_04_ClosingiconByclick(driver);
		 cc.closeIconandVerifying();
		 test.pass("By clicking the close icon of the DataBases and verified the checkbox is also unchecked");
		 			      
	}
	 
    @AfterSuite
	public void tearDown()
	{
		extent.flush();	
		//driver.close();
	}
   
}


	



package test;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.LoginPage;

public class TestNg1 {
	private WebDriver driver;
	
	@Parameters("browser")	
    @BeforeTest
    public void openBrowser(String browserName) {
    	System.out.println(browserName);
    	
    	if(browserName.equals("Chrome"))
    	{
    		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sayali Patil\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
    		ChromeOptions options = new ChromeOptions();
            options.addArguments("--remote-allow-origins=*");
    	    driver = new ChromeDriver(options); 
    	}
    	
    	if(browserName.equals("Firefox"))
    	{
    		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Sayali Patil\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
    		
    	    driver = new FirefoxDriver(); 
	}
    	
    	
	}
	
	
	@BeforeClass
	public void openBrowser() {
		System.out.println("Before class");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sayali Patil\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
	    driver = new ChromeDriver(options);  //launch the browser
	   
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@BeforeMethod
	public void openmessenger() {
		System.out.println("Before Method");
		driver.get("https://www.facebook.com/");
		//LoginPage loginpage = new LoginPage(driver);
	    //loginpage.sendUserName();
	    
	    LoginPage loginpage1 = new LoginPage(driver);
	    loginpage1.messengerClick();
		
	}
	
	@Test  
	public void verifyurl() {
		System.out.println("test");
	    System.out.println(driver.getCurrentUrl());

	}
	
	@AfterMethod
	public void logoutform() {
		System.out.println("After Method");
		System.out.println("LOGOUT");
		
	}
	
	@AfterClass
	public void closeform() {
		System.out.println("After Method");
		driver.close();
	}
	
	
	}

    
    







































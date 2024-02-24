package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import pages.LoginPage;


public class TestClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sayali Patil\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
	    WebDriver driver = new ChromeDriver(options);  //launch the browser
	    driver.get("https://www.facebook.com/");
	    
	   
	    
	    LoginPage loginpage = new LoginPage(driver);
	    loginpage.messengerClick();
	    
	    
	    
	    
	    System.out.println(driver.getCurrentUrl());

	}

}





























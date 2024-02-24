package pages;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Actions;
public class LoginPage {

	
//Declaration
	@FindBy (xpath="//input[@id='email']")private WebElement username;
	
	@FindBy (xpath="//input[@id='pass']")private WebElement password;
		
	@FindBy (xpath="//button[text()='Log in']")private WebElement login;
	
	@FindBy (xpath="//a[text()='Create new account']")private WebElement createNewAccount;
	
	@FindBy (xpath="//a[text()='Messenger']")private WebElement messengerLink;
	
//Initialization
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
//use
	
	public void sendUserName() {
		username.sendKeys("Sayali@gmail.com");
	}
	
	public void sendPassword() {
		password.sendKeys("12345");
	}
		
	public void loginButton() {
		login.click();
	}
	
	public void CreateAccount() {
		createNewAccount.click();
	}
	
	public void messengerClick() {
		messengerLink.click();
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}



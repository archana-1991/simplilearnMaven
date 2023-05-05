package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testcases.BaseClass;

public class LoginPage {
	
	WebDriver pageDriver;
	//======================objects==========================
	
	@FindBy(linkText="Log in")
	WebElement LoginLink;
	
	@FindBy(name="user_login")
	WebElement username;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(className="rememberMe")
	WebElement RemberMe;
	
	
	 @FindBy(name="btn_login")
	 WebElement loginBtn;
	 
	
	//=======================methods=======================
	 
	public LoginPage(WebDriver driver) {
		
		pageDriver = driver;
		PageFactory.initElements(pageDriver,this);
		
	}


	public void LoginFunction(String UserNameVal,String PwdVal ) {
		//Step-3 Click on the login link on right top
		//WebElement title=driver.findElement(By.tagName("title"));

		
		//WebElement LoginLink=driver.findElement(By.linkText("Log in"));
	    LoginLink.click();
		
		//step-4 Enter the user name
		//WebElement username=driver.findElement(By.name("user_login"));
		username.sendKeys(UserNameVal);			
				
		//step-5 Enter the password
	   //WebElement password=driver.findElement(By.id("password"));
	    password.sendKeys(PwdVal);
	    
		//Step-6 Click on remember me check box
	    //WebElement RemberMe=driver.findElement(By.className("rememberMe"));
	    RemberMe.click()	;    
	    
		//step-7Click on the login button
		//WebElement loginBtn=driver.findElement(By.name("btn_login"));
		loginBtn.click();

	}
}

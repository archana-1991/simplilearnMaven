package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Recordset;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.LoginPage;

public class LoginTest extends BaseClass {
	@Test
	public void test1() throws InterruptedException {
		
		LoginPage login=new LoginPage(driver);
		Thread.sleep(3000);
		login.LoginFunction("abc@xyz.com","Abcd@1234");
        Thread.sleep(3000);
		WebElement error=driver.findElement(By.id("msg_box"));
		
		String ActError=error.getText();
		String ExpError="The email or password you have entered is invalid.";
		Assert.assertEquals(ActError,ExpError);
				
				}
	@Test
	public void test2() {
		LoginPage login=new LoginPage(driver);
		login.LoginFunction("pqr@xyz.com","Abcd@1234");
	}
	@Test
	public void test4() throws FilloException {
		
   	Recordset recordset=connection.executeQuery("Select * from data where TestName='test4'");
	recordset.next();
		 	
		String Username=recordset.getField("Username");
		String Password=recordset.getField("Password");
		
		LoginPage login=new LoginPage(driver);
		login.LoginFunction(Username,Password);
	}
	
}

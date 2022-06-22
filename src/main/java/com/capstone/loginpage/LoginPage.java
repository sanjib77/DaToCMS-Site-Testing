package com.capstone.loginpage;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.capstone.browserfactory.BrowserFactory;

public class LoginPage extends BrowserFactory {
	
	@FindBy(xpath="//*[@id=\"email\"]")
	WebElement email;
	
	@FindBy(xpath="//*[@id=\"password\"]")
	WebElement password;
	
	@FindBy(xpath="//*[@id=\"app\"]/div/div[1]/div/div[3]/div/div/div[2]/form/div[3]/button")
	WebElement loginbutton;
	
	@FindBy(xpath="//*[@id=\"app\"]/div/div[1]/div/div[3]/div/div/div[3]/p[1]/a")
	WebElement resetpassword;
	
	@FindBy(xpath="//*[@id=\"app\"]/div/div[1]/div/div[1]/a")
	WebElement datocmslink;
	
	@FindBy(xpath="//*[@id=\"field--email\"]/div/span")
	WebElement invalidemail;
	
	@FindBy(xpath="//*[@id=\"app\"]/div/div[1]/div/div[3]/div/div/div[2]/form/div[1]/span")
	WebElement invalidCredentials;
	
	@FindBy(xpath="//*[@id=\"field--password\"]/div/span")
	WebElement fieldRequired;
	
	@FindBy(xpath="//*[@id=\"app\"]/div/div[1]/div/div[3]/div/div/div[1]")
	WebElement forgotpassMsg;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void close() {
		driver.close();
	}
	
	public void enteremail(String msg) {
		this.email.sendKeys(msg);
	}
	
	public void enterpassword(String pass) {
		this.password.sendKeys(pass);
	}
	
	public void clicklogin() {
		this.loginbutton.click();
	}
	
	public void clickreset() {
		this.resetpassword.click();
	}
	
	public void clickdatocms() {
		String originalWindow = driver.getWindowHandle();
		assert driver.getWindowHandles().size() == 1;
		this.datocmslink.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		for (String windowHandle : driver.getWindowHandles()) {
		    if(!originalWindow.contentEquals(windowHandle)) {
		        driver.switchTo().window(windowHandle);
		        break;
		    }
		}
		
	}
	public String invalidemail() {
		return this.invalidemail.getText();
	}
	public String invalidcredentials() {
		return this.invalidCredentials.getText();
	}
	public String fieldrequired() {
		return this.fieldRequired.getText();
	}
	
	public boolean forgotpassMsg() {
		return this.forgotpassMsg.isDisplayed();
	}
	

}

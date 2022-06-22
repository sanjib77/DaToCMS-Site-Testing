package com.capstone.homepage;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.capstone.browserfactory.BrowserFactory;

public class Homepage extends BrowserFactory {
	
	@FindBy(xpath="//span[contains(text(),'Log in')]")
	WebElement loginbutton;
	
	@FindBy(xpath="//a[contains(text(),'Try for free!')]")
	WebElement tryforfreebutton;
	
	@FindBy(xpath="//button[contains(text(),'Subscribe!')]")
	WebElement subscribebutton;
	
	@FindBy(xpath="//body[1]/div[1]/div[2]/div[6]/div[1]/a[1]")
	WebElement ele1;
	
	@FindBy(xpath="//body[1]/div[1]/div[2]/div[6]/div[2]/div[1]/div[1]/div[2]/div[1]")
	WebElement msg;
	
	@FindBy(xpath="//body/div[@id='__next']/div[2]/div[5]/div[12]/div[1]/div[1]/a[2]")
	WebElement ele2;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div[5]/div[12]/div/div/a[2]/div[2]")
	WebElement readstorylink;
	
	@FindBy(xpath="//body/div[@id='__next']/div[2]/div[5]/div[3]/div[1]/div[1]/div[2]")
	WebElement image;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div[1]/div/div/div[2]/a[2]")
	WebElement clickcontactsales;
	
	
	
	public Homepage() {
		PageFactory.initElements(driver, this);
	}
	
	public void clicklogin() {
		loginbutton.click();
	}
	
	public void clicktryforfree() {
		tryforfreebutton.click();
	}
	
	public void clicksubscribe() {
		Scrolltoelement(ele1);
		subscribebutton.click();
	}
	public boolean msgdisplay() {
		return msg.isDisplayed();
	}
	public void readstorylink() {
		Scrolltoelement(ele2);
		readstorylink.click();
	}
	
	public void scrolltoimage() {
		Scrolltoelement(image);
	}

	public boolean imagedisplayed() {
		return image.isDisplayed();
	}
	
	public void Scrolltoelement(WebElement ele) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", ele);
	}
	
	public void clickcontactsales() {
		this.clickcontactsales.click();
	}
	
	public void close() {
		driver.close();
	}

}

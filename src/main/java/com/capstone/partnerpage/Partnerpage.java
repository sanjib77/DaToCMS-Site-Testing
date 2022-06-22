package com.capstone.partnerpage;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.capstone.browserfactory.BrowserFactory;

public class Partnerpage extends BrowserFactory {
	
	@FindBy (xpath= "/html/body/div[1]/div[2]/div[1]/div/div/div[1]/a")
	private WebElement partner;
	@FindBy (xpath= "/html/body/div[1]/div[2]/div[3]/div[5]/a[1]/div[1]/img")
	private WebElement rotate;
	@FindBy (xpath= "/html/body/div[1]/div[2]/div[3]/div[5]/a[2]/div[1]/img")
	private WebElement creativo;
	@FindBy (xpath= "/html/body/div[1]/div[2]/div[3]/div[5]/a[3]/div[1]/img")
	private WebElement spehler;
	@FindBy (xpath= "/html/body/div[1]/div[2]/div[3]/div[5]/a[4]/div[1]")
	private WebElement trampholin;
	@FindBy (xpath= "/html/body/div[1]/div[2]/div[3]/div[5]/a[5]/div[1]/img")
	private WebElement goDigital;
	@FindBy (xpath= "/html/body/div[1]/div[2]/div[3]/div/div[2]/p")
	private WebElement rotate_msg;
	@FindBy (xpath= "/html/body/div[1]/div[2]/div[3]/div/div[2]/p")
	private WebElement creativo_msg;
	@FindBy (xpath= "/html/body/div[1]/div[2]/div[3]/div/div[2]/p")
	private WebElement spehler_msg;
	@FindBy (xpath= "/html/body/div[1]/div[2]/div[3]/div/div[2]/p")
	private WebElement trampholin_msg;
	@FindBy (xpath= "/html/body/div[1]/div[2]/div[3]/div/div[2]/p")
	private WebElement goDigital_msg;
	
	
	
	public Partnerpage() {
		PageFactory.initElements(driver, this);
	}
	

	public void partner_link() {
		this.partner.click();
	}
	
	public void rotate_link() {
		this.rotate.click();
	}
	public boolean rotate_msg() {
		return rotate_msg.isDisplayed();
		
	}
	public void creativo_link() {
		this.creativo.click();
	}
	public boolean creativo_msg() {
		return creativo_msg.isDisplayed();
		
	}
	public void spehler_link() {
		this.spehler.click();
	}
	public boolean spehler_msg() {
		return spehler_msg.isDisplayed();
		
	}
	public void trampholin_link() {
		this.trampholin.click();
	}
	public boolean trampholin_msg() {
		return trampholin_msg.isDisplayed();
		
	}
	public void goDigital_link() {
		this.goDigital.click();
	}
	public boolean goDigital_msg() {
		return goDigital_msg.isDisplayed();
		
	}
	
	public void close() {
		driver.close();
	}
	
	
}

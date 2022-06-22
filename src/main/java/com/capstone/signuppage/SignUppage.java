package com.capstone.signuppage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.capstone.browserfactory.BrowserFactory;

public class SignUppage extends BrowserFactory {
	@FindBy (name= "firstName")
	private WebElement firstName;
	
	@FindBy (name= "lastName")
	private WebElement lastName;
	
	@FindBy (name= "email")
	private WebElement email;
	
	@FindBy (name= "company")
	private WebElement company;
	
	@FindBy (name= "password")
	private WebElement password;
	
	@FindBy (name= "acceptTos")
	private WebElement accept;
	
	@FindBy (xpath= "/html/body/div/div/div[1]/div/div[3]/div/div/div[2]/form/div[5]/button")
	private WebElement signUp;
	
	@FindBy (xpath= "//div[@class='Form__error']//span")
	private WebElement fieldIsRequired;
	
	@FindBy (xpath= "//div[@class='Form__error']//span")
	private WebElement fieldchecked;
	
	@FindBy (xpath= "/html/body/div/div/div[1]/div/div[3]/div/div/div[2]/form/div[2]/div/div[1]/div/div/span")
	private WebElement emailNotValid;
	
	@FindBy (xpath= "/html/body/div/div/div[1]/div/div[3]/div/div/div[3]/p/a")
	private WebElement login;
	
	@FindBy (xpath= "/html/body/div/div/div[1]/div/div[3]/div/div/div[2]/form/div[3]/button")
	private WebElement loginButtonn;
	
	public SignUppage() {
		PageFactory.initElements(driver, this);
	}
	

	public String getTitle() {
		return driver.getTitle();
	}
	
	public void firstName(String fname) {
		this.firstName.sendKeys(fname);
	}
	public void lastName(String lname) {
		this.lastName.sendKeys(lname);
	}
	public void email(String email) {
		this.email.sendKeys(email);
	}
	public void company(String company) {
		this.company.sendKeys(company);
	}
	public void password(String password) {
		this.password.sendKeys(password);
	}
	public void signUp() {
		this.signUp.click();
	}
	public void login() {
		this.login.click();
	}
	public void accept() {
		this.accept.click();
	}
	public String loginButtonn() {
		return this.loginButtonn.getText();
	}
	public String fieldIsRequired() {
		return this.fieldIsRequired.getText();
	}
	public String fieldchecked() {
		return this.fieldchecked.getText();
	}
	public String emailNotValid() {
		return this.emailNotValid.getText();
	}
	

	public void refresh() {
		driver.navigate().refresh();
	}
	public void close() {
		driver.close();
	}
	
	public void fieldIsRequiredtest() {
		firstName("Radhika");
		lastName("Neerudi");
		email("radhikaneerudi21@gmail.com");
		company("wipro");
		signUp();
		
	}

	
	public void fieldcheckedtest() {
		refresh();
		firstName("Manoj");
		lastName("Yadav");
		email("manojyadav@gmail.com");
		company("wipro");
		password("manoj7894");
		signUp();
		
		
	}
	
	public void emailNotValidtest() {
		refresh();
		firstName("Sanjib");
		lastName("Chakraborty");
		email("sanjibc197");
		company("wipro");
		password("sanjib777@");
		accept();
		signUp();
		
	}
	
	public void signUptest() {
		driver.navigate().refresh();
		firstName("Rohit");
		lastName("Mishra");
		email("rohitmishra");
		company("wipro");
		password("rohit@123");
		accept();
		signUp();
		 
		 
	}

}

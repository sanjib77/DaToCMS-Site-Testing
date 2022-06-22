package stepdefinations;

import java.io.IOException;

import org.junit.Assert;

import com.capstone.browserfactory.BrowserFactory;
import com.capstone.homepage.Homepage;
import com.capstone.signuppage.SignUppage;
import com.capstone.utility.Utility;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignUpPageStep extends BrowserFactory {
	Homepage homepage;	
	SignUppage page;
	Utility utility = new Utility();

	@Given("you are on the Signup Page of Datocms")
	public void homepage_of_datocms() {
		Browsersetup();
	    initialize();
	    homepage = new Homepage();
	    homepage.clicktryforfree();
	    page = new SignUppage();
	}
	@When("Any field is Empty")
	public void field_is_required() {
	    // Write code here that turns the phrase above into concrete actions
		page.fieldIsRequiredtest();
	   
	}

	@Then("should give message, Field is Required")
	public void field_is_required_error() {
	    // Write code here that turns the phrase above into concrete actions
		String expectedMessage = "Field is required";
		String actualMessage = page.fieldIsRequired();
		 Assert.assertEquals("Please fill all required fields", expectedMessage,actualMessage);
		 try {
				utility.takeSS();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 page.close();
	    
	}

	@When("Not Accepted Terms and Conditions")
	public void field_need_to_be_checked() {
	    // Write code here that turns the phrase above into concrete actions
	   page.fieldcheckedtest();
	}

	@Then("should give message, Field needs to be checked")
	public void field_need_to_be_checked_error() {
	    // Write code here that turns the phrase above into concrete actions
		String expectedMessage = "Field needs to be checked";
		String actualMessage =page.fieldchecked();
		Assert.assertEquals("Field needs to be checked", expectedMessage,actualMessage);
		try {
			utility.takeSS();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		page.close();
		
	}

	@When("Entered email without @gmail.com")
	public void email_invalid() {
	    // Write code here that turns the phrase above into concrete actions
		page.emailNotValidtest();
	    
	}

	@Then("should give message, email invalid")
	public void email_invalid_error() {
	    // Write code here that turns the phrase above into concrete actions
		String  expectedMessage= "Email not valid";
		 String actualMessage= page.emailNotValid();
		 Assert.assertEquals("Email not valid! please give correct email with @gmail.com", expectedMessage,actualMessage);
		 try {
				utility.takeSS();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 page.close();
	   
	}

	@When("user clicks on Signup after entering all details")
	public void signup() {
	    // Write code here that turns the phrase above into concrete actions
		page.signUptest();
	}

	@Then("User is redirected to dashboard")
	public void redirect_to_signup_page() {
	    // Write code here that turns the phrase above into concrete actions
		String  expectedtitle= "DatoCMS Dashboard";
		 String actualtitle= page.getTitle();
		 Assert.assertEquals("datocms signUp page is not available", expectedtitle,actualtitle);
		 try {
				utility.takeSS();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 page.close();
	}
	@When("user clicks on Login Link")
	public void login() {
	    // Write code here that turns the phrase above into concrete actions
		page.login();
	}

	@Then("User is redirected to Login Page")
	public void redirect_to_login_page() {
	    // Write code here that turns the phrase above into concrete actions
		
		String  expectedMessage= "Log in";
		 String actualMessage= page.loginButtonn();
		 Assert.assertEquals("datocms login page is not available", expectedMessage,actualMessage);
		 try {
				utility.takeSS();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		page.close();
	}


	}




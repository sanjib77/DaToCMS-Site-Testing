package stepdefinations;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.junit.Assert;

import com.capstone.browserfactory.BrowserFactory;
import com.capstone.homepage.Homepage;
import com.capstone.loginpage.LoginPage;
import com.capstone.utility.Utility;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageStep extends BrowserFactory{
	
	Homepage homepage;	
	LoginPage page;
	Utility utility = new Utility();
	
	@Given("you are on the Login Page of Datocms")
	public void you_are_on_the_login_page_of_datocms() {
		Browsersetup();
	    initialize();
	    homepage = new Homepage();
	    homepage.clicklogin();
	    page = new LoginPage();
	}

	@When("Email field is empty")
	public void email_field_is_empty() {
	    page.enteremail("");
	    page.clicklogin();
	}

	@Then("should give message, FieldisRequired")
	public void should_give_message_fieldis_required() {
		String expectedMessage = "Field is required";
		String actualMessage = page.fieldrequired();
		 Assert.assertEquals("Please fill all required fields", expectedMessage,actualMessage);
		 try {
				utility.takeSS();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 page.close();
	}

	@When("Entered not valid email")
	public void entered_not_valid_email() {
	    page.enteremail("Sanjib");
	    page.clicklogin();
	}

	@Then("should give message, Email not valid")
	public void should_give_message_email_not_valid() {
		String expectedMessage = "Email not valid";
		String actualMessage = page.invalidemail();
		 Assert.assertEquals("Please enter valid mail", expectedMessage,actualMessage);
		 try {
				utility.takeSS();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 page.close();
	}

	@When("Entered invalid credentials")
	public void entered_invalid_credentials() {
	    page.enteremail("sanjib@gmail.com");
	    page.enterpassword("Sanjib");
	    page.clicklogin();
	}

	@Then("should give message, Credentials are incorrect!")
	public void should_give_message_credentials_are_incorrect() {
		String expectedMessage = "Credentials are incorrect!";
		String actualMessage = page.invalidcredentials();
		 Assert.assertEquals("Please enter valid mail", expectedMessage,actualMessage);
		 try {
				utility.takeSS();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 page.close();
	}

	@When("user clicks on DatoCMS Link")
	public void user_clicks_on_dato_cms_link() {
	    page.clickdatocms();
	}

	@Then("User is redirected to new tab of DatoCMS homepage")
	public void user_is_redirected_to_new_tab_of_dato_cms_homepage() {
		assertEquals(driver.getTitle(),"The headless CMS that your team will love - DatoCMS");
	    try {
			utility.takeSS();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    driver.close();
	    
	}

	@When("user clicks on Reset Password Link")
	public void user_clicks_on_reset_password_link() {
	    page.clickreset();
	}

	@Then("User is redirected to Forgot Password Page")
	public void user_is_redirected_to_forgot_password_page() {
		try {
			utility.takeSS();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertTrue(page.forgotpassMsg());
		for (String windowHandle : driver.getWindowHandles()) {
			driver.close();
		}
		
	}

}

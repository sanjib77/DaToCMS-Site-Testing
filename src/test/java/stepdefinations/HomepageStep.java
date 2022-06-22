package stepdefinations;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import com.capstone.browserfactory.BrowserFactory;
import com.capstone.homepage.Homepage;
import com.capstone.utility.Utility;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomepageStep extends BrowserFactory {
	
	Homepage page;
	Utility utility = new Utility();

@Given("you are on the homepage of Datocms")
public void you_are_on_the_homepage_of_datocms() {
	Browsersetup();
    initialize();
    page = new Homepage();
}

@When("user click on try it for free")
public void user_click_on_try_it_for_free() {
    page.clicktryforfree();
}

@Then("user redirects to the registration page")
public void user_redirects_to_the_registration_page() {
    // Write code here that turns the phrase above into concrete actions
    assertEquals(driver.getTitle(),"DatoCMS Dashboard");
    try {
		utility.takeSS();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    page.close();
}

@When("user click on login")
public void user_click_on_login() {
    // Write code here that turns the phrase above into concrete actions
    page.clicklogin();
}

@Then("user redirects to the login page")
public void user_redirects_to_the_login_page() {
    // Write code here that turns the phrase above into concrete actions
	try {
		utility.takeSS();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    assertEquals(driver.getTitle(),"DatoCMS Dashboard");
    page.close();
}

@When("email field is empty")
public void email_field_is_empty() {
    // Write code here that turns the phrase above into concrete actions
    page.clicksubscribe();
}

@Then("should give message please, enter your email.")
public void should_give_message_please_enter_your_email() {
    // Write code here that turns the phrase above into concrete actions
	try {
		utility.takeSS();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	assertTrue(page.msgdisplay());
	driver.close();
}

@When("user scroll downs the homepage")
public void user_scroll_downs_the_homepage() {
    // Write code here that turns the phrase above into concrete actions
	page.scrolltoimage();
    
}

@Then("images should be visible to user.")
public void images_should_be_visible_to_user() {
    // Write code here that turns the phrase above into concrete actions
	try {
		utility.takeSS();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    assertTrue(page.imagedisplayed());
    page.close();
}

@When("when user clicks on read the story link")
public void when_user_clicks_on_read_the_story_link() {
    // Write code here that turns the phrase above into concrete actions
	page.readstorylink();
}

@Then("user redirects to the story page he clicked")
public void user_redirects_to_the_story_page_he_clicked() {
    // Write code here that turns the phrase above into concrete actions
	try {
		utility.takeSS();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	page.close();
}

}

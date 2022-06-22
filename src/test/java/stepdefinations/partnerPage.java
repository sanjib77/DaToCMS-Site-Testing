package stepdefinations;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.junit.Assert;


import com.capstone.browserfactory.BrowserFactory;
import com.capstone.partnerpage.Partnerpage;
import com.capstone.utility.Utility;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class partnerPage extends BrowserFactory {	
	Partnerpage page;
	Utility utility = new Utility();

	@Given("you are on the homepage of Datocms and click partner link")
	public void homepage_of_datocms() {
		Browsersetup();
	    initialize();
	    page = new Partnerpage();
	    page.partner_link();
	}
	@When("user click rotate image")
	public void user_click_rotate_image() {
	    // Write code here that turns the phrase above into concrete actions
		page.rotate_link();
	   
	}

	@Then("user redirects to the rotate image page")
	public void user_redirects_to_the_rotate_image_page() {
	    // Write code here that turns the phrase above into concrete actions
		assertTrue(page.rotate_msg());
		try {
			utility.takeSS();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 page.close();
	    
	}
	
	@When("user click creativo image")
	public void user_click_creativo_image() {
	    // Write code here that turns the phrase above into concrete actions
		page.creativo_link();
	}
	@Then("user redirects to the creativo image page")
	public void user_redirects_to_the_creativo_image_page() {
	    // Write code here that turns the phrase above into concrete actions
		assertTrue(page.creativo_msg());
		try {
			utility.takeSS();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 page.close();
	}
	@When("user click spehler image")
	public void user_click_spehler_image() {
	    // Write code here that turns the phrase above into concrete actions
		page.spehler_link();
	}
	@Then("user redirects to the spehler image page")
	public void user_redirects_to_the_spehler_image_page() {
	    // Write code here that turns the phrase above into concrete actions
		assertTrue(page.spehler_msg());
		try {
			utility.takeSS();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 page.close();
	}
	@When("user click trampholin image")
	public void user_click_trampholin_image() {
	    // Write code here that turns the phrase above into concrete actions
		page.trampholin_link();
	}
	@Then("user redirects to the trampholin image page")
	public void user_redirects_to_the_trampholin_image_page() {
	    // Write code here that turns the phrase above into concrete actions
		assertTrue(page.trampholin_msg());
		try {
			utility.takeSS();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 page.close();
	}
	@When("user click goDigital image")
	public void user_click_go_digital_image() {
	    // Write code here that turns the phrase above into concrete actions
		page.goDigital_link();
	}
	@Then("user redirects to the goDigital image page")
	public void user_redirects_to_the_go_digital_image_page() {
	    // Write code here that turns the phrase above into concrete actions
		assertTrue(page.goDigital_msg());
		try {
			utility.takeSS();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 page.close();
	}

	}




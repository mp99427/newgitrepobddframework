package stepdefinitions;

import org.junit.Assert;

import com.pageObjects.LoginPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.*;


public class LoginPageStepDefinition {
	private static String Title;
	private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
	@Given("user is on login page")
	public void user_is_on_login_page() {
	    DriverFactory.getDriver().get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
	    
	}

	@When("user gets the title of the page")
	public void user_gets_the_title_of_the_page() {
		  Title=loginPage.getLoginPageTitle();
	    
	}

	@Then("page title should be {string}")
	public void page_title_should_be(String expectedTitle) {
	   Assert.assertTrue(Title.equals(expectedTitle));
	}

	@Then("forgot your password link should be displayed")
	public void forgot_your_password_link_should_be_displayed() {
	    Boolean result = loginPage.isForgotPasswordExist();
	    Assert.assertTrue(result);
	    
	}

	@When("user enters username as {string}")
	public void user_enters_username_as(String userName) {
	    loginPage.enterUsername(userName);
	    
	}

	@When("user enters password as {string}")
	public void user_enters_password_as(String pwd) {
	    
	loginPage.enterPassword(pwd);   
	}

	@When("user click on login button")
	public void user_click_on_login_button() {
	    loginPage.clickOnLogin();
	}
}

package stepdefinitions;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.pageObjects.AccountPage;
import com.pageObjects.LoginPage;
import com.qa.factory.DriverFactory;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class AccountPageStepdefinition {
	private AccountPage accountsPage;
	LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
	
	@Given("user is already logged in to the application")
	public void user_is_already_logged_in_to_the_application(DataTable loginCredentials) {
	   
		List<Map<String,String>> loginCredList = loginCredentials.asMaps();
		String username = loginCredList.get(0).get("username");
		String password = loginCredList.get(0).get("password");
		DriverFactory.getDriver().get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		 accountsPage = loginPage.doSignIn(username, password);
	}
	@Then("user gets account section")
	public void user_gets_account_section(DataTable dataTable) {
		List<String> expected = dataTable.asList();
		List<String> actual=accountsPage.getAccountSectionList();
		Assert.assertTrue(expected.containsAll(actual));
		
		
	}

	@Then("the user validted that the section count is {int}")
	public void the_user_validted_that_the_section_count_is(int count)
	{ Assert.assertTrue(accountsPage.getAccountSectionList().size()== 6);
	}

	
	
}

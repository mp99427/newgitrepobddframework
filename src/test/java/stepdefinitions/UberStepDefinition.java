package stepdefinitions;

import io.cucumber.java.en.*;

public class UberStepDefinition {
	@Given("User wants to select a car type {string} from Uber app")
	public void user_wants_to_select_a_car_type_from_Uber_app(String carType) {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("user selects car {string} and pick up point {string} and drop Location {string}")
	public void user_selects_car_and_pick_up_point_and_drop_Location(String carType, String pickUpLoc, String dropLoc) {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("driver starts the journey")
	public void driver_starts_the_journey() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("driver ends the journey")
	public void driver_ends_the_journey() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("user pays {int} Rupees")
	public void user_pays_Rupees(Integer billAmt) {
	    // Write code here that turns the phrase above into concrete actions
	    
	}
}

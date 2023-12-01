package projectfinal.stepsdef;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import projectfinal.pages.RecherchePage;

public class RechercheStepsPage {
	WebDriver driver = Hooks.driver;
	RecherchePage login;

	@When("the admin selects the course search option")
	public void the_admin_selects_the_course_search_option() {
		login = new RecherchePage(driver);
		login.clickSearch();
	}

	@When("^the admin enters the course name (.*)$")
	public void the_admin_enters_the_course_name_test_et_validation(String courseName) {
		login.searchExistentCourse(courseName);
	}

	@Then("the corresponding course should be displayed")
	public void the_corresponding_course_should_be_displayed() {
		login.displayCourse();
	}

	@When("the admin clears the course name")
	public void the_admin_clears_the_course_name() {
		login.ClearingSearchField();
	}

	@Then("the initial page should be displayed")
	public void the_initial_page_should_be_displayed() {
		login.displayPage();
	}

	@When("the admin enters an inexistent course name {string}")
	public void the_admin_enters_an_inexistent_course_name(String coursename) {
		login.searchInexistentCourse(coursename);
	}

	@Then("the message {string} should be displayed")
	public void the_message_should_be_displayed(String string) {
		login.displayMessage();
	}

}

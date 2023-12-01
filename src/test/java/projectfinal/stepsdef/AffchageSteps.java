package projectfinal.stepsdef;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import projectfinal.pages.AffichageCursus;

public class AffchageSteps {

	WebDriver driver = Hooks.driver;
	AffichageCursus aff = new AffichageCursus(driver);

	@When("the course title should be {string}")
	public void the_course_title_should_be(String string) {
		aff.verifyTitle();
	}

	@When("the course description should be {string}")
	public void the_course_description_should_be(String string) {
		aff.verifyDescription();
	}

	@When("the tags associated with the course should be {string}")
	public void the_tags_associated_with_the_course_should_be(String string) {
		aff.verifyTags();
	}

	@When("the course visibility should be {string}")
	public void the_course_visibility_should_be(String string) {
		aff.verifyVisibility();
	}

	@When("the course actions should be {string}")
	public void the_course_actions_should_be(String string) {
		aff.verifyActions();
	}

	@Then("the elements of the header should be displayed")
	public void the_elements_of_the_header_should_be_displayed() {
		System.out.println("the elements of the header should be displayed");
	}

}

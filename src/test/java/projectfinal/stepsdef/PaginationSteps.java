package projectfinal.stepsdef;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import projectfinal.pages.PaginationPage;

public class PaginationSteps {
	WebDriver driver = Hooks.driver;
	PaginationPage Page = new PaginationPage(driver);

	@When("The admin clicks the right arrow to go to the next page")
	public void the_admin_clicks_the_right_arrow_to_go_to_the_next_page() {
		Page.clickRightBotton();
	}

	@Then("The next page of courses is displayed")
	public void the_next_page_of_courses_is_displayed() {
		String expectedText = "41 à 50";
		String actualText = Page.getPageText();
		assert actualText.contains(expectedText) : "The pagination index does not contain the expected text";
	}

	@When("The admin clicks the left arrow to go back to the previous page")
	public void the_admin_clicks_the_left_arrow_to_go_back_to_the_previous_page() {
		Page.clickLeftBotton();
	}

	@Then("The previous page of courses is displayed")
	public void the_previous_page_of_courses_is_displayed() {
		String expectedText = "31 à 40";
		String actualText = Page.getPage();
		assert actualText.contains(expectedText) : "The pagination index does not contain the expected text";
	}

}

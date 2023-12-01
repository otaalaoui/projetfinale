package projectfinal.stepsdef;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import projectfinal.pages.AjoutCursusPage;

public class AjoutCursusSteps {
	WebDriver driver = Hooks.driver;
	AjoutCursusPage login;

	@When("the admin clicks on Cursus in the dashboard menu")
	public void the_admin_clicks_on_cursus_in_the_dashboard_menu() {
		login = new AjoutCursusPage(driver);
		login.clickConnexCursus();
	}

	@When("the admin clicks on the Add Course option")
	public void the_admin_clicks_on_the_add_course_option() {
		login.clickAdd();
	}

	@When("^the admin enters the title (.*)$")
	public void the_admin_enters_the_title(String title) {
		login.setTitle(title);

	}

	@When("^the admin enters the visibility(.*)$")
	public void the_admin_enters_the_visibility(String visibility) {
		login.setVisibility(visibility);
	}

	@When("^the admin enters the description(.*)")
	public void the_admin_enters_the_description(String description) {
		login.setDescription(description);
	}

	@When("^the admin enters the imageurl (.*)")
	public void the_admin_enters_the_imageurl(String imageurl) {
		login.setImageUrl(imageurl);

	}

	@When("^the admin enters the numberofdays (.*)")
	public void the_admin_enters_the_numberofdays(String numberofdays) {
		login.setDaysNumber(numberofdays);
	}

	@When("^the admin enters the tagsname (.*)$")
	public void the_admin_enters_the_tags_name(String tagsname) {
		login.setTags(tagsname);
	}

	@When("the admin clicks on the add button")
	public void the_admin_clicks_on_the_add_button() {
		login.clickAddC();
	}

	@Then("the course is added")
	public void the_course_is_added() {
		assertTrue(login.afficherConfimation());
	}

}



package projectfinal.stepsdef;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import projectfinal.pages.DashbordPage;

public class DashbordSteps {

	WebDriver driver = Hooks.driver;
	DashbordPage login;

	@Given("the admin is on the homepage")
	public void the_admin_is_on_the_homepage() {
		driver.get("http://10.4.1.137/frontend/");
	}

	@When("the admin selects the login option")
	public void the_admin_selects_the_login_option() {
		login = new DashbordPage(driver);
		login.clickConnexion();
	}

	@When("the admin inputs their (.*) and (.*)$")
	public void the_admin_inputs_their_email_and_password(String email, String password) {
		login.credentials(email, password);
	}

	@When("the admin selects the login button")
	public void the_admin_selects_the_login_button() {
		login.clickSubmit();
	}

	@Then("the admin should be directed to the dashboard")
	public void the_admin_should_be_directed_to_the_dashboard() {
		login.afficherTableauDeBord();
	}

}

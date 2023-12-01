package projectfinal.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashbordPage {
	WebDriver driver;
	By btn_connexion = By.xpath("//span[contains(text(),'CONNEXION')]");
	By userEmail = By.xpath("//input[@id='email']");
	By userPassword = By.xpath("//input[@id='password']");
	By btn_submit = By.xpath("//span[contains(text(),\"S'identifier\")]");
	By affiche_TableauB = By.xpath("//h1[contains(text(),'Tableau De Bord')]");

	public DashbordPage(WebDriver driver) {
		this.driver = driver;
	}

	public void clickConnexion() {
		driver.findElement(btn_connexion).click();
	}

	public void credentials(String email, String password) {
		driver.findElement(userEmail).click();
		driver.findElement(userEmail).sendKeys(email);
		driver.findElement(userPassword).click();
		driver.findElement(userPassword).sendKeys(password);
	}

	public void clickSubmit() {
		driver.findElement(btn_submit).click();
	}

	public void afficherTableauDeBord() {
		driver.findElement(affiche_TableauB).isDisplayed();
	}

}



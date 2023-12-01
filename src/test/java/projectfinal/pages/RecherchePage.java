package projectfinal.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RecherchePage {

	WebDriver driver;
	By text_search = By.xpath(
			"//body/app-root[1]/app-admin[1]/app-course-admin[1]/div[1]/p-table[1]/div[1]/div[1]/div[1]/span[2]/input[1]");
	By text_Course = By.xpath("//td[contains(text(),'Test et validation')]");
	By text_Page = By.xpath("//tbody/tr[1]/td[1]");
	By text_message = By.xpath("//td[contains(text(),'Aucun cursus trouvé.')]");

	public RecherchePage(WebDriver driver) {
		this.driver = driver;
	}

	public void clickSearch() {
		driver.findElement(text_search).click();
	}

	public void searchExistentCourse(String courseName) {
		driver.findElement(text_search).sendKeys(courseName);

	}

	public void ClearingSearchField() {
		driver.findElement(text_search).clear();
		  driver.navigate().refresh();
	}

	public void searchInexistentCourse(String coursename) {
		driver.findElement(text_search).sendKeys(coursename);

	}

	public void displayCourse() {
		driver.findElement(text_Course).isDisplayed();
	}

	public void displayPage() {
		driver.findElement(text_Page).isDisplayed();
	}

	public void displayMessage() {
		driver.findElement(text_message).isDisplayed();
	}

}

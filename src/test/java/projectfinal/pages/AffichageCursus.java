package projectfinal.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AffichageCursus {
	WebDriver driver;
	By text_titre = By.xpath("//th[contains(text(),'Course')]");
	By text_description = By.xpath("//th[contains(text(),'Description')]");
	By text_tags = By.xpath("//th[contains(text(),'Tags')]");
	By text_visibility = By.xpath("//th[contains(text(),'Visibilité')]");
	By text_actions = By.xpath("//th[contains(text(),'Actions')]");

	public AffichageCursus(WebDriver driver) {
		this.driver = driver;
	}

	public void verifyTitle() {
		WebElement titleElement = driver.findElement(text_titre);
		String titleText = titleElement.getText();
		Assert.assertEquals("Course", titleText);
	}

	public void verifyDescription() {
		WebElement descriptionElement = driver.findElement(text_description);
		String descriptionText = descriptionElement.getText();
		Assert.assertEquals("Description", descriptionText);
	}

	public void verifyTags() {
		WebElement tagsElement = driver.findElement(text_tags);
		String tagsText = tagsElement.getText();
		Assert.assertEquals("Tags", tagsText);
	}

	public void verifyVisibility() {
		WebElement visibilityElement = driver.findElement(text_visibility);
		String visibilityText = visibilityElement.getText();
		Assert.assertEquals("Visibilité", visibilityText);
	}

	public void verifyActions() {
		WebElement actionElement = driver.findElement(text_actions);
		String actionText = actionElement.getText();
		Assert.assertEquals("Act", actionText);
	}
}



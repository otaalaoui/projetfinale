package projectfinal.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AjoutCursusPage {
	WebDriver driver;
	By btn_Cursus = By.xpath("//body/app-root[1]/app-admin[1]/p-menubar[1]/div[1]/p-menubarsub[1]/ul[1]/li[2]/a[1]");
	By btn_add = By.xpath(
			"//body/app-root[1]/app-admin[1]/app-course-admin[1]/div[1]/p-table[1]/div[1]/div[1]/div[1]/span[1]/button[1]");
	By text_title = By.xpath("//input[@id='name']");
	By text_visibility = By.xpath("//input[@id='visibility']");
	By text_Description = By.xpath("//textarea[@id='description']");
	By text_image = By.xpath("//input[@id='image']");
	By text_DaysNumber = By.xpath("//input[@id='days_number']");
	By text_Tags = By.xpath("//input[@id='tags']");
	By btn_addC = By.xpath(
			"//body/app-root[1]/app-admin[1]/app-course-admin[1]/p-dialog[1]/div[1]/div[1]/div[4]/button[2]/span[2]");
	By text_message = By.xpath("//div[contains(text(),'Ajout effectué avec succès')]");

	public AjoutCursusPage(WebDriver driver) {
		this.driver = driver;
	}

	public void clickConnexCursus() {
		driver.findElement(btn_Cursus).click();
	}

	public void clickAdd() {
		driver.findElement(btn_add).click();
	}

	public void setTitle(String title) {
		driver.findElement(text_title).sendKeys(title);
	}

	public void setVisibility(String visibility) {

		driver.findElement(text_visibility).clear();
		driver.findElement(text_visibility).sendKeys(visibility);

	}

	public void setDescription(String description) {
		driver.findElement(text_Description).sendKeys(description);
	}

	public void setImageUrl(String imageurl) {
		driver.findElement(text_image).sendKeys(imageurl);
	}

	public void setDaysNumber(String numberofdays) {
		driver.findElement(text_DaysNumber).sendKeys(numberofdays);
	}

	public void setTags(String tagsname) {

		driver.findElement(text_Tags).sendKeys(tagsname);
	}

	public void clickAddC() {
		driver.findElement(btn_addC).click();

	}

	public boolean afficherConfimation() {
		return driver.findElement(text_message).isDisplayed();
	}

}



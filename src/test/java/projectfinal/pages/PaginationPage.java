package projectfinal.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PaginationPage {
	WebDriver driver;
	By btn_Right = By.xpath("//body/app-root[1]/app-admin[1]/app-course-admin[1]/div[1]/p-table[1]/div[1]/p-paginator[1]/div[1]/span[2]/button[5]");
			
	By btn_left = By.xpath(
			"//body/app-root[1]/app-admin[1]/app-course-admin[1]/div[1]/p-table[1]/div[1]/p-paginator[1]/div[1]/span[2]/button[2]");
	By text_PageR = By.xpath("//span[@class='p-paginator-current ng-star-inserted']");
	By text_PageL = By.xpath("//span[@class='p-paginator-current ng-star-inserted']");
	By btn_pagination = By.xpath(
			"//body/app-root[1]/app-admin[1]/app-course-admin[1]/div[1]/p-table[1]/div[1]/p-paginator[1]/div[1]/p-dropdown[1]/div[1]/div[2]/span[1]");

	public PaginationPage(WebDriver driver) {
		this.driver = driver;
	}

	public void clickRightBotton() {
		driver.findElement(btn_Right).click();
	}

	public void clickLeftBotton() {
		driver.findElement(btn_left).click();
	}

	public String getPageText() {
		return driver.findElement(text_PageR).getText();
	}

	public String getPage() {
		return driver.findElement(text_PageL).getText();
	}

	public void clickBottonPagination() {
		driver.findElement(btn_pagination).click();
	}

}

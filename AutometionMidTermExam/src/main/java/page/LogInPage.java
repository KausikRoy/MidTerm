package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LogInPage extends BasePage {

	WebDriver driver;

	public LogInPage(WebDriver driver) {
		this.driver = driver;
	}

	// Library of elements
	@FindBy(how = How.ID, using = "user_login")
	WebElement UserName_Field;
	@FindBy(how = How.ID, using = "user_pass")
	WebElement Password_Field;
	@FindBy(how = How.ID, using = "wp-submit")
	WebElement Submit_Field;
	@FindBy(how = How.XPATH, using = "//h1[text()='Dashboard']")
	WebElement DASHBOARD_TITEL_LOCATOR_FIELD;

	// methods to interact with elements

	public void logIn(String UserName, String Password) {
		UserName_Field.sendKeys(UserName);

		Password_Field.sendKeys(Password);

		Submit_Field.click();

	}

	public void waitForDashboardTitel() {
		waitForElement(DASHBOARD_TITEL_LOCATOR_FIELD, driver);
	}

	public boolean isDashBoardPageDisplayed() {
		waitForDashboardTitel();
		DASHBOARD_TITEL_LOCATOR_FIELD.isDisplayed();

		return true;
	}

}

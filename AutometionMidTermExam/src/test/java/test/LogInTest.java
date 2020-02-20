
package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import page.LogInPage;
import util.BrowserFactory;

public class LogInTest {
	WebDriver driver;

	@Test(priority = 1)
	public void validUserShouldBeAbletoLogin() throws InterruptedException {
		driver = BrowserFactory.startBrowser();
		LogInPage logInPage = PageFactory.initElements(driver, LogInPage.class);
		logInPage.logIn("opensourcecms", "opensourcecms");
		
		//validation of dashboard page is diplayed
		logInPage.isDashBoardPageDisplayed();
	}

	@AfterMethod

	public void close() {

		driver.close();
		driver.quit();
	}

}

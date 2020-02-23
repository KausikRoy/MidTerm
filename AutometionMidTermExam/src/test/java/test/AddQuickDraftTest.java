
package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.AddQuickDraftPage;
import page.LogInPage;
import page.PostDisplayPage;
import util.BrowserFactory;

public class AddQuickDraftTest {
	WebDriver driver;
	
	@Test(priority=1)
	public void userShouldAbleToAddQuickDraft() throws InterruptedException {
		driver=BrowserFactory.startBrowser();
		LogInPage logInPage = PageFactory.initElements(driver, LogInPage.class);
		logInPage.logIn("opensourcecms", "opensourcecms");
		Thread.sleep(3000);

		AddQuickDraftPage addQuickDraftPage = PageFactory.initElements(driver, AddQuickDraftPage.class);
		addQuickDraftPage.createNewDraft("My Today's Draft recent dummy attempt ", "Good Morning World");
		
		addQuickDraftPage.isMyDraftsaved();
		
	}

}

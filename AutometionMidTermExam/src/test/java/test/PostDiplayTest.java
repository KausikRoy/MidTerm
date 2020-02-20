
package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.AddQuickDraftPage;
import page.LogInPage;
import page.PostDisplayPage;
import util.BrowserFactory;

public class PostDiplayTest {
	WebDriver driver;
	
	@Test(priority=1)
	public void newPostShouldBeDisplayedOnTable() throws InterruptedException {
		driver=BrowserFactory.startBrowser();
		LogInPage logInPage = PageFactory.initElements(driver, LogInPage.class);
		logInPage.logIn("opensourcecms", "opensourcecms");
		Thread.sleep(3000);
		AddQuickDraftPage addQuickDraftPage = PageFactory.initElements(driver, AddQuickDraftPage.class);
		addQuickDraftPage.createNewDraft("Lets learn Autometion ", "Good Morning World");
		
		addQuickDraftPage.isMyDraftsaved();
		PostDisplayPage postDisplayPage = PageFactory.initElements(driver, PostDisplayPage.class);
		
		postDisplayPage.clickAllPost();
		
	}

}

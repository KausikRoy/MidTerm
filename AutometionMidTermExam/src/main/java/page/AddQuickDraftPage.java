package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddQuickDraftPage extends BasePage{
	
	WebDriver driver;
	public AddQuickDraftPage(WebDriver driver) {
		this.driver =driver;
		
	}
	@FindBy(how = How.ID, using = "title")
	WebElement Draft_Title_Field;
	@FindBy(how = How.ID, using = "content")
	WebElement Content_Field;
	@FindBy(how = How.ID, using = "save-post")
	WebElement Save_Post_Field;
	@FindBy(how =How.XPATH,using = "//h2[@class='hide-if-no-js']")
	WebElement Save_Draft_Success_Field;
	
	public void createNewDraft(String Title,String Content) {
		Draft_Title_Field.sendKeys(Title);
		Content_Field.sendKeys(Content);
		Save_Post_Field.click();
		
	}
	public void waitForDraftTitle() {
		waitForElement(Save_Draft_Success_Field,driver);
	}
	public boolean isMyDraftsaved(){
		waitForDraftTitle();
		Save_Draft_Success_Field.isDisplayed();
		
		return true;
	}
	

}

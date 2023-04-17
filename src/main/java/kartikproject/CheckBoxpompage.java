package kartikproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckBoxpompage {
	
	@FindBy(xpath = "//input[@id='monday']")
	private WebElement daycheckbox;

	public CheckBoxpompage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getdaycheckbox()
	{
		return daycheckbox;
	}
}

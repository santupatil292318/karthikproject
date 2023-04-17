package webDriverUtility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebUtility {
	/**
	 * To Maximize The Window
	 * @param driver
	 */
	public void MaximizeTheWindow(WebDriver driver)
	{
		driver.manage().window().maximize();
	}
	/**
	 * To Minimize The Window
	 * @param driver
	 */
	public void MinimizeThewindow(WebDriver driver)
	{
		driver.manage().window().minimize();
	}
	
	/**
	 * To Refresh The Page
	 * @param driver
	 */
	public void RefreshThePage(WebDriver driver)
	{
		driver.navigate().refresh();
	}
	
	/**
	 * To Back The Page
	 * @param driver
	 */
	public void BackToPreviousPage(WebDriver driver) 
	{
		driver.navigate().back();
	}
	
	/**
	 * To forward Page
	 * @param driver
	 */
	public void ForwardPage(WebDriver driver)
	{
		driver.navigate().forward();
	}
	
	/**
	 * ImplicitlyWait
	 * @param driver
	 */
	public void Implicitly(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	public void elementToBeClickable(WebDriver driver,WebElement ele)
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(ele));
	}
}

package selectorsHub;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingMultipleOfCheckboxTest {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//CheckBoxpompage check = new CheckBoxpompage(driver);
		
		//specific checkbox handle
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
//		check.getdaycheckbox().click();
		
		//handling dynamic checkbox
		List<WebElement> chbox = driver.findElements(By.xpath("//div[@id='checkbox-example']/descendant::input[@type='checkbox']"));
//		int chsize = chbox.size();
//		System.out.println(chsize);
//		for (WebElement check : chbox) {
//			String option = check.getAttribute("value");
//			System.out.println(option);
//			check.click();
//		}
		
		
		//handling any 2 checkbox
		for(WebElement check:chbox)
		{
			String option = check.getAttribute("value");
			if(option.equals("option1")||option.equals("option3"))
			{
				check.click();
			}
		}
	}

}

package selectorsHub;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectorsHub {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("https://selectorshub.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//a[contains(text(),'PracticePage')]")).click();
		//String url = driver.getCurrentUrl();
		//String expecturl="https://selectorshub.com/xpath-practice-page/";
		//Assert.assertEquals(expecturl, url);
		driver.findElement(By.xpath("//input[@id='userId']")).sendKeys("santosh");

	}

}

package selectorsHub;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerts {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.automationtesting.in/Windows.html");

		
		//		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
//		Alert alert = driver.switchTo().alert();
//		String text = alert.getText();
//		System.out.println(text);
//		alert.accept();

//		driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']")).click();
//		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
//		Alert alert = driver.switchTo().alert();
//		String al = alert.getText();
//		System.out.println(al);
//		alert.dismiss();
		
		//switch to windows
		driver.findElement(By.xpath("//button[text()='    click   ']")).click();
		Set<String> window = driver.getWindowHandles();
		Iterator<String> win = window.iterator();
		while (win.hasNext()) {
			String parent = win.next();
			String child = win.next();
			driver.switchTo().window(child);
			String title = driver.getTitle();
			System.out.println(title);
			if (title.contains("Selenium")) {
				break;
				
			}
			
		}
		System.out.println("verified");
		
		driver.findElement(By.xpath("//a[@href='/downloads']")).click();
		
		//switchToframe
//		driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']")).click();
//		WebElement f1 = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
//		driver.switchTo().frame(f1);
//		WebElement f2 = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
//		driver.switchTo().frame(f2);
//		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("hi");
		
	}

}

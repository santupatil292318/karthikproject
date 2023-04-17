package selectorsHub;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingMultipledropdowns {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://selectorshub.com/xpath-practice-page/");
		WebElement dp = driver.findElement(By.xpath("//select[@name='cars']"));
		dp.click();
		Select sel = new Select(dp);
		List<WebElement> options = sel.getOptions();
		ArrayList<String> list = new ArrayList<String>();
		for (WebElement option : options) {
			String cars = option.getText();
			if (cars.contains("Audi")) {
				option.click();
			}
			System.out.println(cars);
			list.add(cars);
		}
		Collections.sort(list);
		for (String car : list) {
			System.out.println(car);

		}

	}

}

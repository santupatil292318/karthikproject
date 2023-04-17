package itera;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IteraTest {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("san");
		driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("1234567891");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("santupatil081@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("san@123");
		driver.findElement(By.xpath("//textarea[@id='address']")).sendKeys("hi Good evening");
		driver.findElement(By.xpath("//button[@name='submit']")).click();
		
		
		//checkBox
		List<WebElement> chbox = driver.findElements(By.xpath("//input[@type='checkbox' and contains(@id,'day')]"));
		for (WebElement check : chbox) {
			String ele = check.getAttribute("id");
			if (ele.contains("monday")||ele.contains("sunday")) {
				check.click();	
			}
		}
		
		//dropdowns
		WebElement dropdowns = driver.findElement(By.xpath("//select[@class='custom-select']"));
		Select select = new Select(dropdowns);
		List<WebElement> dropoptions = select.getOptions();
		ArrayList<String> array = new ArrayList<String>();
		for (WebElement dropele : dropoptions) {
			String dropdoewns = dropele.getText();
			System.out.println(dropdoewns);
			array.add(dropdoewns);
			
		}
		Collections.sort(array);
		System.out.println("sort"+array);
	}

}

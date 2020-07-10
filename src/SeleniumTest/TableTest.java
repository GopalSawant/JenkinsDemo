package SeleniumTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class TableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./Resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");

		List<WebElement> fruitnames = driver.findElements(By.xpath("//table[@id=\"sortableTable\"]//tbody/tr/td[2]"));
		List<WebElement> price = driver.findElements(By.cssSelector("tr td:nth-child(3)"));

		ArrayList<String> fruitsOrignal = new ArrayList<String>();
		ArrayList<Integer> priceOriginal = new ArrayList<Integer>();

		for (int i = 0; i < fruitnames.size(); i++) {

			fruitsOrignal.add(fruitnames.get(i).getText());

		}

		for (int i = 0; i < price.size(); i++) {

			priceOriginal.add(Integer.parseInt(price.get(i).getText()));
		}
		
		ArrayList<String> fruitsCopy=(ArrayList<String>)fruitsOrignal.clone();
		
		Collections.sort(fruitsCopy);
		
		System.out.println(fruitsCopy);
		
		Assert.assertTrue(fruitsOrignal.equals(fruitsCopy));
		

	}

}

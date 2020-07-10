package SeleniumTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Vegetables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", ".\\Resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

		String[] itemToAdd = { "Apple", "Almonds", "Pista" };				
		List<WebElement> productName = driver.findElements(By.xpath("//h4[@class=\"product-name\"]"));
//		List<WebElement> productAction = driver.findElements(By.xpath("//div[@class=\"product-action\"]/button"));
		int j=0;
		for (int i = 0; i < productName.size(); i++) {
			
			String[] splitProductName =productName.get(i).getText().split("-");
			String ActualproductName=splitProductName[0].trim();
			
			List<String> listItemToAdd=new ArrayList<String>();
			
			listItemToAdd=Arrays.asList(itemToAdd);
			
			if(listItemToAdd.contains(ActualproductName))
			{
				
				
				 driver.findElements(By.xpath("//div[@class=\"product-action\"]/button")).get(i).click();
				 j++;
				 if(itemToAdd.length==j)
				 {
//					 
					 break;
				 }
			}

		}

	}

}

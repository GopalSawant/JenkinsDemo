package SeleniumTest;

import java.awt.RenderingHints.Key;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class RohitShettyAcademy {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./Resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		Assert.assertEquals(driver.getTitle(), "Practice Page");
		driver.findElement(By.xpath("//div[@id=\'radio-btn-example\']//label[2]/input")).click();
		driver.findElement(By.cssSelector("input[class=\'inputs ui-autocomplete-input\']")).sendKeys("IND");
		driver.findElement(By.cssSelector("input[class=\'inputs ui-autocomplete-input\']")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.cssSelector("input[class=\'inputs ui-autocomplete-input\']")).sendKeys(Keys.ENTER);

		Select select_obj = new Select(driver.findElement(By.xpath("//*[@id=\'dropdown-class-example\']")));
		select_obj.selectByVisibleText("Option3");

		driver.findElement(By.cssSelector("[id='checkBoxOption2']")).click();
		Assert.assertTrue(driver.findElement(By.cssSelector("[id='checkBoxOption2']")).isSelected());

		driver.findElement(By.cssSelector("[id='name']")).sendKeys("Gopal");
		driver.findElement(By.cssSelector("[id='alertbtn']")).click();
		driver.switchTo().alert().accept();

		driver.findElement(By.cssSelector("a#opentab")).click();
		Set<String> obj = driver.getWindowHandles();
		Iterator<String> itr = obj.iterator();
		System.out.println("Windows " + obj.size());

		String parentobj = itr.next();
		String child = itr.next();

		System.out.println(driver.switchTo().window(child).getTitle());

		System.out.println(driver.switchTo().window(parentobj).getTitle());
		driver.findElement(By.cssSelector("button.btn-style.class1")).click();

		Set<String> obj1 = driver.getWindowHandles();
		Iterator<String> itr1 = obj1.iterator();
		System.out.println("Windows " + obj1.size());
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		for (String item : obj1) {

			System.out.println(driver.switchTo().window(item).getTitle());
			if (driver.switchTo().window(item).getTitle().contains("QA Click Academy")) {

				System.out.println("inside loop");

				driver.findElement(By.xpath("//div[@class='tools']//li[3]//a[1]//span")).click();

				System.out.println(driver.getTitle());

//				WebDriverWait wait=new WebDriverWait(driver,10);
//				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@name='commit']")));

				Assert.assertTrue(driver.findElement(By.xpath("//*[@name='commit']")).isEnabled());
				driver.close();
				System.out.println("window close");
			}

		}
		driver.switchTo().window(parentobj);
		System.out.println(driver.getTitle());;
		

		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//div[@class=\"mouse-hover\"]/button"))).build()
				.perform();
		
		Assert.assertTrue(driver.findElement(By.xpath("//div[@class=\"mouse-hover\"]/div/a[1]")).isDisplayed());
		
		System.out.println(driver.findElement(By.xpath("//div[@class=\"mouse-hover\"]/div/a[1]")).getText());
		
		//Switch to iframes
		
		driver.switchTo().frame("courses-iframe");
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		driver.switchTo().defaultContent();
		System.out.println(driver.getTitle());
		
		WebElement footerdriver=driver.findElement(By.id("gf-BIG"));
		
		WebElement discountdriver=footerdriver.findElement(By.xpath("//td[1]//ul[1]"));
		
		
		System.out.println(discountdriver.findElements(By.tagName("a")).size());
		
		for (int i=0;i <discountdriver.findElements(By.tagName("a")).size();i++)
		{
			String clickl=Keys.chord(Keys.CONTROL,Keys.ENTER);
			discountdriver.findElements(By.tagName("a")).get(i).sendKeys(clickl);
		}
		
		Set<String> widows=driver.getWindowHandles();
		
		for (String item:widows)
		{
			driver.switchTo().window(item).getTitle();
			driver.close();
		}

		

	}

}

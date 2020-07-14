package SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vaishali Sawant\\Desktop\\Eclipse\\Resources\\chromedriver83.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();		
		driver.get("https://facebook.com");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("email");
		driver.findElement(By.cssSelector("input[name='pass']")).sendKeys("pass");
		driver.findElement(By.xpath("//form[@id='login_form']/table/tbody/tr[3]/td[2]/div/a")).click();

	}

}

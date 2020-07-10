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
//		driver.get("https://google.com");
//		System.out.println(driver.getTitle());
//		System.out.println(driver.getCurrentUrl());
////		System.out.println(driver.getPageSource());
//		driver.get("https://facebook.com");
//		System.out.println(driver.getTitle());
//		driver.findElement(By.id("email")).sendKeys("email");
//		driver.findElement(By.id("pass")).sendKeys("password");
//		driver.findElement(By.id("u_0_b")).click();
//		
		
//		driver.navigate().back();
//		System.out.println(driver.getTitle());
//		driver.close(); //to close the current windows 
//		driver.quit(); // to close all the window opened by selenium script
		
//	driver.get("https://login.salesforce.com/?locale=in");
//	driver.findElement(By.id("username")).sendKeys("username");
//	driver.findElement(By.name("pw")).sendKeys("password");
////	driver.findElement(By.xpath("\\input[@class='button.r4.wide.primary']")).click();
//	driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		driver.get("https://facebook.com");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("email");
		driver.findElement(By.cssSelector("input[name='pass']")).sendKeys("pass");
		driver.findElement(By.xpath("//form[@id='login_form']/table/tbody/tr[3]/td[2]/div/a")).click();
//		driver.findElement(By.cssSelector("#u_0_b")).click();
	}

}

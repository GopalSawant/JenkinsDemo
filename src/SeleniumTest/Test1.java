package SeleniumTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hello");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vaishali Sawant\\Desktop\\Eclipse\\Resources\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://google.com");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());

	}

}

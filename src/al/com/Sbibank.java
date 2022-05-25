package al.com;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sbibank {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\durai\\eclipse-workspace\\SeleniumProject\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		Thread.sleep(3000);
		driver.get("https://retail.onlinesbi.com/retail/login.htm");
		driver.manage().window().maximize();

		

driver.findElement(By.xpath("//a[contains(text(),'CONTINUE TO LOGIN')][1]")).click();
driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("babu");
driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123");

driver.findElement(By.xpath("(//input[@type='submit'])")).click();

}
}
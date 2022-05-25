package al.com;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lakshmibank {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdiver.chrome.driver", "C:\\Users\\durai\\eclipse-workspace\\SeleniumProject\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(3000);
		driver.get("https://www.lvbankonline.in/index.html?module=login");
		driver.manage().window().maximize();
	Alert al=	driver.switchTo().alert();
	al.accept();
	 driver.findElement(By.xpath("//input[@name='username']")).sendKeys("babu");
	 driver.findElement(By.xpath("//input[@name='password']")).sendKeys("1234");
	 driver.findElement(By.xpath("//span[text()='Login'][1]")).click();
	 
	}

}

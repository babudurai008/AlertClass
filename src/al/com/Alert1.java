package al.com;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\durai\\eclipse-workspace\\SeleniumProject\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(3000);
		driver.get("https://demoqa.com/alerts");
		WebElement user=driver.findElement(By.xpath("//button[@id='confirmButton']"));
		user.click();
	Alert al=	driver.switchTo().alert();
	Thread.sleep(7000);
	al.dismiss();
}
}
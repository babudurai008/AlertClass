package al.com;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Promtclass {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\durai\\eclipse-workspace\\SeleniumProject\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(3000);
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		WebElement user=driver.findElement(By.xpath("(//button[text()='Click me'])[4]"));
		user.click();
		Alert al=	driver.switchTo().alert();
		al.sendKeys("babu");
	String txt=	al.getText();
		System.out.println(txt);
		
		Thread.sleep(7000);

		al.accept();
		WebElement usertxt=driver.findElement(By.xpath("//span[@class='text-success']"));
		String text =usertxt.getText();
		System.out.println(text);
		
		boolean b=text.contains("babu");
		System.out.println(b);
	

	}
}

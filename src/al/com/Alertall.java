package al.com;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alertall {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\durai\\eclipse-workspace\\SeleniumProject\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();	
		Thread.sleep(3000);
		WebElement clickbtn=driver.findElement(By.id("alertButton"));
		clickbtn.click();
		Alert al=	driver.switchTo().alert();
		String s=	driver.switchTo().alert().getText();
		System.out.println(s);
	al.accept();
	WebElement select=driver.findElement(By.id("timerAlertButton"));
	select.click();
	WebDriverWait wait =new WebDriverWait(driver,10);
	wait.until(ExpectedConditions.alertIsPresent());
	Alert a2=	driver.switchTo().alert();
	String s1=	driver.switchTo().alert().getText();
	System.out.println(s);
	al.accept();
	WebElement dismiss=driver.findElement(By.id("confirmButton"));
	dismiss.click();
	Alert a3=	driver.switchTo().alert();
	String s2=	driver.switchTo().alert().getText();
	System.out.println(s);
	al.dismiss();
	
	WebElement promt=driver.findElement(By.xpath(("//button[@id='promtButton']")));
	promt.click();
	Alert a4=	driver.switchTo().alert();
	a4.sendKeys("babudurai");
	a4.accept();
	WebElement usertxt=driver.findElement(By.xpath("//span[@class='text-success']"));
	String text =usertxt.getText();
	System.out.println(text);
	
	
	


	


	
	}

}

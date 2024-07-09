package Betmgm.Sanity;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Hello world!
 *
 */
public class App {

	static WebDriver driver = new ChromeDriver();

	public static void main(String[] args) throws InterruptedException {
		App app1 = new App();

		driver.get("https://qa81.casino.nj.betmgm.com/en/games");
		driver.manage().window().maximize();
		app1.WaitForElementVisible(driver,By.xpath("//vn-menu-item-text-content[@data-testid='registerbutton']"));
		driver.findElement(By.xpath("//vn-menu-item-text-content[@data-testid='registerbutton']")).click();
		app1.WaitForElementVisible(driver,By.xpath("//input[@type='email']"));
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("newselenium@yopmail.com");
		app1.WaitForElementVisible(driver,By.xpath("(//button[@id='continue'])[1]"));
		driver.findElement(By.xpath("(//button[@id='continue'])[1]"));

	}
	


	public void WaitForElementVisible(WebDriver driver, By locator) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	
	}
}
package ciklumSamplejenkins;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleFile {

	@Test
	public void getData() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.ciklum.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[contains(text(),'Allow all')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@class='mobileTrigger']")).click();
		driver.findElement(By.xpath("(//div[@class='childTrigger'])[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Product engineering")).click();
		WebElement ele=driver.findElement(By.xpath("//h2[contains(text(),'Service launch process')]"));
	//	Thread.sleep(2000);
	    JavascriptExecutor js=(JavascriptExecutor)driver;
	    js.executeScript("arguments[0].scrollIntoView();", ele);
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//div[contains(text(),'01. Discussion')]")).click();
	    System.out.println("Working fine");
			
	}


}

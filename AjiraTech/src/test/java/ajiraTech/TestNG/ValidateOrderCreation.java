package ajiraTech.TestNG;

import java.time.Duration;

import org.bouncycastle.jcajce.provider.asymmetric.EC;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ValidateOrderCreation extends CodeReusable {

	@Test
	public void OrderCreation() {
		codeReusable();
		
		try {
			Thread.sleep(30000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement order_button = driver.findElement(By.xpath(ordersXpath));
		order_button.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath(createOrders)).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath(dropDown)).click();
		driver.findElement(By.xpath(item1)).click();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement target = driver.findElement(By.xpath(shippedAt));
		js.executeScript("arguments[0].scrollIntoView()" ,target);
		target.click();
		
		
		driver.quit();
	}


	}


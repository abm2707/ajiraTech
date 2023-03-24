package ajiraTech.TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Filter extends CodeReusable{

	@Test
	public void filter()  {
		codeReusable();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath(filter)).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath(whereButton)).click();
		driver.quit();
	}
}

package ajiraTech.TestNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CodeReusable {
	
	public static String url;
	public static WebDriver driver;
	public static String ordersXpath;
	public static String createOrders;
	public static String dropDown;
	public static String item1;
	public static String address ;
	public static String createButton ;
	public static String key1 ;
	public static String calender1 ;
	public static String calender2 ;
	public static String date1 ;
	public static String date2 ;
	public static String filter ;
	public static String whereButton;
	public static String shippedAt;
	
	public static void codeReusable(){
			Properties prop = new Properties();
			FileInputStream input = null;
			try {
				input = new FileInputStream(
						"C:\\Users\\User\\eclipse-workspace\\AjiraTech\\src\\test\\java\\ajiraTech\\TestNG\\Config.properties");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				prop.load(input);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			url = prop.getProperty("url");
			ordersXpath = prop.getProperty("ordersXpath");
			createOrders = prop.getProperty("createOrders");
			dropDown =  prop.getProperty("dropDown");
			item1 = prop.getProperty("item1");
			address = prop.getProperty("address");
			createButton = prop.getProperty("createButton");
			key1 = prop.getProperty("key1");
			calender1 = prop.getProperty("calender1");
			calender2 = prop.getProperty("calender2");
			date1 = prop.getProperty("date1");
			date2 = prop.getProperty("date2");
			filter = prop.getProperty("filter");
			whereButton = prop.getProperty("whereButton");
			shippedAt = prop.getProperty("shippedAt");
			

			
			
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(70));
			driver.manage().window().maximize();
	}

}

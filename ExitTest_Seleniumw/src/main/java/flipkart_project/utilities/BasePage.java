package flipkart_project.utilities;

import java.io.IOException;
import java.lang.reflect.Method;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import flipkart_project.utilities.ExtentManager;
import flipkart_project.utilities.ScreenShots;

public class BasePage {
	
	public static WebDriver driver;
	public static ChromeOptions chrome_option;
	public static FirefoxOptions firefox_options;
	public static EdgeOptions edge_options;
	public static ExtentReports extent;
	public static ExtentTest test;	
	public static final String RESOURCEPATH = System.getProperty("user.dir");
	public static final String EXCELPATH = RESOURCEPATH+"/excel/testdataer.xlsx";
	public static String getExcelpath() {
		return EXCELPATH;
	}

	@BeforeSuite
	public void setup() throws InterruptedException {
		
		if(ReadingPropertiesFile.getProperty("mode").equalsIgnoreCase("non-headless")) {
			if(ReadingPropertiesFile.getProperty("browser").equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "\\driver\\chromedriver.exe");
				driver = new ChromeDriver();
			}
			else if(ReadingPropertiesFile.getProperty("browser").equalsIgnoreCase("ff")){
				System.setProperty("webdriver.firefox.driver",System.getProperty("user.dir") + "\\driver\\msedgedriver.exe");
				driver = new FirefoxDriver();
				}
			else if(ReadingPropertiesFile.getProperty("browser").equalsIgnoreCase("ie")) {
				System.setProperty("webdriver.edge.driver",System.getProperty("user.dir") + "\\driver\\msedgedriver.exe");
				driver = new EdgeDriver();
			}
			else {
				System.out.println("Browser name is not valid");
			}
		}
		else if(ReadingPropertiesFile.getProperty("mode").equalsIgnoreCase("headless")) {
			if(ReadingPropertiesFile.getProperty("browser").equalsIgnoreCase("chrome")) {
				chrome_option = new ChromeOptions();
				chrome_option.setHeadless(true);
				System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "\\driver\\chromedriver.exe");
				driver = new ChromeDriver(chrome_option);			
		}
			else if(ReadingPropertiesFile.getProperty("browser").equalsIgnoreCase("ff")) {
				firefox_options = new FirefoxOptions();
				firefox_options.setHeadless(true);
				System.setProperty("webdriver.firefox.driver",System.getProperty("user.dir") + "\\driver\\msedgedriver.exe");
				driver = new FirefoxDriver(firefox_options);			
		}
//			else if(ReadingPropertiesFile.getProperty("browser").equalsIgnoreCase("ie")) {
//				edge_options = new EdgeOptions();
//				edge_options.setHeadless(true);
//				System.setProperty("webdriver.edge.driver",System.getProperty("user.dir") + "\\driver\\msedgedriver.exe");
//				driver = new EdgeDriver(edge_options);			
//		}
			else {
				System.out.println("Browser name is not valid");
				}
			}
		else {
			System.out.println("Please enter a valid mde to run heaadless or non-headless");			
		}
		driver.manage().window().maximize();		
		extent = ExtentManager.getInstance("reports//Extent_report.html");		
	}	
	
	@BeforeTest	
	public void nevigateToURL() {
	driver.get(ReadingPropertiesFile.getProperty("main_url"));
	} 
	
	@BeforeMethod
	public void startTest(Method method) {
		test= extent.startTest(method.getName());		
	}
	
	@AfterMethod 
	public void status(ITestResult result) throws IOException {
		if (result.getStatus()==ITestResult.SUCCESS)
			test.log(LogStatus.PASS, "Test case got passed");
		else if (result.getStatus()==ITestResult.FAILURE) {
			ScreenShots.takeScreenShot(driver, result.getName());
			test.log(LogStatus.FAIL, "Test case got failed");
		}
		extent.flush();		
	} 
	
	@AfterSuite
	public void closeURL() {
		driver.quit();
	}

}

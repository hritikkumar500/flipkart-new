package flipkart_project.pages;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import flipkart_project.utilities.ReadingTestdataFile;

public class flipKartPlus__Page {

	WebDriver driver;

	public flipKartPlus__Page(WebDriver driver) {
		this.driver = driver;
	}
	                              	
	@FindBy(how = How.XPATH, using = "/html/body/div/div/div[1]/div[1]/div[2]/div[3]/div")
	WebElement login_btn_hover;///a[@innertext='Login']

	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div/div[1]/div[1]/div[2]/div[3]/div/div/div[2]/div[2]/div/ul/li[2]/a")
	WebElement plusZone_btn;

	@FindBy(how = How.CLASS_NAME, using = "_3ywSr_")
	WebElement myCoinBalance_btn;   //_3ywSr_

	@FindBy(how = How.XPATH, using = "/html/body/div/div/div[3]/div/div[2]/div/div[2]/div[1]/div/div/div/img[2]")
	WebElement img;

	public void login_flipkart() throws InterruptedException {

		Actions actions = new Actions(driver);
		actions.moveToElement(login_btn_hover).build().perform();
		plusZone_btn.click();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.titleContains(ReadingTestdataFile.getProperty("flipkartPlusPageTitle")));
		myCoinBalance_btn.click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Thread.sleep(4);
		wait.until(ExpectedConditions.titleContains(ReadingTestdataFile.getProperty("superCoinBalancePage")));
		WebElement i = img;
		Boolean p = (Boolean) ((JavascriptExecutor) driver).executeScript("return arguments[0].complete "
				+ "&& typeof arguments[0].naturalWidth != \"undefined\" " + "&& arguments[0].naturalWidth > 0", i);

		if (p) {
			System.out.println("Logo present");
		} else {
			System.out.println("Logo not present");
		}

	}

}

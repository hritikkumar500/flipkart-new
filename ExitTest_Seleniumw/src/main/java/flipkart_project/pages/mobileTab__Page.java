package flipkart_project.pages;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class mobileTab__Page {

	WebDriver driver;

	public mobileTab__Page(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "/html/body/div/div/div[2]/div/div/div[2]/a/div[1]/div/img")
	WebElement mobile_img;

	@FindBy(how = How.XPATH, using = "/html/body/div/div/div[3]/div[2]/div[2]/div[1]/div/div/div/div[1]/div/div[1]/div/a/div/img")
	WebElement realme_img;

	@FindBy(how = How.XPATH, using = "/html/body/div/div/div[3]/div/div[2]/div[1]/div/div/div[3]/div[2]")
	WebElement priceSort_btn;

	@FindBy(how = How.XPATH, using = "/html/body/div/div/div[3]/div/div[2]/div[2]/div/div/div/a/div[2]/div[1]/div[1]")
	public static WebElement realMeC30_item;

	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div/div[1]/div[1]/div[2]/div[1]/div/a[1]/img")
	public static WebElement gotoHomePage_btn;

	public void mobileTab(String mobilePageTitle, String leastPriceItem_realMe) throws InterruptedException {

		mobile_img.click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		realme_img.click();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.titleContains(mobilePageTitle));
		String mobilePage_title = driver.getTitle();
		Assert.assertEquals(mobilePage_title, mobilePageTitle);
		priceSort_btn.click();
	}

}

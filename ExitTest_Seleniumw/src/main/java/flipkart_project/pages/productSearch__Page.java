package flipkart_project.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import flipkart_project.utilities.ReadingTestdataFile;

public class productSearch__Page {

	WebDriver driver;

	public productSearch__Page(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.NAME, using = "q")
	WebElement searchBar_txt;

	@FindBy(how = How.XPATH, using = "/html/body/div/div/div[1]/div[1]/div[2]/div[2]/form/div/button")
	WebElement searchProductEnter_btn;

	@FindBy(how = How.XPATH, using = "/html/body/div/div/div[3]/div[1]/div[2]/div[2]/div/div/div/a/div[3]/div[1]/div[1]")
	WebElement searchedProductItem_btn;

	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div/div[3]/div[1]/div[2]/div[2]/div/div[1]/h1/span")
	WebElement searchProductItem_txt;

	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div/div/button")
	public static WebElement loginPageClose_btn;

	public void productsearch(String searchProductName, String searchProductPageTitle) throws InterruptedException {

		searchBar_txt.sendKeys(searchProductName);
		searchProductEnter_btn.click();
		Thread.sleep(4000);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.titleContains(ReadingTestdataFile.getProperty("searchProductPageTitle")));
		Assert.assertEquals(driver.getTitle(), ReadingTestdataFile.getProperty("searchProductPageTitle"));
		searchedProductItem_btn.click();

		// To store current window handle
		driver.getWindowHandle();

		// TO switch to new window opened
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}
	}

}

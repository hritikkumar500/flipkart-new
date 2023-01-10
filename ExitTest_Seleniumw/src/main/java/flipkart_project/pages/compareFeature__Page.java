package flipkart_project.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import flipkart_project.utilities.ReadingTestdataFile;

public class compareFeature__Page {
	WebDriver driver;

	public compareFeature__Page(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.NAME, using = "q")
	WebElement searchBar_btn;

	@FindBy(how = How.XPATH, using = "/html/body/div/div/div[1]/div[1]/div[2]/div[2]/form/div/button")
	WebElement search_btn;

	@FindBy(how = How.XPATH, using = "/html/body/div/div/div[3]/div[1]/div[2]/div[2]/div/div/div/a/div[1]/div[2]/div/label/span")
	WebElement firstProductComapreBtn;

	@FindBy(how = How.XPATH, using = "/html/body/div/div/div[3]/div[1]/div[2]/div[3]/div/div/div/a/div[1]/div[2]/div/label/span")
	WebElement secondProductComapreBtn;

	@FindBy(how = How.XPATH, using = "/html/body/div/div/div[4]/div/a")
	WebElement compare_btn;

	@FindBy(how = How.XPATH, using = "/html/body/div/div/div[3]/div/div/div/div[1]/div[1]/div[1]/div/div[1]")
	public static WebElement textAtComparePage;

	public void compareFeaturePage(String flipkartAssuredProductName) {

		searchBar_btn.sendKeys(flipkartAssuredProductName);
		search_btn.click();
		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(
				ExpectedConditions.titleContains(ReadingTestdataFile.getProperty("flipkartAssuredProductPageTitle")));
		Assert.assertEquals(driver.getTitle(), ReadingTestdataFile.getProperty("flipkartAssuredProductPageTitle"));
		System.out.println("Title correct");
		firstProductComapreBtn.click();
		secondProductComapreBtn.click();
		compare_btn.click();
		wait.until(ExpectedConditions.visibilityOf(textAtComparePage)).getText();

	}

}

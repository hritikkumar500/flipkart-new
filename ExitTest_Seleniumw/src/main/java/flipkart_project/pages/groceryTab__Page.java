package flipkart_project.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import flipkart_project.utilities.ReadingTestdataFile;

public class groceryTab__Page {

	WebDriver driver;

	public groceryTab__Page(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "/html/body/div/div/div[2]/div/div/div[1]/a")
	WebElement grocery_img;

	@FindBy(how = How.XPATH, using = "/html/body/div/div/div[1]/div[1]/div[2]/div[3]/div")
	WebElement delivaryPin_btn;

	@FindBy(how = How.XPATH, using = "/html/body/div/div/div[1]/div[1]/div[2]/div[3]/div/div/div[2]/div[2]/div/div/div[1]/form/input")
	WebElement pinCode_txt;

	@FindBy(how = How.XPATH, using = "/html/body/div/div/div[2]/div/div/div[1]/a")
	WebElement staplesOpt_img;

	@FindBy(how = How.XPATH, using = "/html/body/div/div/div[2]/div/div/div[1]/a/div[2]/div[2]/div[2]/div/div/div[1]/a[1]")
	WebElement dalAndPulseOpt_btn;

	@FindBy(how = How.XPATH, using = "/html/body/div/div/div[3]/div[2]/div[2]/div/div[1]/div[1]/div/div[3]/div[2]")
	WebElement priceSortOpt_btn;

	@FindBy(how = How.XPATH, using = "/html/body/div/div/div[3]/div[2]/div[2]/div/div[2]/div/div[1]/div/div/div[1]/div[2]/a/div/div/div[1]")
	public static WebElement minimumPriceItem_txt;

	public void grocertTest(String pinCode) {

		grocery_img.click();

		WebElement delivary_btn = delivaryPin_btn;
		Actions actions = new Actions(driver);
		actions.moveToElement(delivary_btn).build().perform();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement e = pinCode_txt;
		e.sendKeys(pinCode);
		e.sendKeys(Keys.RETURN);

		WebElement staple_btn = staplesOpt_img;
		actions.moveToElement(staple_btn).build().perform();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		dalAndPulseOpt_btn.click();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.titleContains(ReadingTestdataFile.getProperty("dalPulsePageTitle")));
		priceSortOpt_btn.click();

	}

}

package flipkart_project.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import flipkart_project.utilities.ReadingTestdataFile;

public class appliancesBtn__Page {
	WebDriver driver;

	public appliancesBtn__Page(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "/html/body/div/div/div[2]/div/div/div[6]/a")
	WebElement appliances_btn;

	@FindBy(how = How.XPATH, using = "/html/body/div/div/div[2]/div/div/span[1]")
	WebElement electronics_opt;

	@FindBy(how = How.XPATH, using = "/html/body/div/div/div[2]/div/div/span[2]")
	WebElement TVandAppliances_opt;

	@FindBy(how = How.XPATH, using = "/html/body/div/div/div[2]/div/div/span[3]")
	WebElement men_opt;

	@FindBy(how = How.XPATH, using = "/html/body/div/div/div[1]/div[1]/div[2]/div[1]/div/a[1]/img")
	public static WebElement gotoHomePage_btn;

	public void appliancesPage() {

		appliances_btn.click();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.titleContains(ReadingTestdataFile.getProperty("appliancesPageTitle")));
		Assert.assertEquals(driver.getTitle(), ReadingTestdataFile.getProperty("appliancesPageTitle"));
		if (electronics_opt.isDisplayed()) {
			System.out.println("Electronics option is visible");
		} else {
			System.out.println("Electronics option is not visible");
		}
		if (TVandAppliances_opt.isDisplayed()) {
			System.out.println("TV and Appliances option visible");
		} else {
			System.out.println("TV and Appliances option not visible");
		}
		if (men_opt.isDisplayed()) {
			System.out.println("Men option visible");
		} else {
			System.out.println("Men option visible");
		}

	}

}

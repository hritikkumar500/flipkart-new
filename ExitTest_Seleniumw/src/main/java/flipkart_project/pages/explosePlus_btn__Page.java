package flipkart_project.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import flipkart_project.utilities.ReadingTestdataFile;

public class explosePlus_btn__Page {

	WebDriver driver;

	public explosePlus_btn__Page(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "/html/body/div/div/div[1]/div[1]/div[2]/div[1]/div/a[2]")
	WebElement explorePlus_btn;

	@FindBy(how = How.CLASS_NAME, using = "_3ywSr_")
	WebElement myCoinBalance_btn;

	@FindBy(how = How.XPATH, using = "/html/body/div/div/div[3]/div/div[2]/div/div[2]/div[1]/div/div/div/img[2]")
	public static WebElement img;

	public void explorePlusPage() {

		explorePlus_btn.click();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.titleContains(ReadingTestdataFile.getProperty("plusPageTitle")));
		Assert.assertEquals(driver.getTitle(), ReadingTestdataFile.getProperty("plusPageTitle"));
		myCoinBalance_btn.click();
	}

}

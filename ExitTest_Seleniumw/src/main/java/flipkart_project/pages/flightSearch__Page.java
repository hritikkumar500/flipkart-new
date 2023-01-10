package flipkart_project.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import flipkart_project.utilities.ReadingTestdataFile;

public class flightSearch__Page {

	WebDriver driver;

	public flightSearch__Page(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "/html/body/div/div/div[2]/div/div/div[7]/a")
	WebElement travel_btn;

	@FindBy(how = How.NAME, using = "0-departcity")
	WebElement ticketFrom_txt;

	@FindBy(how = How.NAME, using = "0-arrivalcity")
	WebElement ticketTo_txt;

	public void flightSearchPage(String flightFrom, String flightTo) {

		travel_btn.click();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.titleContains(ReadingTestdataFile.getProperty("flightSearchPageTitle")));
		Assert.assertEquals(driver.getTitle(), ReadingTestdataFile.getProperty("flightSearchPageTitle"));
		ticketFrom_txt.sendKeys(flightFrom);
		ticketTo_txt.sendKeys(flightTo);

	}

}

package flipkart_project.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import flipkart_project.utilities.ReadingTestdataFile;

public class twoWheelerTab__Page {

	WebDriver driver;

	public twoWheelerTab__Page(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "/html/body/div/div/div[2]/div/div/div[10]/a/div[1]")
	WebElement twoWheeler_btn_hover;

	@FindBy(how = How.XPATH, using = "/html/body/div/div/div[2]/div/div/div[10]/a/div[2]/div[2]/div[2]/div/div/div/a[2]")
	WebElement electricVehicle_btn;

	@FindBy(how = How.XPATH, using = "/html/body/div/div/div[3]/div[1]/h1")
	WebElement electricVehicleHeading;

	@FindBy(how = How.XPATH, using = "/html/body/div/div/div[3]/div[2]/div/div[1]/div[2]/a")
	WebElement viewAllOpt_btn;

	public void twoWheelerPage() {

		WebElement login_btn = twoWheeler_btn_hover;
		Actions actions = new Actions(driver);
		actions.moveToElement(login_btn).build().perform();
		electricVehicle_btn.click();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(electricVehicleHeading));
		String vehiclePageHeading = electricVehicleHeading.getText();
		Assert.assertEquals(vehiclePageHeading, ReadingTestdataFile.getProperty("electricVehiclePageHeading"));
		viewAllOpt_btn.click();
	}

}

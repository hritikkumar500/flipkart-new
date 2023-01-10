package flipkart.testcases;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import flipkart_project.pages.mobileTab__Page;
import flipkart_project.pages.twoWheelerTab__Page;
import flipkart_project.utilities.BasePage;
import flipkart_project.utilities.ReadingTestdataFile;

public class twoWheelerTab__Test extends BasePage {
	@Test
	public void twoWheelertest() throws InterruptedException {
		twoWheelerTab__Page twoWheeler = PageFactory.initElements(driver, twoWheelerTab__Page.class);
		twoWheeler.twoWheelerPage();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.titleContains(ReadingTestdataFile.getProperty("valueBuyScooterPageTitle")));
		Assert.assertEquals(driver.getTitle(), ReadingTestdataFile.getProperty("valueBuyScooterPageTitle"));
		mobileTab__Page.gotoHomePage_btn.click();
		test.log(LogStatus.PASS, "Two Wheeler page tested");
		Thread.sleep(4000);

	}

}

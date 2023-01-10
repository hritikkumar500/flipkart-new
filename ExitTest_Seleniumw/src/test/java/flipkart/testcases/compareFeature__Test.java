package flipkart.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import flipkart_project.pages.compareFeature__Page;
import flipkart_project.pages.mobileTab__Page;
import flipkart_project.utilities.BasePage;
import flipkart_project.utilities.ReadingTestdataFile;

public class compareFeature__Test extends BasePage {
	@Test
	public void compareTwoProduct() throws InterruptedException {

		compareFeature__Page compare = PageFactory.initElements(driver, compareFeature__Page.class);
		compare.compareFeaturePage(ReadingTestdataFile.getProperty("flipkartAssuredProductName"));
		String textAtComparePage_getText = compareFeature__Page.textAtComparePage.getText();
		Assert.assertEquals(textAtComparePage_getText, ReadingTestdataFile.getProperty("textAtComparePage_getText"));
		mobileTab__Page.gotoHomePage_btn.click();
		test.log(LogStatus.PASS, "Compare feature test page tested");
		Thread.sleep(3000);
	}
}

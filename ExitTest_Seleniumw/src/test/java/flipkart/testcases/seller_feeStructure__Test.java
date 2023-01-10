package flipkart.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import flipkart_project.pages.seller_feeStructure__Page;
import flipkart_project.utilities.BasePage;
import flipkart_project.utilities.ReadingTestdataFile;

public class seller_feeStructure__Test extends BasePage {
	@Test
	public void sellerFeeStructure() throws InterruptedException {

		seller_feeStructure__Page feestructure = PageFactory.initElements(driver, seller_feeStructure__Page.class);
		feestructure.feeStructurePage();
		String pageHeading = seller_feeStructure__Page.feeStructurePageHeading.getText();
		Assert.assertEquals(pageHeading, ReadingTestdataFile.getProperty("feeStructurePageHeading"));
		for (int i = 1; i <= 2; i++) {
			driver.navigate().back();
		}
		test.log(LogStatus.PASS, "fee structure page tested");
		Thread.sleep(4000);

	}

}

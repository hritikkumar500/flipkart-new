package flipkart.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import flipkart_project.pages.mobileTab__Page;
import flipkart_project.utilities.BasePage;
import flipkart_project.utilities.ReadingTestdataFile;

public class mobileTab__Test extends BasePage {
	@Test
	public void mobileTabTest() throws InterruptedException {

		mobileTab__Page mobiletabtest = PageFactory.initElements(driver, mobileTab__Page.class);
		mobiletabtest.mobileTab(ReadingTestdataFile.getProperty("mobilePageTitle"),
				ReadingTestdataFile.getProperty("leastPriceItem_realMe"));
		Thread.sleep(4000);
		String realme = mobileTab__Page.realMeC30_item.getText();
		Assert.assertEquals(realme, ReadingTestdataFile.getProperty("leastPriceItem_realMe"));
		mobileTab__Page.gotoHomePage_btn.click();
		test.log(LogStatus.PASS, "Mobile tab working fine");
		Thread.sleep(4000);
	}

}

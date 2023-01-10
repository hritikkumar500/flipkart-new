package flipkart.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import flipkart_project.pages.pressBtn_Special__ExploreMap_Page;
import flipkart_project.utilities.BasePage;
import flipkart_project.utilities.ReadingTestdataFile;

public class pressBtn_Special__ExploreMap_Test extends BasePage {
	@Test
	public void pressBtn_ExploreMap() throws InterruptedException {
		pressBtn_Special__ExploreMap_Page exploreMap = PageFactory.initElements(driver,
				pressBtn_Special__ExploreMap_Page.class);
		exploreMap.exploreMapPage();
		String sellerMap = pressBtn_Special__ExploreMap_Page.sellerMapPageHeading_txt.getText();
		Assert.assertEquals(sellerMap, ReadingTestdataFile.getProperty("ExpectedSellerMappageheading"));
		for (int i = 1; i <= 3; i++) {
			driver.navigate().back();
		}
		test.log(LogStatus.PASS, "Explore Map functionality tested");
		Thread.sleep(4000);
	}

}

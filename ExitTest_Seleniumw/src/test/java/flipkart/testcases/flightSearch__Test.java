package flipkart.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import flipkart_project.pages.flightSearch__Page;
import flipkart_project.pages.mobileTab__Page;
import flipkart_project.utilities.BasePage;
import flipkart_project.utilities.ReadingTestdataFile;

public class flightSearch__Test extends BasePage {
	@Test
	public void flightSearch() throws InterruptedException {
		flightSearch__Page flightSearch = PageFactory.initElements(driver, flightSearch__Page.class);
		flightSearch.flightSearchPage(ReadingTestdataFile.getProperty("flightFrom"),
				ReadingTestdataFile.getProperty("flightTo"));
		mobileTab__Page.gotoHomePage_btn.click();
		test.log(LogStatus.PASS, "Flight search page tested");
		Thread.sleep(4000);
	}

}

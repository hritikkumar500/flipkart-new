package flipkart.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import flipkart_project.pages.mobileTab__Page;
import flipkart_project.pages.productSearch__Page;
import flipkart_project.utilities.BasePage;
import flipkart_project.utilities.ReadingTestdataFile;

public class productSearch__Test extends BasePage {
	@Test
	public void productsearchTest() throws InterruptedException {

		productSearch__Page productsrch = PageFactory.initElements(driver, productSearch__Page.class);
		productsrch.productsearch(ReadingTestdataFile.getProperty("searchProductName"),
				ReadingTestdataFile.getProperty("searchProductPageTitle"));
		mobileTab__Page.gotoHomePage_btn.click();
		productSearch__Page.loginPageClose_btn.click();
		test.log(LogStatus.PASS, "Product search test run succssfully");
		Thread.sleep(4000);

	}

}

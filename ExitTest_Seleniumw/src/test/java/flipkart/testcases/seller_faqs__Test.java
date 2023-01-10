package flipkart.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import flipkart_project.pages.seller_faqs__Page;
import flipkart_project.utilities.BasePage;

public class seller_faqs__Test extends BasePage {
	@Test
	public void sellerfaqs() throws InterruptedException {
		seller_faqs__Page feqstest = PageFactory.initElements(driver, seller_faqs__Page.class);
		feqstest.sellerFaqsPage();
		for (int i = 1; i <= 2; i++) {
			driver.navigate().back();
		}
		Thread.sleep(4000);
		test.log(LogStatus.PASS, "FAQ page tested");
	}

}

package flipkart.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import flipkart_project.pages.giftCard__Page;
import flipkart_project.pages.mobileTab__Page;
import flipkart_project.utilities.BasePage;

public class giftCard__Test extends BasePage {
	@Test
	public void giftcard() throws InterruptedException {
		giftCard__Page giftcardtest = PageFactory.initElements(driver, giftCard__Page.class);
		giftcardtest.giftcardpage();
		Assert.assertTrue(giftCard__Page.flipkartGiftKart_txt.isDisplayed());
		mobileTab__Page.gotoHomePage_btn.click();
		test.log(LogStatus.PASS, "Gift card page tested");
		Thread.sleep(4000);
	}

}

package flipkart.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import flipkart_project.pages.flipkartAssuredProduct__Page;
import flipkart_project.pages.mobileTab__Page;
import flipkart_project.utilities.BasePage;
import flipkart_project.utilities.ReadingTestdataFile;

public class flipkartAssuredProduct__Test extends BasePage {
	@Test
	public void flipkartAssuredProduc() throws InterruptedException {

		flipkartAssuredProduct__Page assuredProduct = PageFactory.initElements(driver,
				flipkartAssuredProduct__Page.class);
		assuredProduct.assuredProductPage(ReadingTestdataFile.getProperty("flipkartAssuredProductName"));
		String productText = flipkartAssuredProduct__Page.productName_txt.getText();
		Assert.assertEquals(productText, ReadingTestdataFile.getProperty("flipkartAssuredProductDisplayed"));
		if (flipkartAssuredProduct__Page.fAssuredTag_img.isDisplayed()) {

			System.out.println("Searched product is flipkart assured");

		} else {

			System.out.println("Searched product is not flipkart assured");

		}
		mobileTab__Page.gotoHomePage_btn.click();
		Thread.sleep(3000);
		test.log(LogStatus.PASS, "flipkartAssuredProduct test passed");
	}
}

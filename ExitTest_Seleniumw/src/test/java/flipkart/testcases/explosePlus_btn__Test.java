package flipkart.testcases;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import flipkart_project.pages.explosePlus_btn__Page;
import flipkart_project.pages.mobileTab__Page;
import flipkart_project.utilities.BasePage;

public class explosePlus_btn__Test extends BasePage {
	@Test
	public void exploreplusbtn_test() throws InterruptedException {
		explosePlus_btn__Page exploreplus = PageFactory.initElements(driver, explosePlus_btn__Page.class);
		exploreplus.explorePlusPage();
		WebElement i = explosePlus_btn__Page.img;
		// Javascript executor to check image
		Boolean p = (Boolean) ((JavascriptExecutor) driver).executeScript("return arguments[0].complete "
				+ "&& typeof arguments[0].naturalWidth != \"undefined\" " + "&& arguments[0].naturalWidth > 0", i);

		// verify if status is true
		if (p) {
			System.out.println("Logo present");
		} else {
			System.out.println("Logo not present");
		}
		mobileTab__Page.gotoHomePage_btn.click();
		test.log(LogStatus.PASS, "Explore plus button page tested");
		Thread.sleep(4000);
	}

}

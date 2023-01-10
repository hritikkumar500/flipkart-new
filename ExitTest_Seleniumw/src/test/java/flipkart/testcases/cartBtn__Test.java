package flipkart.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import flipkart_project.pages.cartBtn__Page;
import flipkart_project.utilities.BasePage;

public class cartBtn__Test extends BasePage {

	@Test
	public void cartbtnTest() throws InterruptedException {

		cartBtn__Page cartbtn = PageFactory.initElements(driver, cartBtn__Page.class);
		cartbtn.cartbtnpage();
		//test.log(LogStatus.PASS, "Cart button page tested");
		Thread.sleep(4000);

	}

}

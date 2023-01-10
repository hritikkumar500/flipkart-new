package flipkart.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import flipkart_project.pages.flipkartLogin_Page;
import flipkart_project.utilities.BasePage;
import flipkart_project.utilities.ReadingTestdataFile;

public class flipkartLogin_Test extends BasePage {

	@Test
	public void loginFunction() {

		Assert.assertEquals(driver.getTitle(),
				"Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!");
		String t = "Get access to your Orders, Wishlist and Recommendations";

		if (driver.getPageSource().contains(t)) {
			System.out.println("user landed to the login page");
		} else {
			System.out.println("login page fail to open ");
		}
		flipkartLogin_Page login_page = PageFactory.initElements(driver, flipkartLogin_Page.class);
		login_page.login_flipkart(ReadingTestdataFile.getProperty("mobileNumber"));
		//test.log(LogStatus.PASS, "Login page tested");

	}

}

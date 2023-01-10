package flipkart.testcases;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import flipkart_project.pages.groceryTab__Page;
import flipkart_project.utilities.BasePage;
import flipkart_project.utilities.ReadingTestdataFile;

public class groceryTab__Test extends BasePage {
	@Test
	public void groceryitem() throws InterruptedException {

		groceryTab__Page grocery = PageFactory.initElements(driver, groceryTab__Page.class);
		grocery.grocertTest(ReadingTestdataFile.getProperty("pincode"));
		String s1 = groceryTab__Page.minimumPriceItem_txt.getText();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(groceryTab__Page.minimumPriceItem_txt)).getText();
		Assert.assertEquals(s1, ReadingTestdataFile.getProperty("minimumPriceItem_dalsAndPulse"));
		for (int i = 1; i <= 3; i++) {
			driver.navigate().back();
			Thread.sleep(4000);
		}
		test.log(LogStatus.PASS, "Grocery page tested");
	}
}

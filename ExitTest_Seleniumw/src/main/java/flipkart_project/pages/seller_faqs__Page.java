package flipkart_project.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import flipkart_project.utilities.ReadingTestdataFile;

public class seller_faqs__Page {

	WebDriver driver;

	public seller_faqs__Page(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "/html/body/div/div/div[1]/div[1]/div[2]/div[4]/a")
	WebElement becomeASeller_btn;

	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div[1]/div/div[1]/ul/li[4]/a")
	WebElement faqs_btn;

	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div[2]/div[1]")
	WebElement faqsPageHeading;

	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]")
	WebElement faqsPageGeneralOpt;

	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div")
	WebElement faqsPageFeesOpt;

	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div[2]/div[2]/div[2]/div[1]/div[3]/div")
	WebElement faqsPageManagingAccountOpt;

	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div[2]/div[2]/div[2]/div[1]/div[4]/div")
	WebElement faqsPageFBFOpt;

	public void sellerFaqsPage() {

		becomeASeller_btn.click();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.titleContains(ReadingTestdataFile.getProperty("sellerPageTitle")));
		Assert.assertEquals(driver.getTitle(), ReadingTestdataFile.getProperty("sellerPageTitle"));
		faqs_btn.click();
		String pageHeading = faqsPageHeading.getText();
		Assert.assertEquals(pageHeading, ReadingTestdataFile.getProperty("faqsPageHeading"));
		faqsPageGeneralOpt.click();
		faqsPageFeesOpt.click();
		faqsPageManagingAccountOpt.click();
		faqsPageFBFOpt.click();

	}

}

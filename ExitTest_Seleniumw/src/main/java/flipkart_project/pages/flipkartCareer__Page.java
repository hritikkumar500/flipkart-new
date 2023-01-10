package flipkart_project.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import flipkart_project.utilities.ReadingTestdataFile;

public class flipkartCareer__Page {

	WebDriver driver;

	public flipkartCareer__Page(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "/html/body/div/div/footer/div/div[3]/div[1]/div[1]/a[3]")
	WebElement careerOption_btn;

	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div[4]/div/div/header/nav/div/div[2]/ul/li[3]/a")
	WebElement jobsOption_btn;

	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div[4]/div/div/header/nav/div/div[2]/ul/li[3]/ul/li[1]/a")
	WebElement jobsAtIndia_btn;

	@FindBy(how = How.ID, using = "Location_bangalore,karnataka")
	WebElement BangaloreFiler_chkox;

	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div[4]/div/section[2]/div/div/job-list-el/div/div/div[2]/list/section/div/div/div/div[4]/div/div[2]/p/span/b")
	WebElement bangaloresearchresult;

	public void careerPage() {
		careerOption_btn.click();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.titleContains(ReadingTestdataFile.getProperty("careerPageTitle")));
		Assert.assertEquals(driver.getTitle(), ReadingTestdataFile.getProperty("careerPageTitle"));
		jobsOption_btn.click();
		jobsAtIndia_btn.click();
	}

}

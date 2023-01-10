package flipkart_project.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import flipkart_project.utilities.ReadingTestdataFile;

public class pressBtn__Page {

	WebDriver driver;

	public pressBtn__Page(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "/html/body/div/div/footer/div/div[3]/div[1]/div[1]/a[5]")
	WebElement pressOpt_btn;

	@FindBy(how = How.XPATH, using = "/html/body/div[1]/header/div[1]/div/div/div/div/div[2]/div[1]/div/div/nav/div/ul/li[6]/a")
	WebElement podcast_btn;

	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div[1]/div/div/main/article/div/div[1]/section[1]/div/div/div/section/div/div/div/div[1]/div/h1")
	WebElement podcastPageHeading_txt;

	@FindBy(how = How.XPATH, using = "/html/body/div[1]/header/div[1]/div/div/div/div/div[2]/div[1]/div/div/nav/div/ul/li[5]/a")
	WebElement specials_btn;

	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div[1]/div/div/main/article/div/div[1]/section[1]/div/div/div/section/div/div/div/div[1]/div/h1")
	WebElement specialsPageHeading_txt;

	@FindBy(how = How.XPATH, using = "/html/body/div[1]/header/div[1]/div/div/div/div/div[2]/div[1]/div/div/nav/div/ul/li[4]/a")
	WebElement sustainability_btn;

	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div[1]/div/div/main/article/div/div[1]/section[1]/div/div/div/section/div/div/div/div/div/h1")
	public static WebElement sustainabilityPageHeading_txt;

	public void pressbtnPage() {

		pressOpt_btn.click();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.titleContains(ReadingTestdataFile.getProperty("pressPageTitle")));
		Assert.assertEquals(driver.getTitle(), ReadingTestdataFile.getProperty("pressPageTitle"));

		podcast_btn.click();
		String podcastheading = podcastPageHeading_txt.getText();
		Assert.assertEquals(podcastheading, ReadingTestdataFile.getProperty("Expectedpodcastpageheading"));
		specials_btn.click();
		wait.until(ExpectedConditions.visibilityOf(specialsPageHeading_txt)).getText();

		String specialheading = specialsPageHeading_txt.getText();
		Assert.assertEquals(specialheading, ReadingTestdataFile.getProperty("Expectedspecialpageheading"));
		sustainability_btn.click();
		wait.until(ExpectedConditions.visibilityOf(sustainabilityPageHeading_txt)).getText();
	}

}

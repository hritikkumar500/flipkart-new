package flipkart_project.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import flipkart_project.utilities.ReadingTestdataFile;

public class giftCard__Page {

	WebDriver driver;

	public giftCard__Page(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "/html/body/div/div/div[1]/div[1]/div[2]/div[3]/div")
	WebElement login_btn_hover;

	@FindBy(how = How.XPATH, using = "/html/body/div/div/div[1]/div[1]/div[2]/div[3]/div/div/div[2]/div[2]/div/ul/li[6]")
	WebElement giftCard_btn;

	@FindBy(how = How.XPATH, using = "/html/body/div/div/div[3]/div[3]/div/a/div/div/img[2]")
	WebElement giftCardWallet_img;

	@FindBy(how = How.XPATH, using = "/html/body/div/div/div[3]/div/div/div/div/div/div[1]/span[1]")
	public static WebElement flipkartGiftKart_txt;

	public void giftcardpage() {

		WebElement login_btn = login_btn_hover;
		Actions actions = new Actions(driver);
		actions.moveToElement(login_btn).build().perform();
		giftCard_btn.click();

		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.titleContains(ReadingTestdataFile.getProperty("giftCardPageTitle")));
		Assert.assertEquals(driver.getTitle(), ReadingTestdataFile.getProperty("giftCardPageTitle"));
		giftCardWallet_img.click();
	}

}

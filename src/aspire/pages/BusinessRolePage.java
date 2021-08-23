package aspire.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;


public class BusinessRolePage {

    /**

     * All WebElements are identified by @FindBy annotation

     */

    WebDriver driver;

    @FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/div[1]")

    WebElement directorCompany;

    @FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/main[1]/form[1]/div[1]/div[2]/label[1]/div[1]/div[1]/div[1]/div[1]")

    WebElement solutionPlaceHolder;

    @FindBy(xpath="//div[contains(.,'voluptas')]")

    WebElement itemVoluptas;

    @FindBy(xpath="//span[contains(.,'Continue')]")

    WebElement btnContinue;

    @FindBy(xpath="//span[contains(.,'Get Started')]")

    WebElement verifyBlueGetStart;

    @FindBy(xpath = "//button[@class='q-btn q-btn-item non-selectable no-outline aspire-button q-my-md q-btn--standard q-btn--rectangle bg-secondary text-white q-btn--actionable q-focusable q-hoverable q-btn--wrap']")

    WebElement btnBlueGetStart;

    public BusinessRolePage(WebDriver driver){

        this.driver = driver;

        //This initElements method will create all WebElements

        PageFactory.initElements(driver, this);

    }

    //Click director
    public void clickDirector(){

        directorCompany.click();
    }

    //Fill OTP Mobile
    public void setInfo() throws InterruptedException {
        String sMethodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
        Thread.sleep(1000);
        Actions act = new Actions(driver);
        this.clickDirector();
        Thread.sleep(2000);
        solutionPlaceHolder.click();
        Thread.sleep(200);
        itemVoluptas.click();
        Thread.sleep(200);
        solutionPlaceHolder.click();
        Thread.sleep(200);
        btnContinue.click();
        Thread.sleep(8000);
        String as = verifyBlueGetStart.getText();
        Assert.assertTrue(as.contains("Get Started"),sMethodName + " was failed");
        btnBlueGetStart.click();
        Thread.sleep(5000);

    }

}

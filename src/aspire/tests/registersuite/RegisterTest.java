package aspire.tests.registersuite;

import aspire.pages.*;
import org.testng.annotations.Test;

public class RegisterTest extends BasePage {

    @Override
    protected void initData() {
    }

    @Test(priority=1)
    public void RegisterSuite() throws InterruptedException {
        userControl.addLog("Register new account Aspire");
        RegisterPage registerPage = new RegisterPage(driver);
        MobileVerificationPage mobileVerificationPage = new MobileVerificationPage(driver);
        BusinessRolePage businessRolePage = new BusinessRolePage(driver);
        PersonalDetailsPage personalDetailsPage = new PersonalDetailsPage(driver);
        EmailVerificationPage emailVerificationPage = new EmailVerificationPage(driver);
        BusinessDetailsPage businessDetailsPage = new BusinessDetailsPage(driver);

        registerPage.register();
        mobileVerificationPage.setOTPMobile();
        businessRolePage.setInfo();
        personalDetailsPage.setDetails();
        emailVerificationPage.setEmailOTP();
        businessDetailsPage.setBusinessDetails();

    }

}

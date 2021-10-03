import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginPage extends BasePage {

    By phoneNumberButtonLocator = By.id("btn_phoneLogin");
    By checkLoginPage = By.id("inputEmailDiv");

    MailOfUser mailOfUser;
    PasswordOfUser passwordOfUser;

    public LoginPage(WebDriver driver) {
        super(driver);
        passwordOfUser = new PasswordOfUser(driver);
        mailOfUser = new MailOfUser(driver);
    }





    public void clickPhone() { click(phoneNumberButtonLocator );
    }


    public MailOfUser mailOfUser() {
        return this.mailOfUser;
    }

    public PasswordOfUser passwordOfUser() {

        return this.passwordOfUser;
    }

    public boolean isOnLoginPage() {
        return isDisplayed(checkLoginPage);
    }


}

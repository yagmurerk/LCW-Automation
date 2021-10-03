import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class MailOfUser extends BasePage {

    By mailOfUserLocator =  By.id("LoginPhoneNumber");


    public MailOfUser(WebDriver driver) {
        super(driver);
    }


    public void  write1(String text) {
        type(mailOfUserLocator , text );
    }


}

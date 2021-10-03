import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PasswordOfUser extends BasePage {

    By enterLocator = By.id("loginLink");
    By passwordOfUserLocator = By.id("Password");

    public PasswordOfUser(WebDriver driver) {
        super(driver);
    }

    public void write2(String text) {
        type(passwordOfUserLocator, text );
        click(enterLocator);
    }
}

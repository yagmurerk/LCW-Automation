import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Stack;

public class HomePage extends BasePage {

    By checkHomePage = By.id("asyncLoadedExternalScripts");
    By goLoginPageLocator = By.id("header-user-section");
    SearchBox searchBox ;
    LoginPage loginPage;



    public HomePage(WebDriver driver) {
        super(driver) ;
        searchBox = new SearchBox(driver);
        loginPage = new LoginPage(driver);

    }

    public void clickLogin() {
        click(goLoginPageLocator);
    }


    public SearchBox searchBox() {

        return this.searchBox;
    }

    public LoginPage loginPage() {
        return this.loginPage; }


    public boolean isOnHomePage() {
        return isDisplayed(checkHomePage);

    }



}

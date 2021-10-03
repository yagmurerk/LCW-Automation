import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductDetailPage extends BasePage {

    By selectSizeButtonLocator = By.id("option-size");
    By addToChartButtonLocator = By.className("add-to-cart");
    By goCartClickLocator = By.className("header-bag-icon");

    public ProductDetailPage(WebDriver driver) {
        super(driver);
    }

    public boolean isOnProductDetailPage() {
        return isDisplayed(addToChartButtonLocator);

    }

    public void addToCart() {
        click(selectSizeButtonLocator);
        click(addToChartButtonLocator);
        click(goCartClickLocator);

    }
}

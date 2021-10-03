import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductDetailPage extends BasePage {

    By addToChartButtonLocator = By.id("pd_add_to_chart");

    public ProductDetailPage(WebDriver driver) {
        super(driver);
    }

    public boolean isOnProductDetailPage() {
        return isDisplayed(addToChartButtonLocator);

    }

    public void addToCart() {
        click(addToChartButtonLocator);
    }
}

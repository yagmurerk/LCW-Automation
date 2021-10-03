import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends BasePage {

    By spanCartLocator = By.id("spanCart");
    By deleteProductButtonLocator = By.id("Cart_ProductDelete_677052039");

    public CartPage(WebDriver driver) {
        super(driver);

    }

    public boolean isProductPriceSame() {
        return false;
    }

    public void deleteProduct() {

        click(spanCartLocator);
        click(deleteProductButtonLocator);

    }

    public boolean isProductDeleted() {
        return false;

    }
}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends BasePage {

    By spanCartLocator = By.id("spanCart");
    By deleteProductButtonLocator = By.className("cart-square-link");
    By wantToDeleteLocator = By.className("inverted-modal-button");
    By noProductInCartLocator = By.className("cart-empty-title");

    public CartPage(WebDriver driver) {
        super(driver);

    }

    public boolean isProductPriceSame() {
        return isDisplayed(spanCartLocator);
    }

    public void deleteProduct() {

        click(spanCartLocator);
        click(deleteProductButtonLocator);
        click(wantToDeleteLocator);

    }

    public boolean isProductDeleted() {
        return isDisplayed(noProductInCartLocator);

    }
}

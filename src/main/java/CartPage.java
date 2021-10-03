import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends BasePage {

    By increaseProductButtonLocator = By.className("oq-up");
    By spanCartLocator = By.id("spanCart");
    By deleteProductButtonLocator = By.className("cart-square-link");
    By wantToDeleteLocator = By.className("inverted-modal-button");
    By noProductInCartLocator = By.className("cart-empty-title");

    public CartPage(WebDriver driver) {
        super(driver);

    }

    public boolean isProductonCartPage() {
        return isDisplayed(spanCartLocator);
    }

    public void increaseProduct(){
        click(increaseProductButtonLocator);
    }

    public void deleteProduct() {
        click(deleteProductButtonLocator);
    }

    public void acceptDeleting() {
        click(wantToDeleteLocator);
    }

    public boolean isProductDeleted() {
        return isDisplayed(noProductInCartLocator);

    }
}

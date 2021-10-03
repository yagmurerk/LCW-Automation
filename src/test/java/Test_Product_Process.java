import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;


public class Test_Product_Process extends BaseTest {



    HomePage homePage = new HomePage(driver);
    LoginPage loginPage ;
    ProductsPage productsPage ;
    ProductDetailPage productDetailPage ;
    CartPage cartPage ;





    @Test
    @Order(1)
    public void go_login(){
        homePage = new HomePage(driver);
        loginPage = new LoginPage(driver);
        homePage.clickLogin();
        Assertions.assertTrue(loginPage.isOnLoginPage() ,
                "Not on a Login Page");
    }

    @Test
    @Order(2)
    public void login_site() {
        loginPage = new LoginPage(driver);

        loginPage.mailOfUser().write1("yagmurerkk@gmail.com");
        loginPage.passwordOfUser().write2(("Yagmur1997"));
        Assertions.assertTrue(homePage.isOnHomePage() ,
                "Mail or Password is incorrect");
    }



    @Test
    @Order(3)
    public void search_pantolon(){
        productsPage = new ProductsPage(driver);
        homePage.searchBox().search("Pantolon");
        Assertions.assertTrue(productsPage.isOnProductsPage() ,
                "Not on Products Page") ;
    }



    @Test
    @Order(4)
    public void select_product(){
        productDetailPage = new ProductDetailPage(driver);
        productsPage.selectProduct(1);
        Assertions.assertTrue(productDetailPage.isOnProductDetailPage()  ,
                "Not on Product Detail Page");

    }

    @Test
    @Order(5)
    public void add_product_to_cart(){
        cartPage = new CartPage(driver);
        productDetailPage.addToCart();
        Assertions.assertTrue(cartPage.isProductPriceSame(),
                "Product Price is Different");

    }

    @Test
    @Order(6)
    public void delete_the_product(){
        cartPage.deleteProduct() ;
        Assertions.assertTrue(cartPage.isProductDeleted(),
                "Product is not Deleted");

    }

}

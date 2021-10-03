import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@ExtendWith(TestsResultLogger.class)

public class BaseTest {

    WebDriver driver ;


    @BeforeAll
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.lcwaikiki.com/tr-TR/TR");
        driver.get("https://www.lcwaikiki.com/tr-TR/TR/giris");
        driver.manage().window().maximize();

    }
//    @AfterAll
//   public void tearDown(){
 //      driver.quit();
  //  }
}

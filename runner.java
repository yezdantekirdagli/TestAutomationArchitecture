package testRunners;
import Util.DriverFactory;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.openqa.selenium.WebDriver;

@CucumberOptions(
        features = {"src/test/java/Features"},
        glue = {"StepDefinations", "Util"}, //StepDefinationların ve Util'in yerini tanımlamak için
        tags = "", //anatasyon verdiğimiz testleri tagi çalıştırır
        plugin = { //Reporlama için key kelimeler kullanacağız Pretty görsellik katıyor
                "Summary", "Pretty", "html:Reports/CucumberReport/Reports.html"
        }
)


public class runner extends AbstractTestNGCucumberTests { //extend ile class'ın özelliklerini aldık
    static WebDriver driver = DriverFactory.getDriver();
}

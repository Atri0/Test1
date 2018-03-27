import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Atri0 on 06-Mar-18.
 */
public class HomePage {
    private WebDriver driver;
    public String email="xxxAtri0xxx@gmail.com";
    public String password="linkinpark123";
    public HomePage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver=driver;
    }
    @FindBy(css="div.js-toogle-main-menu.b-complex-header__button.b-complex-header__button--burger")
    WebElement DropDownList;
    @FindBy(css="a.b-general-menu__link.b-general-menu__link--login")
    WebElement LoginLink;
    @FindBy(css="div.b-complex-header__button.b-complex-header__button--login-active.js-toogle-main-menu")
    WebElement LoginActive;

    public void logbrowser(){
        for (LogEntry logEntry : driver.manage().logs().get("browser").getAll()) {
            System.out.println(logEntry);}
        driver.get("https://homsters.kz/estate/search");
        for (LogEntry logEntry : driver.manage().logs().get("browser").getAll()) {
            System.out.println(logEntry);
        }
        driver.get("https://homsters.kz/tau-development/abay-130");
        for (LogEntry logEntry1 : driver.manage().logs().get("browser").getAll()) {
            System.out.println(logEntry1);
        }
        driver.get("https://homsters.kz/reviews");
        for (LogEntry logEntry1 : driver.manage().logs().get("browser").getAll()) {
            System.out.println(logEntry1);
        }
        driver.get("https://homsters.kz/leya-komfort-review");
        for (LogEntry logEntry1 : driver.manage().logs().get("browser").getAll()) {
            System.out.println(logEntry1);
        }
    }
}


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Atri0 on 06-Mar-18.
 */
public class LoginPage {
    private WebDriver driver;
    public String email="xxxAtri0xxx@gmail.com";
    public String password="linkinpark123";
    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver=driver;
    }
    @FindBy(css="form>div>input#UserName.form-control")
    WebElement EmailField;
    @FindBy(css="form>div>input#Password.form-control")
    WebElement PasswordField;
    @FindBy(css="form>p>button.btn.btn-primary.btn-full")
    WebElement LoginButton;
    public HomePage ClickLoginButton(){
        LoginButton.click();
        return new HomePage(driver);
    }
}

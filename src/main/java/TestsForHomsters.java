import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

import java.io.File;
import java.util.concurrent.TimeUnit;

/**
 * Created by Atri0 on 06-Mar-18.
 */
public class TestsForHomsters {
    private static ChromeDriverService service;
    public static WebDriver driver;
    @Before
    public void main () throws Exception {
        service = new ChromeDriverService.Builder()
                .usingDriverExecutable(new File("C:\\Users\\Atri0\\Desktop\\chromedriver_win32\\chromedriver.exe"))
                .usingAnyFreePort()
                .build();
        service.start();
        driver = new ChromeDriver(service);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    @Test
    public void FirstTest() {
        driver.get("https://homsters.kz/account/login");
        driver.manage().window().maximize();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.EmailField.sendKeys(loginPage.email);
        loginPage.PasswordField.sendKeys(loginPage.password);
        loginPage.ClickLoginButton();
        HomePage homePage = new HomePage(driver);
        Assert.assertTrue(homePage.LoginActive.isDisplayed());
    }
    @Test
    public void SecondTest(){
        driver.get("https://homsters.kz/");
        driver.manage().window().maximize();
        HomePage homePage=new HomePage(driver);
        homePage.DropDownList.click();
        homePage.LoginLink.click();
        LoginPage loginPage=new LoginPage(driver);
        loginPage.EmailField.sendKeys(loginPage.email);
        loginPage.PasswordField.sendKeys(loginPage.password);
        loginPage.ClickLoginButton();
        Assert.assertTrue(homePage.LoginActive.isDisplayed());
    }
    @Test
    public void ThirdTest(){
        driver.get("https://homsters.kz/");
        HomePage homePage=new HomePage(driver);
        homePage.logbrowser();
        }
    @After
    public void quit(){
        driver.quit();}}


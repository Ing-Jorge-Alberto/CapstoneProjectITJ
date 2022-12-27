import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseTest {
    public WebDriver Driver;

    @BeforeTest(alwaysRun = true)
    public void beforeTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/Users/jxc0622/Documents/WebDrivers/chromedriver");
        this.Driver = new ChromeDriver();
        this.Driver.get("https://www.demoblaze.com/");
        Driver.manage().window().maximize();
        //Thread.sleep(2000);
    }

    @AfterTest(alwaysRun = true)
    public void afterTest() throws InterruptedException {
        //Thread.sleep(2000);
        this.Driver.quit();
    }
}

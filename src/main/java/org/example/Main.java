package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/Users/jxc0622/Documents/WebDrivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.demoblaze.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        String browserTitle = driver.getTitle();
        System.out.println(browserTitle);
        String browserURL= driver.getCurrentUrl();
        System.out.println(browserURL);
        /* Locators
         *Categories = //a[@id='cat'] - Xpath
         *Phones = driver.findElement(By.linkText("Phones")) - By link
         * //a[@class='list-group-item'][2]
         *Laptops = driver.findElement(By.linkText("Laptops")) - By link
         * //a[@class='list-group-item'][3]
         *Monitors = driver.findElement(By.linkText("Monitors")) - By link
         * //a[@class='list-group-item'][4]
         * Galaxy S6
         * driver.findElement(By.linkText("Samsung galaxy s6")) - By Text
         * //a[@class='btn btn-success btn-lg']
         */
        //Valido el texto CATEGORIES
        //String categoriesText = driver.findElement(By.id("cat")).getText();
        String categoriesText = driver.findElement(By.xpath("//a[@id='cat']")).getText();
        System.out.println(categoriesText);
        //Valido el texto Phones
        //String phonesText = driver.findElement(By.linkText("Phones")).getText();
        String phonesText = driver.findElement(By.xpath("//a[@class='list-group-item'][2]")).getText();
        System.out.println("Xpath "+phonesText);
        //Valido el texto Laptops
        String laptopsText = driver.findElement(By.linkText("Laptops")).getText();
        System.out.println("Link Text "+laptopsText);
        //Valido el texto Monitors
        String monitorsText = driver.findElement(By.xpath("//a[@class='list-group-item'][4]")).getText();
        System.out.println("Xpath "+monitorsText);
        //Click en Samsung Galaxy S6
        driver.findElement(By.linkText("Samsung galaxy s6")).click();
        //Click en boton Add to cart
        //driver.findElement(By.xpath("/html[1]/body[1]/div[5]/div[1]/div[2]/div[2]/div[1]/a[1]")).click();
        driver.findElement(By.xpath("//a[@class='btn btn-success btn-lg']")).click();
        //a[class='btn btn-success btn-lg']

        Thread.sleep(2000);
        driver.close();
    }
    /*
    @Test (description = "Test to validate URL")
    public void URLTest(){
        String expected="https://www.demoblaze.com/";
        String actual=Driver.getCurrentUrl();
        CustomAssertions.validURL(expected,actual);
    }
    @Test (description = "Test to validate CATEGORIES is displayed in homepage" )
    public void CategoriesTest(){
        WebElement testCategories=Driver.findElement(By.xpath("//a[@id='cat']"));
        String url = Driver.getCurrentUrl();
        CustomAssertions.isCategoriesDisplayed(testCategories.isDisplayed(),url);
    }
    @Test (description = "Test to validate Phones is displayed in homepage" )
    public void PhonesTest(){
        WebElement testPhones=Driver.findElement(By.xpath("//a[@class='list-group-item'][2]"));
        String url = Driver.getCurrentUrl();
        CustomAssertions.isPhonesDisplayed(testPhones.isDisplayed(),url);
    }
    @Test (description = "Test to validate Laptops is displayed in homepage" )
    public void LaptopsTest(){
        WebElement testLaptops=Driver.findElement(By.linkText("Laptops"));
        String url = Driver.getCurrentUrl();
        CustomAssertions.isLaptopsDisplayed(testLaptops.isDisplayed(),url);
    }
    @Test (description = "Test to validate Monitors is displayed in homepage" )
    public void MonitorsTest(){
        WebElement testMonitors=Driver.findElement(By.xpath("//a[@class='list-group-item'][4]"));
        String url = Driver.getCurrentUrl();
        CustomAssertions.isMonitorsDisplayed(testMonitors.isDisplayed(),url);
    }
    */
}

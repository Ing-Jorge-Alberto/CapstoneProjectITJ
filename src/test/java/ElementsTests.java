import Steps.ElementsSteps;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.time.Duration;

public class ElementsTests extends BaseTest{

    ElementsSteps elementsSteps=new ElementsSteps(Driver);

    @Test (description = "Test to validate SR-12111: Categories, Phones, Laptops and Monitors displayed in home page")
    public void SR12111(){
        String url = Driver.getCurrentUrl();
        WebElement testCategories=Driver.findElement(By.xpath("//a[@id='cat']"));
        CustomAssertions.isCategoriesDisplayed(testCategories.isDisplayed(),url);
        WebElement testPhones=Driver.findElement(By.xpath("//a[@class='list-group-item'][2]"));
        CustomAssertions.isPhonesDisplayed(testPhones.isDisplayed(),url);
        WebElement testLaptops=Driver.findElement(By.linkText("Laptops"));
        CustomAssertions.isLaptopsDisplayed(testLaptops.isDisplayed(),url);
        WebElement testMonitors=Driver.findElement(By.xpath("//a[@class='list-group-item'][4]"));
        CustomAssertions.isMonitorsDisplayed(testMonitors.isDisplayed(),url);
        Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
    }

    @Test (description = "Test to validate SR-12120: Add to cart button, Product description, Price, Name and image of product in product page")
    public void SR12120(){
        //Click en Samsung Galaxy S6
        Driver.findElement(By.linkText("Samsung galaxy s6")).click();
        String url = Driver.getCurrentUrl();
        WebElement testAddButton=Driver.findElement(By.xpath("//a[@class='btn btn-success btn-lg']"));
        CustomAssertions.isAddButtonDisplayed(testAddButton.isDisplayed(),url);
        WebElement testProdDescription=Driver.findElement(By.xpath("//strong[normalize-space()='Product description']"));
        CustomAssertions.isProductDescriptionDisplayed(testProdDescription.isDisplayed(),url);
        WebElement testPrice=Driver.findElement(By.xpath("//h3[@class='price-container']"));
        CustomAssertions.isPriceDisplayed(testPrice.isDisplayed(),url);
        WebElement testName=Driver.findElement(By.xpath("//h2[@class='name']"));
        CustomAssertions.isNameDisplayed(testName.isDisplayed(),url);
        WebElement testImage=Driver.findElement(By.xpath("//div[@id='imgp']"));
        CustomAssertions.isImageDisplayed(testImage.isDisplayed(),url);
    }

    @Test (description = "Test to validate SR-12121: Clicking Add to cart button will display browser alert with Product added and OK button")
    public void SR12121() throws InterruptedException {
        String url = Driver.getCurrentUrl();
        //Click en boton Add to cart
        Driver.findElement(By.xpath("//a[@class='btn btn-success btn-lg']")).click();
        Thread.sleep(2000);
        String alert = Driver.switchTo().alert().getText();
        //Valido Product added en el alert
        CustomAssertions.isAlertDisplayed(alert);
        //Click en el OK del alert
        Driver.switchTo().alert().accept();
        //Thread.sleep(2000);
    }

    @Test (description = "Test to validate SR-12130: Clicking the Cart link will display a list of items added including picture, title, price and delete link, total of items prices and place order button")
    public void SR12130() throws InterruptedException {
        //Click en el link Cart
        Driver.findElement(By.xpath("//a[@id='cartur']")).click();
        String url = Driver.getCurrentUrl();
        WebElement testCartPic=Driver.findElement(By.xpath("//tr[@class='success']//td//img"));
        CustomAssertions.isCartPicDisplayed(testCartPic.isDisplayed(),url);
        WebElement testCartTitle=Driver.findElement(By.xpath("//td[normalize-space()='Samsung galaxy s6']"));
        CustomAssertions.isCartTitleDisplayed(testCartTitle.isDisplayed(),url);
        WebElement testCartPrice=Driver.findElement(By.xpath("//td[normalize-space()='360']"));
        CustomAssertions.isCartPriceDisplayed(testCartPrice.isDisplayed(),url);
        WebElement testCartDelete=Driver.findElement(By.xpath("//a[normalize-space()='Delete']"));
        CustomAssertions.isCartDeleteDisplayed(testCartDelete.isDisplayed(),url);
        WebElement testCartTotal=Driver.findElement(By.xpath("//h3[@id='totalp']"));
        CustomAssertions.isCartTotalDisplayed(testCartTotal.isDisplayed(),url);
        WebElement testCartPlaceButton=Driver.findElement(By.xpath("//button[normalize-space()='Place Order']"));
        CustomAssertions.isCartPlaceDisplayed(testCartPlaceButton.isDisplayed(),url);
    }
}

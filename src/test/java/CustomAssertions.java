import org.testng.Assert;

public class CustomAssertions extends Assert {
    public static void isCategoriesDisplayed (Boolean isCategoriesDisplayed, String url){
        String Message="CATEGORIES is displayed in "+url;
        System.out.println(Message);
        Assert.assertTrue(isCategoriesDisplayed,Message);
    }
    public static void isPhonesDisplayed (Boolean isPhoneDisplayed, String url){
        String Message="Phones is displayed in "+url;
        System.out.println(Message);
        Assert.assertTrue(isPhoneDisplayed,Message);
    }
    public static void isLaptopsDisplayed (Boolean isLaptopsDisplayed, String url){
        String Message="Laptops is displayed in "+url;
        System.out.println(Message);
        Assert.assertTrue(isLaptopsDisplayed,Message);
    }
    public static void isMonitorsDisplayed (Boolean isMonitorsDisplayed, String url){
        String Message="Monitors is displayed in "+url;
        System.out.println(Message);
        Assert.assertTrue(isMonitorsDisplayed,Message);
    }
    /*public static void validURL(String expectedURL, String currentURL){
        String errorMessage="URL "+currentURL+" is not as expected. Expected was: "+expectedURL;
        System.out.println(errorMessage);
        //Assert.assertEquals(currentURL,expectedURL,errorMessage);
        Assert.assertEquals(currentURL,expectedURL);
    }*/
    public static void isAddButtonDisplayed (Boolean isAddButton, String url){
        String Message="Add to cart button is displayed in "+url;
        System.out.println(Message);
        Assert.assertTrue(isAddButton,Message);
    }
    public static void isProductDescriptionDisplayed (Boolean isProdDesc, String url){
        String Message="Product description is displayed in "+url;
        System.out.println(Message);
        Assert.assertTrue(isProdDesc,Message);
    }
    public static void isPriceDisplayed (Boolean isPrice, String url){
        String Message="Price is displayed in "+url;
        System.out.println(Message);
        Assert.assertTrue(isPrice,Message);
    }
    public static void isNameDisplayed (Boolean isName, String url){
        String Message="Name of product is displayed in "+url;
        System.out.println(Message);
        Assert.assertTrue(isName,Message);
    }
    public static void isImageDisplayed (Boolean isImage, String url){
        String Message="Image of product is displayed in "+url;
        System.out.println(Message);
        Assert.assertTrue(isImage,Message);
    }
    public static void isAlertDisplayed(String alert){
        String errorMessage="Product added is not displayed in the alert";
        String expected="Product added";
        Assert.assertEquals(alert,expected,errorMessage);
    }
    public static void isCartPicDisplayed (Boolean isCartPicDisplayed, String url){
        String Message="Picture in Cart page is displayed in "+url;
        System.out.println(Message);
        Assert.assertTrue(isCartPicDisplayed,Message);
    }
    public static void isCartTitleDisplayed (Boolean isCartTitleDisplayed, String url){
        String Message="Title in Cart page is displayed in "+url;
        System.out.println(Message);
        Assert.assertTrue(isCartTitleDisplayed,Message);
    }
    public static void isCartPriceDisplayed (Boolean isCartPriceDisplayed, String url){
        String Message="Price in Cart page is displayed in "+url;
        System.out.println(Message);
        Assert.assertTrue(isCartPriceDisplayed,Message);
    }
    public static void isCartDeleteDisplayed (Boolean isCartDeleteDisplayed, String url){
        String Message="Delete link in Cart page is displayed in "+url;
        System.out.println(Message);
        Assert.assertTrue(isCartDeleteDisplayed,Message);
    }
    public static void isCartTotalDisplayed (Boolean isCartTotalDisplayed, String url){
        String Message="Total of items prices in Cart page is displayed in "+url;
        System.out.println(Message);
        Assert.assertTrue(isCartTotalDisplayed,Message);
    }
    public static void isCartPlaceDisplayed (Boolean isCartPlaceDisplayed, String url){
        String Message="Place order button in Cart page is displayed in "+url;
        System.out.println(Message);
        Assert.assertTrue(isCartPlaceDisplayed,Message);
    }
}

package homework5.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import pageobject.BaseFunc;

public class HomePage {
    private final By ACCEPT_WE_SHIP_INTER_BTN = By.xpath(".//span [contains(@class, 'glow-toaster-button-dismiss')]/span/span");
    private final By ACCEPT_COOKIES_BTN = By.xpath(".//div [(@class = 'sp-cc-buttons')]/span/span/span");
    private BaseFunc baseFunc;
    public HomePage(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
    }


//    public void clickAcceptWeShipInterBtn(By locator) {
//        wait.until(ExpectedConditions.presenceOfElementLocated(locator)).click();
//    }
//    public void clickAcceptCookiesBtn(By locator) {
//        wait.until(ExpectedConditions.presenceOfElementLocated(locator)).click();
//    }
}


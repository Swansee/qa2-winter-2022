package pageobject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pageobject.BaseFunc;

public class SeatInfoPage {
    private final By BOOK_BTN = By.id("book3");
    private final By CHOOSE_SEATS = By.xpath(".//div [contains(@onclick, 'seat')]");

    private BaseFunc baseFunc;

    public SeatInfoPage(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
    }

    public void chooseSeat(String seat) {
        for (WebElement seats : baseFunc.findElements(CHOOSE_SEATS)) {
            if (seats.getText().equals(seat)) {
                baseFunc.clickOnSeatBtn(seat);
//                baseFunc.clickOnBookBtn(BOOK_BTN);
            }
        }
    }
}

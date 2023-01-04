package pageobject.pages;

import org.openqa.selenium.By;
import pageobject.BaseFunc;

public class SuccessfulRegistrationPage {
    private final String TEXT = "Thank You for flying with us!";
    private final By SUCCESSFUL_TEXT = By.xpath(".//div[@class = 'finalTxt']");

    private BaseFunc basefunc;

    public SuccessfulRegistrationPage(BaseFunc basefunc) {
        this.basefunc = basefunc;
    }

    public boolean isSuccessfulRegistrationTextAppears(){
        String textOnPage = basefunc.findElement(SUCCESSFUL_TEXT).getText();
        return textOnPage.equals(TEXT);
    }
}

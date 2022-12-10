//        - переходим на amazon.de
//        - переходим в раздел Best sellers
//        - выбираем книги
//        - запоминаем количество закрашеных звёзд и количество комментариев у 4ой книги
//        - переходим в отзывы по этой книге
//        - проверяем, что количество звёзд и счётчик комментариев показывает верно
//        - *проверяем что комментариев в оеальности правильное количество, тоесть все комменты надо посчитать 🙂


package homework5;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pageobject.BaseFunc;
import pageobject.pages.HomePage;
import pageobject.pages.PassengerInfoPage;

public class AmazonTest {
    private final String URL = "http://amazon.de";
    private pageobject.BaseFunc baseFunc = new BaseFunc();
    @Test
    public void amazonTest() {
        baseFunc.openUrl(URL);
        HomePage homePage = new HomePage(baseFunc);

        BestSellers bestSellers = new BestSellers(baseFunc);
        bestSellers.click(locator);
    }

}

package ru.appline.framework.base;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import ru.appline.framework.pages.StartPage;

public class OzonTest extends BaseTests {

    @ParameterizedTest
    @CsvSource({"iphone"})
    public void firstTest(String word) {
        app.getPage(StartPage.class)
                .checkOpenPage()
                .selectProductSearch(word)
                .clickProductSearch(150000)
                .fillCheckbox("Высокий рейтинг", "true")
                .fillCheckbox("NFC", "true")
                .fillBasket(8)
                .checkOpenPage()
                .closeAlert()
                .checkProductsInBasket()
                .deleteAllProducts()
                .addTextFile();
    }

    @ParameterizedTest
    @CsvSource({"беспроводные наушники"})
    public void secondTest(String word) {
        app.getPage(StartPage.class)
                .checkOpenPage()
                .selectProductSearch(word)
                .clickProductSearch(50000)
                .fillCheckbox("Высокий рейтинг", "true")
                .fillCheckbox("Beats", "true")
                .fillCheckbox("Samsung", "true")
                .fillCheckbox("Xiaomi", "true")
                .fillBasketWithHP()
                .checkOpenPage()
                .closeAlert()
                .checkProductsInBasket()
                .deleteAllProducts()
                .addTextFile();
    }

}

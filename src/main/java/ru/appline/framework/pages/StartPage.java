package ru.appline.framework.pages;

import io.qameta.allure.Step;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class StartPage extends BasePage {
    @FindBy(xpath = "//input[@* = 'Искать на Ozon']")
    WebElement searchElement;

    @FindBy(xpath = "//p[contains(text(), 'Войдите')]")
    WebElement check;

    @Step("Поиск продукта по ключевому слову {nameProduct}")
    public SearchPage selectProductSearch(String nameProduct){
        fillInputField(searchElement, nameProduct);
        Assertions.assertEquals( nameProduct, searchElement.getAttribute("value"), "Наименование продукта " + nameProduct + " в графе поиск заполнено некорректно");
        searchElement.sendKeys(Keys.ENTER);
        return application.getPage(SearchPage.class);
    }
    @Step("Проверка на открытие стартовой страницы")
    public StartPage checkOpenPage() {
        wait.until(ExpectedConditions.visibilityOf(check));
        return this;
    }
}

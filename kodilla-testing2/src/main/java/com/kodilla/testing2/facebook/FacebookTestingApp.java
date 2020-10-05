package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {
    public static final String CREATE_ACCOUNT_BUTTON = "//div[contains(@class, \"_6ltg\")]/a[@role=\"button\"] ";
    public static final String XPATH_SELECT_DAY = " //select[@id='day']";
    public static final String XPATH_SELECT_MONTH = " //select[@id='month']";
    public static final String XPATH_SELECT_YEAR = " //select[@id='year']";

    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com/");

        WebElement createAccountButton = driver.findElement(By.xpath(CREATE_ACCOUNT_BUTTON));
        createAccountButton.click();

        while (!driver.findElement(By.xpath(CREATE_ACCOUNT_BUTTON)).isDisplayed());

        WebElement selectComboDay = driver.findElement(By.xpath(XPATH_SELECT_DAY));
        Select selectBoardDay = new Select(selectComboDay);
        selectBoardDay.selectByIndex(15);

        WebElement selectComboMonth = driver.findElement(By.xpath(XPATH_SELECT_MONTH));
        Select selectBoardMonth = new Select(selectComboMonth);
        selectBoardMonth.selectByIndex(10);

        WebElement selectComboYear = driver.findElement(By.xpath(XPATH_SELECT_YEAR));
        Select selectBoardYear = new Select(selectComboYear);
        selectBoardYear.selectByIndex(80);

    }
}

package org.nowyprojekt;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestScenario {

    @Test
    public void someTest() {
        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--disable-notifications");

        WebDriver driver = new ChromeDriver(options);

        driver.get("https://www.komputronik.pl/");
        By popupZgadzamSieNaWszystko = new By.ByCssSelector("#onetrust-accept-btn-handler");
        driver.findElement(popupZgadzamSieNaWszystko).click();
    }
}

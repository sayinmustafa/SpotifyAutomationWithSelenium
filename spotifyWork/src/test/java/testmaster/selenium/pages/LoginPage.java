package testmaster.selenium.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import testmaster.selenium.methods.Methods;
import testmaster.selenium.test.SpotifyTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginPage {

    private static final Logger logger = LogManager.getLogger(Methods.class);
    Methods methods;

    public LoginPage() {

        methods = new Methods();
    }

    public void controlLoginPage() {

        assertTrue(methods.isElementVisible(By.id("login-username"), 20));
        assertTrue(methods.isElementVisible(By.id("login-password"), 20));
        assertTrue(methods.isElementVisible(By.id("reset-password-link"), 20));
        assertTrue(methods.isElementVisible(By.id("login-button"), 20));

    }

    public void validLogin(String username, String password) {

        methods.sendKeys(By.id("login-username"), username);
        methods.sendKeys(By.id("login-password"), password);
        assertTrue(methods.isElementClickable(By.id("login-button"), 20));
        methods.clickElement(By.id("login-button"));
    }
}

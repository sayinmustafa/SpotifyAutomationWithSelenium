package testmaster.selenium.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import testmaster.selenium.methods.Methods;

public class PlaylistPage {
    private static final Logger logger = LogManager.getLogger(Methods.class);
    Methods methods;

    public PlaylistPage() {
        methods = new Methods();
    }

    public void controlPlayListPage() {
        assertTrue(methods.isElementVisible(By.xpath("//h2[text()='Çalma listesi']"), 20));
        assertTrue(methods.isElementVisible(By.xpath("//h1[text()='Çalma listene ekleyebileceğin bir şeyler bulalım']"), 20));
        logger.info("Playlist page opened.");
    }

    public void clickEditName() {
        methods.clickElement(By.cssSelector(".eczMAK"));
    }

    public void changeName(String setPlaylistName) {
        methods.clear(By.cssSelector("[placeholder='Add a name']"));
        methods.sendKeys(By.cssSelector("[placeholder='Add a name']"), setPlaylistName);
        methods.clickElement(By.xpath("//span[contains(text(),'Kaydet')]"));
        methods.waitBySeconds(2);
        logger.info("Playlist name " + setPlaylistName + " was changed to");
    }

    public void controlPlaylistName() {
        assertTrue(methods.isElementVisible(By.cssSelector("li[data-testid='rootlist-item']"), 20));
        logger.info("playlist created");
    }

    public void playSong() {
        methods.hoverElement(By.xpath("(//div[@data-testid='tracklist-row'])[1]"));
        methods.clickElement(By.xpath("(//button[@class='RfidWIoz8FON2WhFoItU'])[1]"));
        methods.waitBySeconds(12);
        logger.info("song playing");
    }



}



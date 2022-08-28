package testmaster.selenium.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import testmaster.selenium.methods.Methods;

public class SearchPage{
    private static final Logger logger = LogManager.getLogger(Methods.class);
    Methods methods;
    public SearchPage(){
        methods=new Methods();
    }
    public void controlSearchPage(){
        String ad=methods.getAttribute(By.cssSelector("[placeholder='Ne dinlemek istiyorsun?']"),"placeholder");
        Assertions.assertEquals(ad,"Ne dinlemek istiyorsun?");
        logger.info("Search page opened");
    }
    public void searchSong(String song){
        methods.sendKeys(By.cssSelector("[placeholder='Ne dinlemek istiyorsun?']"),song);
        logger.info(song + " was searched");
        methods.waitBySeconds(2);
    }
    public void clickSinger(){
        methods.clickElement(By.xpath("//div[@data-testid='herocard-click-handler']"));
        logger.info("clicked on the singer");
        methods.waitBySeconds(2);
    }
}

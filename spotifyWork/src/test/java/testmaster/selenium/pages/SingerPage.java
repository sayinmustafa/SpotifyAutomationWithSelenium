package testmaster.selenium.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import testmaster.selenium.methods.Methods;

public class SingerPage {
    private static final Logger logger = LogManager.getLogger(Methods.class);
    Methods methods;
    public SingerPage(){
        methods=new Methods();
    }
    public void SingerPageControl(){
        Assert.assertTrue(methods.isElementVisible(By.xpath("//span[text()='Doğrulanmış Sanatçı']"),20));
        Assert.assertTrue(methods.isElementVisible(By.xpath("//h1[text()='Daft Punk']"),20));
        logger.info("singer page opened");
    }
    public void selectSong(){
        methods.hoverElement(By.xpath("(//div[@class='h4HgbO_Uu1JYg5UGANeQ wTUruPetkKdWAR1dd6w4'])[1]"));
        methods.clickElement(By.xpath("(//button[@class='T0anrkk_QA4IAQL29get mYN_ST1TsDdC6q1k1_xs'])[1]"));
        methods.hoverElement(By.xpath("(//button[@class='wC9sIed7pfp47wZbmU6m'])[4]"));
        methods.clickElement(By.xpath("//button[.='Spotify List']"));
    }
}

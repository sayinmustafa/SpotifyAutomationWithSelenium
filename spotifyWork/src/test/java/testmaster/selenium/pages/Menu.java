package testmaster.selenium.pages;

import org.openqa.selenium.By;
import testmaster.selenium.methods.Methods;

public class Menu {
    Methods methods;
    public Menu(){
        methods = new Methods();
    }
    public void clickSearchButton(){
        methods.clickElement(By.xpath("//a[@href='/search']"));
    }
    public void clickMyPlaylist(){
        methods.clickElement(By.cssSelector(".AINMAUImkAYJd4ertQxy"));
    }
}

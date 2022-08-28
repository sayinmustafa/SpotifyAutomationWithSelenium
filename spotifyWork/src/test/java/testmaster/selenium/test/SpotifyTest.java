package testmaster.selenium.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;
import testmaster.selenium.driver.Driver;
import testmaster.selenium.methods.Methods;
import testmaster.selenium.pages.*;

public class SpotifyTest extends Driver {
    private static final Logger logger = LogManager.getLogger(Methods.class);
    GuestPage guestPage;
    LoginPage loginPage;
    HomePage homePage;
    PlaylistPage playlistPage;
    SearchPage searchPage;
    SingerPage singerPage;
    Menu menu;

    @Test
    public void spotifyHomework(){
        init();
        guestPage.controlGuestPage();
        guestPage.clickLoginButton();

        loginPage.controlLoginPage();
        loginPage.validLogin("mustafasayin4116@gmail.com","1234567aA");

        //homePage.closeAdd();
        homePage.loginControl("Mustafa Sayın");
        homePage.newPlaylist();
        homePage.playListControl();

        playlistPage.controlPlayListPage();
        playlistPage.clickEditName();
        playlistPage.changeName("Spotify List");
        playlistPage.controlPlaylistName();

        menu.clickSearchButton();

        searchPage.controlSearchPage();
        searchPage.searchSong("Daft Punk");
        searchPage.clickSinger();

        singerPage.SingerPageControl();
        singerPage.selectSong();

        menu.clickMyPlaylist();

        playlistPage.playSong();

    }
    public void init(){
        playlistPage = new PlaylistPage();
        guestPage = new GuestPage();
        loginPage = new LoginPage();
        homePage = new HomePage();
        searchPage=new SearchPage();
        singerPage=new SingerPage();
        menu =new Menu();

    }
}

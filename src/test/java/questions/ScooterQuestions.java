package questions;

import main.BrowserRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import page.MainPage;

//import static main.Utils.randomString;

public class ScooterQuestions {
    @Rule
    public BrowserRule browserRule = new BrowserRule();



    @Test
    public void checkText1() throws InterruptedException {
        MainPage mainPage = new MainPage(browserRule.getDriver());
        mainPage.open(); // открываем ссылку
        mainPage.clickCookie(); // закрываем куки
        mainPage.scroll(); // скролл
        mainPage.clickQuestion1(); // клик 1й вопрос
        Thread.sleep(500);
        mainPage.checkAnswer1();
    }
    @Test
    public void checkText2() throws InterruptedException {
        MainPage mainPage = new MainPage(browserRule.getDriver());
        mainPage.open(); // открываем ссылку
        mainPage.clickCookie(); // закрываем куки
        mainPage.scroll(); // скролл
        mainPage.clickQuestion2();
        Thread.sleep(500);
        mainPage.checkAnswer2();
    }
    @Test
    public void checkText3() throws InterruptedException {
        MainPage mainPage = new MainPage(browserRule.getDriver());
        mainPage.open(); // открываем ссылку
        mainPage.clickCookie(); // закрываем куки
        mainPage.scroll(); // скролл
        mainPage.clickQuestion3();
        Thread.sleep(500);
        mainPage.checkAnswer3();
    }
    @Test
    public void checkText4() throws InterruptedException {
        MainPage mainPage = new MainPage(browserRule.getDriver());
        mainPage.open(); // открываем ссылку
        mainPage.clickCookie(); // закрываем куки
        mainPage.scroll(); // скролл
        mainPage.clickQuestion4();
        Thread.sleep(500);
        mainPage.checkAnswer4();
    }
    @Test
    public void checkText5() throws InterruptedException {
        MainPage mainPage = new MainPage(browserRule.getDriver());
        mainPage.open(); // открываем ссылку
        mainPage.clickCookie(); // закрываем куки
        mainPage.scroll(); // скролл
        mainPage.clickQuestion5();
        Thread.sleep(500);
        mainPage.checkAnswer5();
    }
    @Test
    public void checkText6() throws InterruptedException {
        MainPage mainPage = new MainPage(browserRule.getDriver());
        mainPage.open(); // открываем ссылку
        mainPage.clickCookie(); // закрываем куки
        mainPage.scroll(); // скролл
        mainPage.clickQuestion6();
        Thread.sleep(500);
        mainPage.checkAnswer6();
    }
    @Test
    public void checkText7() throws InterruptedException {
        MainPage mainPage = new MainPage(browserRule.getDriver());
        mainPage.open(); // открываем ссылку
        mainPage.clickCookie(); // закрываем куки
        mainPage.scroll(); // скролл
        mainPage.clickQuestion7();
        Thread.sleep(500);
        mainPage.checkAnswer7();
    }
    @Test
    public void checkText8() throws InterruptedException {
        MainPage mainPage = new MainPage(browserRule.getDriver());
        mainPage.open(); // открываем ссылку
        mainPage.clickCookie(); // закрываем куки
        mainPage.scroll(); // скролл
        mainPage.clickQuestion8();
        Thread.sleep(500);
        mainPage.checkAnswer8();
    }

}


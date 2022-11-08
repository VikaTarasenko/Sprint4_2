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

/*@RunWith(Parameterized.class)


public class ScooterQuestions {
    @Rule
    public BrowserRule browserRule = new BrowserRule();
    private final String question;

    private final String answer;

    private final String answerText;


    public ScooterQuestions(String question, String answer, String answerText) {
        this.question = question;
        this.answer = answer;
        this.answerText = answerText;

    }

    @Parameterized.Parameters
    public static Object[][] getData() {
        return new Object[][]{
                {".//div[@id='accordion__heading-0']", "accordion__panel-0", "Сутки — 400 рублей. Оплата курьеру — наличными или картой."},
                {".//div[@id='accordion__heading-1']", "accordion__panel-1", "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим."},
                {".//div[@id='accordion__heading-2']", "accordion__panel-2", "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30."},
                {".//div[@id='accordion__heading-3']", "accordion__panel-3", "Только начиная с завтрашнего дня. Но скоро станем расторопнее."},
                {".//div[@id='accordion__heading-4']", "accordion__panel-4", "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010."},
                {".//div[@id='accordion__heading-5']", "accordion__panel-5", "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится."},
                {".//div[@id='accordion__heading-6']", "accordion__panel-6", "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои."},
                {".//div[@id='accordion__heading-7']", "accordion__panel-7", "Да, обязательно. Всем самокатов! И Москве, и Московской области."},
        };
    }
    private WebDriver driver;
    @Test
    public void checkText() throws InterruptedException {
        MainPage mainPage = new MainPage(browserRule.getDriver());
        mainPage.open(); // открываем ссылку
        mainPage.clickCookie(); // закрываем куки
        Thread.sleep(1000);
        mainPage.scroll(); // скролл
        Thread.sleep(1000);
        driver.findElement(By.xpath(question)).click();
        //mainPage.clickQuestion(headingLocator); // клик 1й вопрос
        Thread.sleep(3000);
        String text = driver.findElement(By.id(answer)).getText();
        Thread.sleep(4000);
        Assert.assertEquals(answerText, text);
    }
}*/ //  пробовала так параметризировать - не работает

package page;
import org.junit.Assert;
import org.openqa.selenium.*;

import static java.lang.Thread.sleep;

//import static main.Utils.randomString;

public class MainPage {

    private final String url = "https://qa-scooter.praktikum-services.ru/"; // url входа
    private final By question1 = By.xpath(".//div[@id='accordion__heading-0']");// 1й вопрос списка
    private final By answer1 = By.id("accordion__panel-0"); // ответ на 1й вопрос
    private final By question2 = By.xpath(".//div[@id='accordion__heading-1']"); // 2й вопрос списка
    private final By answer2 = By.id("accordion__panel-1"); // ответ на 2й вопрос
    private final By question3 = By.xpath(".//div[@id='accordion__heading-2']"); // 3й вопрос списка
    private final By answer3 = By.id("accordion__panel-2"); // ответ на 3й вопрос
    private final By question4 = By.xpath(".//div[@id='accordion__heading-3']"); // 4й вопрос списка
    private final By answer4 = By.id("accordion__panel-3"); // ответ на 4й вопрос
    private final By question5 = By.xpath(".//div[@id='accordion__heading-4']"); // 5й вопрос списка
    private final By answer5 = By.id("accordion__panel-4"); // ответ на 5й вопрос
    private final By question6 = By.xpath(".//div[@id='accordion__heading-5']");// 6й вопрос списка
    private final By  answer6 = By.id("accordion__panel-5");// ответ на 6й вопрос
    private final By question7 = By.xpath(".//div[@id='accordion__heading-6']"); // 7й вопрос списка
    private final By answer7 = By.id("accordion__panel-6"); // ответ на 7й вопрос
    private final By question8 = By.xpath(".//div[@id='accordion__heading-7']"); // 8й вопрос списка
    private final By answer8 = By.id("accordion__panel-7"); // ответ на 8й вопрос
    //private final By buttonUpOrder = By.xpath(".//button[@class='Button_Button__ra12g']"); // кнопка Заказать вверху страницы

    // private final By goButton = By.xpath(".//button[text() ='Go!']"); */
    private WebDriver driver;
    //private static final String RANDOM_ORDER_NUMBER = randomString();
    public MainPage(WebDriver driver) {
        this.driver = driver;
    }
    public void open() { //переход по ссылке
        driver.get(url);
    } // переход на сервис
    public void clickCookie() { //закрываем куки
        driver.findElement(By.id("rcc-confirm-button")).click();
    } // закрытие куки


    public void scroll() { // скролл вниз
        WebElement element = driver.findElement(By.id("accordion__heading-0"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);

        //driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL, Keys.END); //скролл страницы
    }
    public void clickQuestion1() { //клик на 1й вопрос
        driver.findElement(question1).click();
    } // клик на 1й вопрос
    public void checkAnswer1() { // проверка наличия текста в ответе на 1й вопрос
        String text = driver.findElement(answer1).getText();
        String expected = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";
        Assert.assertEquals(expected, text);
    }
    public void clickQuestion2() { //клик на 2й вопрос
        driver.findElement(question2).click();
    } // клик на 2й вопрос
    public void checkAnswer2() { // проверка наличия текста в ответе на 2й вопрос
        String text = driver.findElement(answer2).getText();
        String expected = "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";
        Assert.assertEquals(expected, text);
    } // проверка наличия текста в ответе на 2й вопрос
    public void clickQuestion3() { //клик на 3й  вопрос
        driver.findElement(question3).click();
    } // клик на 3й вопрос
    public  void checkAnswer3() { // проверка наличия текста в ответе на 3й вопрос
        String text = driver.findElement(answer3).getText();
        String expected = "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";
        Assert.assertEquals(expected, text);
    }
    public void clickQuestion4() { //клик на 4й  вопрос
        driver.findElement(question4).click();
    } // клик на 4й вопрос
    public void checkAnswer4() { // проверка наличия текста в ответе на 4й вопрос
        String text = driver.findElement(answer4).getText();
        String expected = "Только начиная с завтрашнего дня. Но скоро станем расторопнее.";
        Assert.assertEquals(expected, text);
    } // проверка наличия текста в ответе на 4й вопрос
    public void clickQuestion5() { //клик на 5й  вопрос
        driver.findElement(question5).click();
    } // клик на 5й вопрос
    public void checkAnswer5() { // проверка наличия текста в ответе на 5й вопрос
        String text = driver.findElement(answer5).getText();
        String expected = "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.";
        Assert.assertEquals(expected, text);

    } // проверка наличия текста в ответе на 5й вопрос
    public void clickQuestion6() { //клик на 6й  вопрос
        driver.findElement(question6).click();
    } // клик на 6й вопрос
    public void checkAnswer6() { // проверка наличия текста в ответе на 6й вопрос
        String text = driver.findElement(answer6).getText();
        String expected = "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.";
        Assert.assertEquals(expected, text);
    } // проверка наличия текста в ответе на 6й вопрос
    public void clickQuestion7() { //клик на 7й  вопрос
        driver.findElement(question7).click();
    } // клик на 7й вопрос
    public void checkAnswer7() { // проверка наличия текста в ответе на 7й вопрос
        String text = driver.findElement(answer7).getText();
        String expected = "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.";
        Assert.assertEquals(expected, text);
    } // проверка наличия текста в ответе на 7й вопрос
    public void clickQuestion8() { //клик на 8й  вопрос
        driver.findElement(question8).click();
    } // клик на 8й вопрос
    public void checkAnswer8() { // проверка наличия текста в ответе на 8й вопрос
        String text = driver.findElement(answer8).getText();
        String expected = "Да, обязательно. Всем самокатов! И Москве, и Московской области.";
        Assert.assertEquals(expected, text);

    } // проверка наличия текста в ответе на 8й вопрос

    public OrderPage orderPage() {
        return new OrderPage(driver);
    }
}

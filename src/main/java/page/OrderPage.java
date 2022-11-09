package page;
import org.junit.Assert;
import org.openqa.selenium.*;

import static org.junit.Assert.assertTrue;
public class OrderPage {
    private final String url = "https://qa-scooter.praktikum-services.ru/"; // url входа
    private final By buttonUpOrder = By.xpath(".//button[@class='Button_Button__ra12g']"); // кнопка Заказать вверху страницы
    private final By buttonDownOrder = By.xpath(".//div[@class='Home_FinishButton__1_cWm']/button[text()='Заказать']"); //кнопка Заказать внизу страницы
    public final By userName = By.cssSelector("input[placeholder='* Имя']");// поле Имя
    public final By userSurname = By.cssSelector("input[placeholder='* Фамилия']");// поле Фамилия
    public final By userAdress = By.cssSelector("input[placeholder='* Адрес: куда привезти заказ']");// поле Адрес
    public final By userPhone = By.xpath(".//input[@placeholder='* Телефон: на него позвонит курьер']"); //поле номер телефона
    public final By userComment = By.xpath(".//input[@placeholder='Комментарий для курьера']"); // поле комментария
    private WebDriver driver;
    public OrderPage(WebDriver driver) {
        this.driver = driver;
    }
    public void open() { //переход по ссылке
        driver.get(url);
    }
    public void clickCookie() { //закрываем куки
        driver.findElement(By.id("rcc-confirm-button")).click();
    }

   public void clickButtonOrder(int number) {    // кликаем Заказать вверху и внизу страницы
        if(number == 0) {
            driver.findElement(buttonUpOrder).click(); // верхняя кнопка Заказать
        } else if (number == 1) {
            driver.findElement(buttonDownOrder).click(); // нижняя кнопка Заказать
        }
    }
    /*public boolean IsOrderPageOpen() { // проверка открытия формы заказа, "Для кого заказ"
        return driver.findElements(By.xpath(".//div[@class='Order_Header__BZXOb']")).size() > 0;
    }*/
    public void sendName(String text) { // заполняем поле Имя
        driver.findElement(userName).sendKeys(text);
    }
    public void sendSurnameName(String text) {  // заполняем поле Фамилия
        driver.findElement(userSurname).sendKeys(text);
    }
    public void sendAdress(String text) {  // заполняем поле Адрес
        driver.findElement(userAdress).sendKeys(text);
    }
    public void clickMetro() {      //выбор метро
        driver.findElement(By.cssSelector("input[placeholder='* Станция метро']")).sendKeys("Бульвар Рокоссовского", Keys.ARROW_DOWN, Keys.ENTER);
    }
    public void sendPhoneNumber(String text) {  // заполняем поле номер телефона
        driver.findElement(userPhone).sendKeys(text);
    }
    public void clickButtonNext() {          // клик кнопки Далее
        driver.findElement(By.xpath(". //button[@class='Button_Button__ra12g Button_Middle__1CSJM']")).click();
    }
    /*public boolean IsSecondOrderPageOpen() { // проверка открытия формы заказа, "Про аренду"
        return driver.findElements(By.xpath(".//div[@class='Order_Header__BZXOb']")).size() > 0;
    }*/
    public void clickWhenBringOrder() {   // клик на календарь
        driver.findElement(By.xpath("//input[@placeholder='* Когда привезти самокат']")).click();
    }
    public void choiceWhenBringOrder() {   // выбор даты доставки заказа
        driver.findElement(By.xpath(".//button[@aria-label='Next Month']")).click();
        driver.findElement(By.xpath(".//div[contains(@aria-label, 'Choose')]")).click();
    }
    public void choiceDateRent() {   // выбор срока аренды
        driver.findElement(By.xpath(".//div[@class='Dropdown-placeholder']")).click();
        driver.findElement(By.xpath(".//div[contains(@class, 'Dropdown-option')]")).click();
    }
    public void choiceColor() {   // выбор цвета
        driver.findElement(By.xpath(".//input[@id='black']")).click();
    }
    public void comment(String text) {   // комментарий курьеру
        driver.findElement(userComment).sendKeys(text);
    }
    public void clickToOrder() {   // кликнуть заказать, оформить
        driver.findElement(By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']")).click();
    }
    public void clickYes() {   // кликнуть Да
        driver.findElement(By.xpath(".//button[contains(text(),'Да')] ")).click();
    }
    public void checkOrderPageOpen() { // проверка открытия окна подтверждения заказа
        String text = driver.findElement(By.xpath(".//div[text()='Заказ оформлен']")).getText();
        String expected = "Заказ оформлен";
        Assert.assertEquals(expected, text);

    }
}
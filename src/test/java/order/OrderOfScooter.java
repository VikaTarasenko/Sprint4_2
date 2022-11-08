package order;

import main.BrowserRule;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page.OrderPage;


@RunWith(Parameterized.class)
public class OrderOfScooter {
    @Rule
    public BrowserRule browserRule = new BrowserRule();
    // private final By buttonUpOrder;
    private final String userName;
    private final String userSurname;
    private final String userAdress;
    private final String userPhone;
    private final String userComment;
    private final int number;


    public OrderOfScooter(String userName, String userSurname, String userAdress, String userPhone, String userComment,int number) {
        this.userName = userName;
        this.userSurname = userSurname;
        this.userAdress = userAdress;
        this.userPhone = userPhone;
        this.userComment = userComment;
        this.number = number;

    }
    @Parameterized.Parameters
    public static Object[][] getData() {
        return new Object[][]{
                {"Анна", "Иванова", "Фрязево", "88999999999", "Комментарий короткий", 0},
                {"Гертруда", "Петрова", "Коптево", "87777777777", "не имеет значения", 0},
                {"Анна", "Иванова", "Фрязево", "88999999999", "Комментарий короткий", 1},
                {"Гертруда", "Петрова", "Коптево", "87777777777", "не имеет значения", 1},
        };
    }

    @Test
    public void checkUpOrder() { //проверка заказа через обе кнопки Заказать
        OrderPage orderPage = new OrderPage(browserRule.getDriver());
        orderPage.open();
        orderPage.clickCookie(); // закрываем куки
        orderPage.clickButtonOrder(number);
        orderPage.IsOrderPageOpen();
        orderPage.sendName(userName); //вводим имя
        orderPage.sendSurnameName(userSurname); //вводим фамилию
        orderPage.sendAdress(userAdress); // вводим адрес
        orderPage.clickMetro();
        orderPage.clickMetro();
        orderPage.sendPhoneNumber(userPhone); // вводим номер телефона
        orderPage.clickButtonNext();
        //orderPage.IsSecondOrderPageOpen();
        orderPage.clickWhenBringOrder();
        orderPage.choiceWhenBringOrder();
        orderPage.choiceDateRent();
        orderPage.choiceColor();
        orderPage.comment(userComment); // оставляем комментарий
        orderPage.clickToOrder();
        orderPage.clickYes();
        orderPage.checkOrderPageOpen();
    }
}

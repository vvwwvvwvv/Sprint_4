import org.junit.Test;
import ru.yandex.scooter.pageobject.HomePageScooter;
import static org.junit.Assert.*;

public class HomePageHeaderTests extends BaseTest{
    HomePageScooter homePage = new HomePageScooter(driver);;

    @Override
    public void setUp() {
        System.setProperty("webdriver.chrome.driver","/Users/h4rdy/Downloads/WebDriver/bin/chromedriver");
        driver.get("https://qa-scooter.praktikum-services.ru/order");
    }

    @Test
    public void test11() {
        String actual = homePage.getScooterLink();
        String expected = "https://qa-scooter.praktikum-services.ru/";
        assertEquals(expected, actual);
    }

    @Test
    public void test12() {
        String actual = homePage.getYandexLink();
        String expected = "https://yandex.ru/";
        assertEquals(expected, actual);
    }
}
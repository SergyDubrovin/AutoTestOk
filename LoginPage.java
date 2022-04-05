import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {

    public void authorization(User user) {
        String xPathUsername = "//*[@id=\"field_email\"]";
        $(By.xpath(xPathUsername)).setValue(user.getUsername());
        String xPathPassword = "//*[@id=\"field_password\"]";
        $(By.xpath(xPathPassword)).setValue(user.getPassword()).pressEnter();
    }

}

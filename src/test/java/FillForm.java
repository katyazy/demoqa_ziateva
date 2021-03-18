import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class FillForm {

    @BeforeAll
    static void setup() {
        Configuration.startMaximized = true;
    }

    @Test
    void successfulFillTest() {
        open("https://demoqa.com/automation-practice-form");

        $("#firstName").setValue("Kate");

        $("#lastName").setValue("Ziateva");

        $("#userEmail").setValue("kate@email.com");

        $("[for=\"gender-radio-2\"]").click();

        $("#userNumber").setValue("5553435777");

        $("#dateOfBirthInput").click();



        System.out.println("debug");
    }
}

/* homework 2_1 */

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class FormFillTests {

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
        $(".react-datepicker__month-select").selectOptionByValue("11");
        $(".react-datepicker__year-select").selectOptionByValue("1993");
        $("[aria-label=\"Choose Monday, December 20th, 1993\"]").click();

        $("#subjectsInput").setValue("Maths");
        $("#subjectsInput").pressEnter();

        $("[for='hobbies-checkbox-2']").click();

        $("#uploadPicture").uploadFromClasspath("dog.png");

        $("#currentAddress").setValue("SPb");

        $("#react-select-3-input").setValue("NCR");
        $("#react-select-3-input").pressEnter();

        $("#react-select-4-input").setValue("Noida");
        $("#react-select-4-input").pressEnter();

        $("#submit").click();

        $(".modal-content").shouldHave(text("Kate"),
                text("Ziateva"),
                text("kate@email.com"),
                text("Female"),
                text("5553435777"),
                text("20 December,1993"),
                text("Maths"),
                text("Reading"),
                text("dog.png"),
                text("SPb"),
                text("NCR"),
                text("Noida"));

        /* System.out.println("debug"); */
    }
}

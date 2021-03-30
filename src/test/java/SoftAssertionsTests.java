/* homework 3_2 */

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SoftAssertionsTests {

    @BeforeAll
    static void setup() {
        Configuration.startMaximized = true;
    }

    @Test
    void checkExamplesJUnit5() {
        open("https://github.com/");

        $("[name=q]").setValue("Selenide").pressEnter();

        $("ul.repo-list li a").click();

        $("h1").shouldHave(text("selenide / selenide"));

        $("[data-tab-item='i4wiki-tab']").click();

        $(byText("Soft assertions")).shouldBe(visible).click();

        $("#wiki-content").shouldHave(text("Using JUnit5 extend test class:"));

    }
}

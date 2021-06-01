package tests;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;


import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class DragAndDrop {
    //   Запрограммируйте Drag&Drop с помощью Selenide.actions()
    // - Откройте https://the-internet.herokuapp.com/drag_and_drop
    @Test
    void checkExampleOfCode() {
        open("https://the-internet.herokuapp.com/drag_and_drop");
        //    - Перенесите прямоугольник А на место В
        $("#column-a").dragAndDropTo($("#column-b"));
        // - Проверьте, что прямоугольники действительно поменялись
        $("#column-b")
                .$("header").shouldHave(Condition.text("A"));
        System.out.println("HURRAJ");


    }

}
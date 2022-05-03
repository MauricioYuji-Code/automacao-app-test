package views;

import core.CommonsBaseView;
import org.openqa.selenium.By;

public class Drag extends CommonsBaseView {

    By textDragDrop = By.xpath("//android.widget.TextView[contains(@text, 'Drag em Drop!')]");


    public void validarTextDragDrop() {
        validateTrueConditionByText("Drag em Drop!", textDragDrop);
    }

}

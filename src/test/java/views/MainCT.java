package views;

import core.CommonsBaseView;
import io.appium.java_client.*;
import org.openqa.selenium.*;

public class MainCT extends CommonsBaseView {
    private By buttonFormulario = By.xpath("//android.widget.TextView[contains(@text, 'Formulário')]");
    private By buttonDrag = By.xpath("//android.widget.TextView[contains(@text, 'Drag and drop')]");


    public void verificarMenu() {
        validarElementoApareceu(buttonFormulario);
        validateTrueConditionByText("Formulário", buttonFormulario);
    }

    public void clicarBotaoFormulario() {
        clickElement(buttonFormulario);
    }

    public void rolarAteBotaoDragDrop() {
        rolar(0.9, 0.1);
    }

    public void clicarBotaoDrag() {
        clickElement(buttonDrag);
    }

}

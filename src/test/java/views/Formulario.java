package views;

import core.CommonsBaseView;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class Formulario extends CommonsBaseView {
    private By campo = MobileBy.AccessibilityId("nome");

    public void preencherCampo() {
        fillTextElementMobileBy((MobileBy) campo, "teste");
    }

    public void verificarCampo() {
        validateTrueConditionByText("teste", campo);
    }

}

package stepsDefinitions;


import io.cucumber.java.pt.*;
import views.*;

public class CTAppiumSteps {

    private MainCT mainCT = new MainCT();
    private Formulario formulario = new Formulario();
    private Drag drag = new Drag();

    @Dado("estou na tela principal do app")
    public void estou_na_tela_principal_do_app() {
        mainCT.verificarMenu();
    }

    @Quando("clico no botao formulario")
    public void clico_no_botao_formulario() {
        mainCT.clicarBotaoFormulario();
    }

    @Quando("preencho o campo")
    public void preencho_o_campo() {
        formulario.preencherCampo();
    }

    @Entao("verifico se o campo está preenchido de forma correta")
    public void verifico_se_o_campo_está_preenchido_de_forma_correta() {
        formulario.verificarCampo();
    }

    @Quando("rolo até o botao drag drop")
    public void rolo_até_o_botao_drag_drop() {
        mainCT.rolarAteBotaoDragDrop();
    }

    @Quando("clico no botao drag drop")
    public void clico_no_botao_drag_drop() {
        mainCT.clicarBotaoDrag();
    }

    @Entao("verifico se estou na view esperada")
    public void verifico_se_estou_na_view_esperada() {
        drag.validarTextDragDrop();
    }


}

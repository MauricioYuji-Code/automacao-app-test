# language: pt
@TesteTotal
Funcionalidade: teste app ctAppium

  @Teste1
  Cenario: verificar integridade do campo de formulario
    Dado estou na tela principal do app
    Quando clico no botao formulario
    E preencho o campo
    Entao verifico se o campo está preenchido de forma correta

  @Teste2
  Cenario: rolar até o drag drop
    Dado estou na tela principal do app
    Quando rolo até o botao drag drop
    E clico no botao drag drop
    Entao verifico se estou na view esperada
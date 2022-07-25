Feature: Se espera realizar una promesa de pago de un cliente en AVI Watcher

  @RELEASE_1.0
  Scenario: Realizar una promesa de pago de un cliente
    Given Ingreso al AVI Watcher con los datos "UAT" ,"AVI COBRANZAS", "51999083278"
    When Cliente realiza una promesa de pago - hoy
    Then Se valida que se genere el codigo de resultado PP



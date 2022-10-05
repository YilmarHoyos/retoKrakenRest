#language: es
Característica: Crear Orden de pedido

  Escenario: Realizar un pedido exitoso
    Cuando sebastian envia informacion para realizar el pedido al servicio "https://petstore.swagger.io/v2/store/order"

      | Accept       | application/json         |
      | Content-Type | application/json         |
      | id           |                     1234 |
      | petid        |                     1219 |
      | quantity     |                       12 |
      | shipDate     | 2022-08-24T15:53:18.646Z |
      | status       | placed                   |
      | complete     | true                     |
    Entonces valide que el codigo status del pedido sea 200

#language: es
Característica: Crear Usuario

  Escenario: Registro Exitoso

    Cuando sebastian envia informacion para crear un usuario al servicio "https://petstore.swagger.io/v2/user"
      | Accept       | application/json          | # Se realiza la configuración de la cabecera para que sepa que va en una estura tipo Json  
      | Content-Type | application/json          |
      | id           |                      1219 |
      | username     | sebastian94               |
      | firstname    | Sebastian                 |
      | lastname     | Bernal                    |
      | email        | sebastian.bernal@sqasa.co |
      | password     | sebas1218                 |
      | phone        |                   3685385 |
      | userstatus   |                         1 |
    Entonces valide que el codigo status sea 200

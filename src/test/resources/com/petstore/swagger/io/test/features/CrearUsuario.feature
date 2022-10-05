#language: es
Característica: Crear Usuario

  Escenario: Registro Exitoso

    Cuando sebastian envia informacion para crear un usuario al servicio "https://petstore.swagger.io/v2/user"
      | Accept       | application/json          |
      | Content-Type | application/json          |
      | id           | 1234                      |
      | username     | yilmarcinho10             |
      | firstname    | Yilmar                    |
      | lastname     | Hoyos                     |
      | email        | yilmar.hoyos@sqasa.co     |
      | password     | yilmar123                 |
      | phone        | 3017058948                |
      | userstatus   | 1                         |
    Entonces valide que el codigo status sea 200

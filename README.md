# Nissum Challenge

_API para el registro de usuarios_

## Comenzando 🚀

_A continuación se detalla los paso para la puesta en funcionamiento de forma local de la aplicación para la obtencion de cotizaciones._

### Pre-requisitos 📋

_Debes tener instalado JAVA jdk 17._

_Y Maven para poder compilar el proyecto (https://maven.apache.org/download.cgi)._


### Instalación 🔧

_Una vez clonado el repositorio dirigirse a la carpeta de descarga, para ejecutarlo debe correr la siguiente linea de commandos:_

```
mvn clean install
```
```
mvn spring-boot:run
```

## Pruebas ⚙️

_Para probar el servicio puede hacer un POST como se indica a continuacion o importar el curl en Postman_

```
curl --location 'localhost:8080/nissum/api/user' \
--header 'Accept: application/json' \
--header 'Content-Type: application/json' \
--data-raw '{
  "name": "Juan Rodriguez",
  "email": "juan@rodriguez.org",
  "password": "Hunter2645",
  "phones": [
    {
      "number": "1234567",
      "citycode": "1",
      "contrycode": "57"
    }
  ]
}'
```

## Documentación del endpoint - Swagger 📖

* http://localhost:8080/swagger-ui/index.html


## Construido con 🛠️

* [Maven](https://maven.apache.org/) - Manejador de dependencias

## Autor ✒️

* **Héctor Edgardo del Mastro** - *Challenge Nissum* - [hdelmastro](https://github.com/hdelmastro)


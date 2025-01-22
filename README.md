# Currency Converter Project 💵🌍

👋 ¡Bienvenido al proyecto Conversor de Monedas! Este programa permite convertir entre distintas monedas utilizando tasas de cambio actualizadas obtenidas de una API en tiempo real. Es una aplicación sencilla, modular y fácil de extender. ¡Perfecta para aprender a trabajar con APIs, manejar JSON en Java y realizar cálculos básicos!

## Características principales ✨

- Conversión entre varias monedas (USD, ARS, BRL, COP, etc.).
- Tasas de cambio actualizadas mediante la Exchange Rate API.
- Análisis y procesamiento de JSON con la biblioteca Gson.
- Menú interactivo en consola para una experiencia amigable.
- Código modular y fácil de entender.

## Requisitos previos 🛠️

Antes de ejecutar este proyecto, asegúrate de tener instalado lo siguiente:

- **Java JDK 11 o superior**
  - [Descargar aquí](https://www.oracle.com/java/technologies/javase-downloads.html) o usar OpenJDK.
- **Apache Maven** (para gestionar dependencias y compilar el proyecto)
  - [Guía de instalación de Maven](https://maven.apache.org/install.html).
- **Postman** (opcional, para probar la API manualmente)
  - [Descargar aquí](https://www.postman.com/downloads/).

## Cómo ejecutar el proyecto 🚀

### 1. Clonar el repositorio

Primero, clona este repositorio en tu máquina local:

```bash
git clone https://github.com/tu-usuario/currency-converter-project.git
cd currency-converter-project
```

### 2. Compilar el proyecto

Compila el proyecto con Maven:

```bash
mvn clean install
```

Esto generará un archivo `.jar` en la carpeta `target/`.

### 3. Ejecutar la aplicación

Ejecuta el archivo `.jar` desde la terminal:

```bash
java -jar target/CurrencyConverterProject-1.0-SNAPSHOT.jar
```

### 4. ¡Listo para usar!

Sigue las instrucciones en la consola para realizar conversiones entre monedas.

## Uso de la aplicación 🖥️

Cuando ejecutes la aplicación, verás un menú interactivo como este:

```plaintext
Bienvenido al Conversor de Monedas! 🌍
Por favor, selecciona una opción:
1. Convertir USD a ARS
2. Convertir USD a BRL
3. Convertir USD a COP
4. Salir
Tu elección:
```

1. Introduce la opción correspondiente a la conversión que deseas realizar.
2. Ingresa la cantidad en USD que deseas convertir.
3. El programa te mostrará el resultado de la conversión en tiempo real.

Ejemplo de salida:

```plaintext
Introduce el monto en USD: 100
Monto convertido: 100.00 USD = 18100.00 ARS
```

## Estructura del proyecto 🗂️

El proyecto sigue la estructura estándar de Maven:

```plaintext
CurrencyConverterProject/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── com/
│   │   │   │   └── currencyconverter/
│   │   │   │       ├── Main.java               # Clase principal
│   │   │   │       ├── ApiClient.java          # Lógica de solicitudes HTTP
│   │   │   │       ├── ExchangeRateResponse.java # Modelo para mapear JSON
│   │   │   │       └── CurrencyService.java    # Lógica de conversión
│   │   └── resources/
│   │       └── application.properties          # Configuración (opcional)
├── pom.xml                                      # Archivo de configuración de Maven
```

## Tecnologías utilizadas 🛠️

- **Java 11**: Lenguaje de programación.
- **Apache Maven**: Gestión de dependencias.
- **Gson**: Biblioteca para analizar JSON.
- **HttpClient**: Para realizar solicitudes HTTP.
- **Exchange Rate API**: API para obtener las tasas de cambio.

## Extensiones sugeridas ✨

Si deseas mejorar este proyecto, aquí hay algunas ideas:

1. **Historial de conversiones**:
   - Agrega una funcionalidad que registre las conversiones realizadas y las muestre al usuario.
2. **Soporte para más monedas**:
   - Expande la lista de monedas disponibles en la aplicación.
3. **Interfaz gráfica**:
   - Implementa una interfaz gráfica utilizando JavaFX o Swing.
4. **Registros con marca de tiempo**:
   - Usa la biblioteca `java.time` para registrar la fecha y hora de cada conversión.

## Créditos 👏

Proyecto desarrollado por [Tu Nombre/Usuario].

Este proyecto fue diseñado como un ejercicio para aprender a trabajar con APIs, manejar JSON y crear aplicaciones modulares en Java. 😊

## Licencia 📜

Este proyecto está bajo la Licencia MIT. Puedes usarlo, modificarlo y compartirlo libremente.

Si tienes alguna duda o sugerencia, ¡no dudes en abrir un Issue o contactarme directamente! 🚀


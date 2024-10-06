# <img src="https://cdn-icons-png.flaticon.com/128/4300/4300493.png" alt="Kotlin Projects Logo" width="42" height="30" />  Aplicación del Menú del Restaurante  <img src="https://cdn-icons-png.flaticon.com/128/4300/4300493.png" alt="Kotlin Projects Logo" width="42" height="30" />

## 🌐 [![Português](https://img.shields.io/badge/Português-green)](https://github.com/SamuelRocha91/kotlinVirtualMenu/blob/main/README.md) [![Español](https://img.shields.io/badge/Español-yellow)](https://github.com/SamuelRocha91/kotlinVirtualMenu/blob/main/README_es.md) [![English](https://img.shields.io/badge/English-blue)](https://github.com/SamuelRocha91/kotlinVirtualMenu/blob/main/README_en.md) [![Русский](https://img.shields.io/badge/Русский-lightgrey)](https://github.com/SamuelRocha91/kotlinVirtualMenu/blob/main/README_ru.md) [![中文](https://img.shields.io/badge/中文-red)](https://github.com/SamuelRocha91/kotlinVirtualMenu/blob/main/README_ch.md) [![العربية](https://img.shields.io/badge/العربية-orange)](https://github.com/SamuelRocha91/kotlinVirtualMenu/blob/main/README_ar.md)

Este repositorio contiene el código fuente para una aplicación de Android que muestra un menú de restaurante. La aplicación incluye funcionalidades para ver una lista de platos, detalles de cada plato y navegación entre pantallas.

![Vista previa de la aplicación](./assets/menuVirtual.gif)

<details>
  <summary><h2>🚀 Funcionalidades</h2></summary>

  1. **Pantalla de Inicio del Menú**: 
     - Muestra el logo del restaurante.
     - Título de la pantalla de inicio.
     - Lista de elementos del menú.

  2. **Pantalla de Detalles del Plato**:
     - Muestra el logo del restaurante.
     - Título de la pantalla de detalles.
     - Botón de volver.
     - Imagen del plato.
     - Título del plato.
     - Descripción del plato.
     - Precio del plato.

  3. **Lista de Platos Disponibles**:
     - Incluye platos como Filete de Carne con Papas Fritas, Pollo a la Parrilla con Verduras, Mezcla de Filete de Carne y Pollo a la Parrilla, entre otros.
     - Cada plato tiene una imagen, descripción y precio.

  4. **Diseño del Elemento del Menú**:
     - Utiliza `MaterialCardView` para mostrar cada elemento del menú con una imagen y título.

  5. **Eventos de Clic**:
     - Navegación a la pantalla de detalles al hacer clic en un elemento del menú.
     - Regreso a la pantalla principal al hacer clic en el botón de volver en la pantalla de detalles.

</details>

<details>
  <summary><h2>🛠️ Tecnologías Utilizadas</h2></summary>

  - **Android SDK**: Para el desarrollo de la aplicación de Android.
  - **RecyclerView**: Para mostrar la lista de elementos del menú.
  - **Clases de Datos**: Para representar los datos de los platos.
  - **Adaptadores**: Para enlazar los datos a la interfaz de usuario.
  - **Diseños**: Incluye `LinearLayout`, `ScrollView` y `MaterialCardView` para estructurar las pantallas.

</details>

<details>
  <summary><h2>⚙️ Configuración del Proyecto</h2></summary>

  Para ejecutar el proyecto localmente, sigue los pasos a continuación:

  ### Requisitos Previos

  - [Android Studio](https://developer.android.com/studio) instalado en tu máquina.
  - [JDK 11](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) o superior.

  ### Clonando el Repositorio

  1. Clona el repositorio en tu máquina local:
     ```bash
     git clone git@github.com:SamuelRocha91/kotlinVirtualMenu.git
     ```

  2. Navega hasta el directorio del proyecto:
     ```bash
     cd kotlinVirtualMenu
     ```

  ### Configuración del Proyecto

  1. Abre el proyecto en Android Studio.
  2. Asegúrate de que Android Studio esté configurado para usar JDK 11 o superior.
  3. Sincroniza el proyecto con Gradle:
     - En Android Studio, haz clic en "File" > "Sync Project with Gradle Files".

  ### Ejecutando el Proyecto

  1. Conecta un dispositivo Android a tu computadora o inicia un emulador de Android.
  2. Ejecuta la aplicación:
     - En Android Studio, haz clic en el botón "Run" (ícono de reproducción) en la parte superior de la ventana.

</details>

<details>
  <summary><h2>📂 Estructura de Directorios</h2></summary>

  - `app/src/main/java/com/example/trybevirtualmenu/`: Código fuente de la aplicación.
  - `app/src/main/res/layout/`: Archivos de diseño XML.
  - `app/src/main/res/drawable/`: Imágenes y otros recursos gráficos.

</details>

<details>
  <summary><h2>📁 Otros Proyectos en Kotlin</h2></summary>

  - ☀️ [Weather App](https://github.com/SamuelRocha91/kotlinWeatherApp/blob/main/README_es.md)
  - 👤 [Social Login](https://github.com/SamuelRocha91/kotlinLoginSocial/blob/main/README_es.md)
  - 💱 [kotlin Exchange Rate](https://github.com/SamuelRocha91/kotlinExchangeRate/blob/main/README_es.md)

</details>
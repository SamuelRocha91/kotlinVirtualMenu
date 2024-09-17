# Aplicación de Menú de Restaurante

<h2>🌐</h2>
<ul>
  <li><a href="https://github.com/SamuelRocha91/kotlinVirtualMenu" target="_blank">Português</a></li>
  <li><a href="https://github.com/SamuelRocha91/kotlinVirtualMenu/blob/main/README_es.md" target="_blank">Español</a></li>
  <li><a href="https://github.com/SamuelRocha91/kotlinVirtualMenu/blob/main/README_en.md" target="_blank">English</a></li>
  <li><a href="https://github.com/SamuelRocha91/kotlinVirtualMenu/blob/main/README_ru.md" target="_blank">Русский</a></li>
  <li><a href="https://github.com/SamuelRocha91/kotlinVirtualMenu/blob/main/README_ch.md" target="_blank">中文</a></li>
  <li><a href="https://github.com/SamuelRocha91/kotlinVirtualMenu/blob/main/README_ar.md" target="_blank">العربية</a></li>
</ul>

Este repositorio contiene el código fuente para una aplicación Android que muestra un menú de restaurante. La aplicación incluye funcionalidades para visualizar una lista de platos, detalles de cada plato y navegación entre las pantallas.

![Vista previa de la aplicación](./assets/menuVirtual.gif)

## Funcionalidades

1. **Pantalla Principal del Menú**:
   - Muestra el logotipo del restaurante.
   - Título de la pantalla principal.
   - Lista de los elementos del menú.

2. **Pantalla de Detalles del Plato**:
   - Muestra el logotipo del restaurante.
   - Título de la pantalla de detalles.
   - Botón de volver.
   - Imagen del plato.
   - Título del plato.
   - Descripción del plato.
   - Precio del plato.

3. **Lista de Platos Disponibles**:
   - Incluye platos como Filete de Carne con Papas Fritas, Pollo a la Parrilla con Verduras, Mezcla de Filete de Carne y Pollo a la Parrilla, entre otros.
   - Cada plato tiene una imagen, descripción y precio.

4. **Diseño de Ítem del Menú**:
   - Utiliza `MaterialCardView` para mostrar cada ítem del menú con una imagen y título.

5. **Eventos de Clic**:
   - Navegación a la pantalla de detalles al hacer clic en un ítem del menú.
   - Regreso a la pantalla principal al hacer clic en el botón de volver en la pantalla de detalles.

## Tecnologías Utilizadas

- **Android SDK**: Para el desarrollo de la aplicación Android.
- **RecyclerView**: Para mostrar la lista de ítems del menú.
- **Data Classes**: Para representar los datos de los platos.
- **Adapters**: Para enlazar los datos con la interfaz de usuario.
- **Layouts**: Incluye `LinearLayout`, `ScrollView`, y `MaterialCardView` para estructurar las pantallas.

## Configuración del Proyecto

Para ejecutar el proyecto localmente, sigue los siguientes pasos:

### Requisitos Previos

- [Android Studio](https://developer.android.com/studio) instalado en tu máquina.
- [JDK 11](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) o superior.

### Clonación del Repositorio

1. Clona el repositorio a tu máquina local:
   ```bash
   git clone git@github.com:SamuelRocha91/kotlinVirtualMenu.git
   ```

2. Navega al directorio del proyecto:
   ```bash
   cd kotlinVirtualMenu
   ```

### Configuración del Proyecto

1. Abre el proyecto en Android Studio.
2. Asegúrate de que Android Studio esté configurado para usar JDK 11 o superior.
3. Sincroniza el proyecto con Gradle:
   - En Android Studio, haz clic en "File" > "Sync Project with Gradle Files".

### Ejecutando el Proyecto

1. Conecta un dispositivo Android a tu computadora o inicia un emulador Android.
2. Ejecuta la aplicación:
   - En Android Studio, haz clic en el botón "Run" (ícono de play) en la parte superior de la ventana.

## Estructura de Directorios

- `app/src/main/java/com/exemplo/trybevirtualmenu/`: Código fuente de la aplicación.
- `app/src/main/res/layout/`: Archivos de diseño XML.
- `app/src/main/res/drawable/`: Imágenes y otros recursos gráficos.


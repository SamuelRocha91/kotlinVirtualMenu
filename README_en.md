# <img src="https://cdn-icons-png.flaticon.com/128/4300/4300493.png" alt="Kotlin Projects Logo" width="42" height="30" />  Restaurant Menu Application  <img src="https://cdn-icons-png.flaticon.com/128/4300/4300493.png" alt="Kotlin Projects Logo" width="42" height="30" />

## 🌐 [![Português](https://img.shields.io/badge/Português-green)](https://github.com/SamuelRocha91/kotlinVirtualMenu/blob/main/README.md) [![Español](https://img.shields.io/badge/Español-yellow)](https://github.com/SamuelRocha91/kotlinVirtualMenu/blob/main/README_es.md) [![English](https://img.shields.io/badge/English-blue)](https://github.com/SamuelRocha91/kotlinVirtualMenu/blob/main/README_en.md) [![Русский](https://img.shields.io/badge/Русский-lightgrey)](https://github.com/SamuelRocha91/kotlinVirtualMenu/blob/main/README_ru.md) [![中文](https://img.shields.io/badge/中文-red)](https://github.com/SamuelRocha91/kotlinVirtualMenu/blob/main/README_ch.md) [![العربية](https://img.shields.io/badge/العربية-orange)](https://github.com/SamuelRocha91/kotlinVirtualMenu/blob/main/README_ar.md)

This repository contains the source code for an Android application that displays a restaurant menu. The application includes features to view a list of dishes, details of each dish, and navigation between screens.

![Application Preview](./assets/menuVirtual.gif)

<details>
  <summary><h2>🚀 Features</h2></summary>

  1. **Menu Home Screen**: 
     - Displays the restaurant logo.
     - Title of the home screen.
     - List of menu items.

  2. **Dish Details Screen**:
     - Displays the restaurant logo.
     - Title of the details screen.
     - Back button.
     - Image of the dish.
     - Title of the dish.
     - Description of the dish.
     - Price of the dish.

  3. **Available Dishes List**:
     - Includes dishes like Beef Fillet with Fries, Grilled Chicken with Vegetables, Mixed Grilled Beef Fillet and Chicken, among others.
     - Each dish has an image, description, and price.

  4. **Menu Item Layout**:
     - Uses `MaterialCardView` to display each menu item with an image and title.

  5. **Click Events**:
     - Navigation to the details screen when clicking on a menu item.
     - Return to the main screen when clicking the back button on the details screen.

</details>

<details>
  <summary><h2>🛠️ Technologies Used</h2></summary>

  - **Android SDK**: For developing the Android application.
  - **RecyclerView**: To display the list of menu items.
  - **Data Classes**: To represent the dish data.
  - **Adapters**: To link the data to the user interface.
  - **Layouts**: Includes `LinearLayout`, `ScrollView`, and `MaterialCardView` to structure the screens.

</details>

<details>
  <summary><h2>⚙️ Project Setup</h2></summary>

  To run the project locally, follow the steps below:

  ### Prerequisites

  - [Android Studio](https://developer.android.com/studio) installed on your machine.
  - [JDK 11](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) or higher.

  ### Cloning the Repository

  1. Clone the repository to your local machine:
     ```bash
     git clone git@github.com:SamuelRocha91/kotlinVirtualMenu.git
     ```

  2. Navigate to the project directory:
     ```bash
     cd kotlinVirtualMenu
     ```

  ### Project Configuration

  1. Open the project in Android Studio.
  2. Ensure that Android Studio is configured to use JDK 11 or higher.
  3. Sync the project with Gradle:
     - In Android Studio, click on "File" > "Sync Project with Gradle Files".

  ### Running the Project

  1. Connect an Android device to your computer or start an Android emulator.
  2. Run the application:
     - In Android Studio, click the "Run" button (play icon) at the top of the window.

</details>

<details>
  <summary><h2>📂 Directory Structure</h2></summary>

  - `app/src/main/java/com/example/trybevirtualmenu/`: Source code of the application.
  - `app/src/main/res/layout/`: XML layout files.
  - `app/src/main/res/drawable/`: Images and other graphic resources.

</details>

<details>
  <summary><h2>📁 Other Kotlin Projects</h2></summary>

  - ☀️ [Weather App](https://github.com/SamuelRocha91/kotlinWeatherApp/blob/main/README_en.md)
  - 👤 [Social Login](https://github.com/SamuelRocha91/kotlinLoginSocial/blob/main/README_en.mdl)
  - 💱 [kotlin Exchange Rate](https://github.com/SamuelRocha91/kotlinExchangeRate/blob/main/README_en.md)

</details>

# <img src="https://cdn-icons-png.flaticon.com/128/4300/4300493.png" alt="Kotlin Projects Logo" width="42" height="30" />  Приложение меню ресторана  <img src="https://cdn-icons-png.flaticon.com/128/4300/4300493.png" alt="Kotlin Projects Logo" width="42" height="30" />

## 🌐 [![Português](https://img.shields.io/badge/Português-green)](https://github.com/SamuelRocha91/kotlinVirtualMenu/blob/main/README.md) [![Español](https://img.shields.io/badge/Español-yellow)](https://github.com/SamuelRocha91/kotlinVirtualMenu/blob/main/README_es.md) [![English](https://img.shields.io/badge/English-blue)](https://github.com/SamuelRocha91/kotlinVirtualMenu/blob/main/README_en.md) [![Русский](https://img.shields.io/badge/Русский-lightgrey)](https://github.com/SamuelRocha91/kotlinVirtualMenu/blob/main/README_ru.md) [![中文](https://img.shields.io/badge/中文-red)](https://github.com/SamuelRocha91/kotlinVirtualMenu/blob/main/README_ch.md) [![العربية](https://img.shields.io/badge/العربية-orange)](https://github.com/SamuelRocha91/kotlinVirtualMenu/blob/main/README_ar.md)

Этот репозиторий содержит исходный код для приложения Android, которое отображает меню ресторана. Приложение включает функции для просмотра списка блюд, деталей каждого блюда и навигации между экранами.

![Предпросмотр приложения](./assets/menuVirtual.gif)

<details>
  <summary><h2>🚀 Функциональность</h2></summary>

  1. **Главный экран меню**: 
     - Отображает логотип ресторана.
     - Заголовок главного экрана.
     - Список пунктов меню.

  2. **Экран деталей блюда**:
     - Отображает логотип ресторана.
     - Заголовок экрана деталей.
     - Кнопка "Назад".
     - Изображение блюда.
     - Название блюда.
     - Описание блюда.
     - Цена блюда.

  3. **Список доступных блюд**:
     - Включает такие блюда, как стейк с картофелем фри, курица-гриль с овощами, микс стейка и курицы-гриль и другие.
     - У каждого блюда есть изображение, описание и цена.

  4. **Макет элемента меню**:
     - Использует `MaterialCardView` для отображения каждого пункта меню с изображением и названием.

  5. **События нажатия**:
     - Навигация на экран деталей при нажатии на пункт меню.
     - Возврат на главный экран при нажатии кнопки "Назад" на экране деталей.

</details>

<details>
  <summary><h2>🛠️ Используемые технологии</h2></summary>

  - **Android SDK**: Для разработки приложения Android.
  - **RecyclerView**: Для отображения списка пунктов меню.
  - **Классы данных**: Для представления данных о блюдах.
  - **Адаптеры**: Для связывания данных с пользовательским интерфейсом.
  - **Макеты**: Включает `LinearLayout`, `ScrollView` и `MaterialCardView` для структурирования экранов.

</details>

<details>
  <summary><h2>⚙️ Настройка проекта</h2></summary>

  Чтобы запустить проект локально, выполните следующие шаги:

  ### Предварительные требования

  - Установленный [Android Studio](https://developer.android.com/studio) на вашем компьютере.
  - [JDK 11](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) или выше.

  ### Клонирование репозитория

  1. Клонируйте репозиторий на ваш локальный компьютер:
     ```bash
     git clone git@github.com:SamuelRocha91/kotlinVirtualMenu.git
     ```

  2. Перейдите в каталог проекта:
     ```bash
     cd kotlinVirtualMenu
     ```

  ### Настройка проекта

  1. Откройте проект в Android Studio.
  2. Убедитесь, что Android Studio настроен для использования JDK 11 или выше.
  3. Синхронизируйте проект с Gradle:
     - В Android Studio нажмите "File" > "Sync Project with Gradle Files".

  ### Запуск проекта

  1. Подключите устройство Android к компьютеру или запустите эмулятор Android.
  2. Запустите приложение:
     - В Android Studio нажмите кнопку "Run" (иконка воспроизведения) в верхней части окна.

</details>

<details>
  <summary><h2>📂 Структура каталогов</h2></summary>

  - `app/src/main/java/com/example/trybevirtualmenu/`: Исходный код приложения.
  - `app/src/main/res/layout/`: XML-файлы макетов.
  - `app/src/main/res/drawable/`: Изображения и другие графические ресурсы.

</details>

<details>
  <summary><h2>📁 Другие проекты на Kotlin</h2></summary>

  - ☀️ [Приложение погоды](https://github.com/SamuelRocha91/kotlinWeatherApp/blob/main/README_ru.md)
  - 👤 [Социальный вход](https://github.com/SamuelRocha91/kotlinLoginSocial/blob/main/README_ru.md)
  - 💱 [Kotlin курс](https://github.com/SamuelRocha91/kotlinExchangeRate/blob/main/README_ru.md)

</details>

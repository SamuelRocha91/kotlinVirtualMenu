# Приложение Меню Ресторана

<h2>🌐</h2>
<ul>
  <li><a href="https://github.com/SamuelRocha91/kotlinVirtualMenu" target="_blank">Português</a></li>
  <li><a href="https://github.com/SamuelRocha91/kotlinVirtualMenu/blob/main/README_es.md" target="_blank">Español</a></li>
  <li><a href="https://github.com/SamuelRocha91/kotlinVirtualMenu/blob/main/README_en.md" target="_blank">English</a></li>
  <li><a href="https://github.com/SamuelRocha91/kotlinVirtualMenu/blob/main/README_ru.md" target="_blank">Русский</a></li>
  <li><a href="https://github.com/SamuelRocha91/kotlinVirtualMenu/blob/main/README_ch.md" target="_blank">中文</a></li>
  <li><a href="https://github.com/SamuelRocha91/kotlinVirtualMenu/blob/main/README_ar.md" target="_blank">العربية</a></li>
</ul>

Этот репозиторий содержит исходный код для Android-приложения, которое отображает меню ресторана. Приложение включает функции для просмотра списка блюд, деталей каждого блюда и навигации между экранами.

![Предпросмотр приложения](./assets/menuVirtual.gif)

## Функции

1. **Экран Главного Меню**:
   - Отображает логотип ресторана.
   - Название главного экрана.
   - Список пунктов меню.

2. **Экран Деталей Блюда**:
   - Отображает логотип ресторана.
   - Название экрана деталей.
   - Кнопка возврата.
   - Изображение блюда.
   - Название блюда.
   - Описание блюда.
   - Цена блюда.

3. **Список Доступных Блюд**:
   - Включает блюда, такие как стейк с картошкой фри, курица на гриле с овощами, смешанный гриль из стейка и курицы и другие.
   - Каждое блюдо включает изображение, описание и цену.

4. **Макет Элемента Меню**:
   - Использует `MaterialCardView` для отображения каждого пункта меню с изображением и названием.

5. **События Клика**:
   - Навигация на экран деталей при нажатии на элемент меню.
   - Возврат на главный экран при нажатии кнопки возврата на экране деталей.

## Используемые Технологии

- **Android SDK**: Для разработки Android-приложения.
- **RecyclerView**: Для отображения списка пунктов меню.
- **Data Classes**: Для представления данных о блюдах.
- **Adapters**: Для связывания данных с пользовательским интерфейсом.
- **Layouts**: Включает `LinearLayout`, `ScrollView` и `MaterialCardView` для структурирования экранов.

## Настройка Проекта

Чтобы запустить проект локально, выполните следующие шаги:

### Предварительные Требования

- [Android Studio](https://developer.android.com/studio) установлен на вашем компьютере.
- [JDK 11](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) или новее.

### Клонирование Репозитория

1. Клонируйте репозиторий на ваш локальный компьютер:
   ```bash
   git clone git@github.com:SamuelRocha91/kotlinVirtualMenu.git
   ```

2. Перейдите в каталог проекта:
   ```bash
   cd kotlinVirtualMenu
   ```

### Настройка Проекта

1. Откройте проект в Android Studio.
2. Убедитесь, что Android Studio настроен на использование JDK 11 или новее.
3. Синхронизируйте проект с Gradle:
   - В Android Studio нажмите "File" > "Sync Project with Gradle Files".

### Запуск Проекта

1. Подключите устройство Android к вашему компьютеру или запустите эмулятор Android.
2. Запустите приложение:
   - В Android Studio нажмите кнопку "Run" (иконка воспроизведения) в верхней части окна.

## Структура Директорий

- `app/src/main/java/com/example/trybevirtualmenu/`: Исходный код приложения.
- `app/src/main/res/layout/`: XML-файлы макетов.
- `app/src/main/res/drawable/`: Изображения и другие графические ресурсы.

# <img src="https://italiancoders.it/wp-content/uploads/2018/01/kotlin_250x250.png" alt="Beginner Kotlin Project Logo" width="52" height="30" /> 餐厅菜单应用 <img src="https://italiancoders.it/wp-content/uploads/2018/01/kotlin_250x250.png" alt="Beginner Kotlin Project Logo" width="52" height="30" />

## 🌐 [![Português](https://img.shields.io/badge/Português-green)](https://github.com/SamuelRocha91/kotlinVirtualMenu/blob/main/README.md) [![Español](https://img.shields.io/badge/Español-yellow)](https://github.com/SamuelRocha91/kotlinVirtualMenu/blob/main/README_es.md) [![English](https://img.shields.io/badge/English-blue)](https://github.com/SamuelRocha91/kotlinVirtualMenu/blob/main/README_en.md) [![Русский](https://img.shields.io/badge/Русский-lightgrey)](https://github.com/SamuelRocha91/kotlinVirtualMenu/blob/main/README_ru.md) [![中文](https://img.shields.io/badge/中文-red)](https://github.com/SamuelRocha91/kotlinVirtualMenu) [![العربية](https://img.shields.io/badge/العربية-orange)](https://github.com/SamuelRocha91/kotlinVirtualMenu/blob/main/README_ar.md)

该仓库包含一个 Android 应用程序的源代码，该应用程序展示了餐厅菜单。该应用程序包括查看菜品列表、每道菜的详细信息以及在屏幕之间导航的功能。

![应用预览](./assets/menuVirtual.gif)

## 功能

1. **主菜单屏幕**:
   - 显示餐厅的 logo。
   - 主屏幕的标题。
   - 菜单项列表。

2. **菜品详情屏幕**:
   - 显示餐厅的 logo。
   - 详情屏幕的标题。
   - 返回按钮。
   - 菜品图片。
   - 菜品标题。
   - 菜品描述。
   - 菜品价格。

3. **可用菜品列表**:
   - 包括如炸薯条牛排、烤鸡肉配蔬菜、混合牛排和鸡肉等菜品。
   - 每道菜品都有图片、描述和价格。

4. **菜单项布局**:
   - 使用 `MaterialCardView` 显示每个菜单项的图片和标题。

5. **点击事件**:
   - 点击菜单项时导航到详情屏幕。
   - 点击详情屏幕上的返回按钮返回主屏幕。

## 使用的技术

- **Android SDK**: 用于开发 Android 应用程序。
- **RecyclerView**: 用于显示菜单项列表。
- **数据类**: 用于表示菜品数据。
- **适配器**: 用于将数据绑定到用户界面。
- **布局**: 包括 `LinearLayout`、`ScrollView` 和 `MaterialCardView` 来构建屏幕。

## 项目设置

要在本地运行项目，请按照以下步骤操作：

### 前提条件

- 已在您的计算机上安装 [Android Studio](https://developer.android.com/studio)。
- [JDK 11](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) 或更高版本。

### 克隆仓库

1. 克隆仓库到您的本地计算机：
   ```bash
   git clone git@github.com:SamuelRocha91/kotlinVirtualMenu.git
   ```

2. 进入项目目录：
   ```bash
   cd kotlinVirtualMenu
   ```

### 项目设置

1. 在 Android Studio 中打开项目。
2. 确保 Android Studio 已配置为使用 JDK 11 或更高版本。
3. 与 Gradle 同步项目：
   - 在 Android Studio 中，点击 "File" > "Sync Project with Gradle Files"。

### 运行项目

1. 将 Android 设备连接到计算机或启动 Android 模拟器。
2. 运行应用程序：
   - 在 Android Studio 中，点击窗口顶部的 "Run" 按钮（播放图标）。

## 目录结构

- `app/src/main/java/com/example/trybevirtualmenu/`: 应用程序的源代码。
- `app/src/main/res/layout/`: XML 布局文件。
- `app/src/main/res/drawable/`: 图片和其他图形资源。

## 其他项目

-  ☀️ [Weather App](https://github.com/SamuelRocha91/kotlinWeatherApp/blob/main/README_ch.md)
- 👤 [Social Login](https://github.com/SamuelRocha91/kotlinLoginSocial//blob/main/README_ch.md)

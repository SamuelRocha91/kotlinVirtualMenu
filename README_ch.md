# <img src="https://cdn-icons-png.flaticon.com/128/4300/4300493.png" alt="Kotlin Projects Logo" width="42" height="30" />  餐厅菜单应用  <img src="https://cdn-icons-png.flaticon.com/128/4300/4300493.png" alt="Kotlin Projects Logo" width="42" height="30" />

## 🌐 [![Português](https://img.shields.io/badge/Português-green)](https://github.com/SamuelRocha91/kotlinVirtualMenu/blob/main/README.md) [![Español](https://img.shields.io/badge/Español-yellow)](https://github.com/SamuelRocha91/kotlinVirtualMenu/blob/main/README_es.md) [![English](https://img.shields.io/badge/English-blue)](https://github.com/SamuelRocha91/kotlinVirtualMenu/blob/main/README_en.md) [![Русский](https://img.shields.io/badge/Русский-lightgrey)](https://github.com/SamuelRocha91/kotlinVirtualMenu/blob/main/README_ru.md) [![中文](https://img.shields.io/badge/中文-red)](https://github.com/SamuelRocha91/kotlinVirtualMenu/blob/main/README_ch.md) [![العربية](https://img.shields.io/badge/العربية-orange)](https://github.com/SamuelRocha91/kotlinVirtualMenu/blob/main/README_ar.md)

该仓库包含用于显示餐厅菜单的Android应用程序的源代码。该应用程序包括查看菜肴列表、每道菜的详细信息和屏幕之间导航的功能。

![应用程序预览](./assets/menuVirtual.gif)

<details>
  <summary><h2>🚀 功能</h2></summary>

  1. **菜单主屏幕**: 
     - 显示餐厅的标志。
     - 主屏幕的标题。
     - 菜单项列表。

  2. **菜肴详情屏幕**:
     - 显示餐厅的标志。
     - 详情屏幕的标题。
     - 返回按钮。
     - 菜肴图片。
     - 菜肴标题。
     - 菜肴描述。
     - 菜肴价格。

  3. **可用菜肴列表**:
     - 包括如牛排配薯条、烤鸡配蔬菜、牛排和烤鸡混合等菜肴。
     - 每道菜都有图片、描述和价格。

  4. **菜单项布局**:
     - 使用`MaterialCardView`来展示每个菜单项，包括图片和标题。

  5. **点击事件**:
     - 点击菜单项可导航到详情屏幕。
     - 点击详情屏幕的返回按钮可返回主屏幕。

</details>

<details>
  <summary><h2>🛠️ 使用的技术</h2></summary>

  - **Android SDK**: 用于开发Android应用程序。
  - **RecyclerView**: 用于显示菜单项列表。
  - **数据类**: 用于表示菜肴数据。
  - **适配器**: 将数据绑定到用户界面。
  - **布局**: 包括`LinearLayout`、`ScrollView`和`MaterialCardView`来构建屏幕。

</details>

<details>
  <summary><h2>⚙️ 项目设置</h2></summary>

  要在本地运行该项目，请按照以下步骤操作：

  ### 前提条件

  - 在您的计算机上安装[Android Studio](https://developer.android.com/studio)。
  - [JDK 11](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)或更高版本。

  ### 克隆仓库

  1. 将仓库克隆到本地计算机：
     ```bash
     git clone git@github.com:SamuelRocha91/kotlinVirtualMenu.git
     ```

  2. 导航到项目目录：
     ```bash
     cd kotlinVirtualMenu
     ```

  ### 项目配置

  1. 在Android Studio中打开项目。
  2. 确保Android Studio配置为使用JDK 11或更高版本。
  3. 使用Gradle同步项目：
     - 在Android Studio中，点击“文件” > “与Gradle文件同步”。

  ### 运行项目

  1. 将Android设备连接到计算机或启动Android模拟器。
  2. 执行应用程序：
     - 在Android Studio中，点击窗口顶部的“运行”按钮（播放图标）。

</details>

<details>
  <summary><h2>📂 目录结构</h2></summary>

  - `app/src/main/java/com/example/trybevirtualmenu/`: 应用程序的源代码。
  - `app/src/main/res/layout/`: XML布局文件。
  - `app/src/main/res/drawable/`: 图片和其他图形资源。

</details>

<details>
  <summary><h2>📁 其他Kotlin项目</h2></summary>

  - ☀️ [天气应用](https://github.com/SamuelRocha91/kotlinWeatherApp/blob/main/README_ch.md)
  - 👤 [社交登录](https://github.com/SamuelRocha91/kotlinLoginSocial/blob/main/README_ch.md)
  - 💱 [Kotlin汇率](https://github.com/SamuelRocha91/kotlinExchangeRate/blob/main/README_ch.md)

</details>

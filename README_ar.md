# <img src="https://cdn-icons-png.flaticon.com/128/4300/4300493.png" alt="Kotlin Projects Logo" width="42" height="30" />  تطبيق قائمة المطعم  <img src="https://cdn-icons-png.flaticon.com/128/4300/4300493.png" alt="Kotlin Projects Logo" width="42" height="30" />

## 🌐 [![Português](https://img.shields.io/badge/Português-green)](https://github.com/SamuelRocha91/kotlinVirtualMenu/blob/main/README.md) [![Español](https://img.shields.io/badge/Español-yellow)](https://github.com/SamuelRocha91/kotlinVirtualMenu/blob/main/README_es.md) [![English](https://img.shields.io/badge/English-blue)](https://github.com/SamuelRocha91/kotlinVirtualMenu/blob/main/README_en.md) [![Русский](https://img.shields.io/badge/Русский-lightgrey)](https://github.com/SamuelRocha91/kotlinVirtualMenu/blob/main/README_ru.md) [![中文](https://img.shields.io/badge/中文-red)](https://github.com/SamuelRocha91/kotlinVirtualMenu/blob/main/README_ch.md) [![العربية](https://img.shields.io/badge/العربية-orange)](https://github.com/SamuelRocha91/kotlinVirtualMenu/blob/main/README_ar.md)

هذا المستودع يحتوي على الشيفرة المصدرية لتطبيق Android الذي يعرض قائمة مطعم. يتضمن التطبيق ميزات لعرض قائمة الأطباق، تفاصيل كل طبق والتنقل بين الشاشات.

![معاينة التطبيق](./assets/menuVirtual.gif)

<details>
  <summary><h2>🚀 الميزات</h2></summary>

  1. **الشاشة الرئيسية للقائمة**: 
     - تعرض شعار المطعم.
     - عنوان الشاشة الرئيسية.
     - قائمة عناصر القائمة.

  2. **شاشة تفاصيل الطبق**:
     - تعرض شعار المطعم.
     - عنوان شاشة التفاصيل.
     - زر العودة.
     - صورة الطبق.
     - اسم الطبق.
     - وصف الطبق.
     - سعر الطبق.

  3. **قائمة الأطباق المتاحة**:
     - تشمل أطباق مثل شريحة لحم مع بطاطس مقلية، دجاج مشوي مع خضار، مزيج من شريحة اللحم والدجاج المشوي، وغيرها.
     - لكل طبق صورة، وصف وسعر.

  4. **تخطيط عنصر القائمة**:
     - يستخدم `MaterialCardView` لعرض كل عنصر من عناصر القائمة مع صورة وعنوان.

  5. **أحداث النقر**:
     - التنقل إلى شاشة التفاصيل عند النقر على عنصر من القائمة.
     - العودة إلى الشاشة الرئيسية عند النقر على زر العودة في شاشة التفاصيل.

</details>

<details>
  <summary><h2>🛠️ التقنيات المستخدمة</h2></summary>

  - **Android SDK**: لتطوير تطبيق Android.
  - **RecyclerView**: لعرض قائمة عناصر القائمة.
  - **فئات البيانات**: لتمثيل بيانات الأطباق.
  - **Adapters**: لربط البيانات بواجهة المستخدم.
  - **التخطيطات**: تشمل `LinearLayout`، `ScrollView` و `MaterialCardView` لهيكلة الشاشات.

</details>

<details>
  <summary><h2>⚙️ إعداد المشروع</h2></summary>

  لتشغيل المشروع محليًا، اتبع الخطوات التالية:

  ### المتطلبات المسبقة

  - تثبيت [Android Studio](https://developer.android.com/studio) على جهاز الكمبيوتر الخاص بك.
  - [JDK 11](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) أو أعلى.

  ### استنساخ المستودع

  1. استنسخ المستودع إلى جهاز الكمبيوتر المحلي الخاص بك:
     ```bash
     git clone git@github.com:SamuelRocha91/kotlinVirtualMenu.git
     ```

  2. انتقل إلى دليل المشروع:
     ```bash
     cd kotlinVirtualMenu
     ```

  ### إعداد المشروع

  1. افتح المشروع في Android Studio.
  2. تأكد من أن Android Studio مُعد لاستخدام JDK 11 أو أعلى.
  3. مزامنة المشروع مع Gradle:
     - في Android Studio، انقر على "File" > "Sync Project with Gradle Files".

  ### تشغيل المشروع

  1. قم بتوصيل جهاز Android بجهاز الكمبيوتر أو قم بتشغيل محاكي Android.
  2. قم بتشغيل التطبيق:
     - في Android Studio، انقر على زر "Run" (رمز التشغيل) في الجزء العلوي من النافذة.

</details>

<details>
  <summary><h2>📂 هيكل الدليل</h2></summary>

  - `app/src/main/java/com/example/trybevirtualmenu/`: الشيفرة المصدرية للتطبيق.
  - `app/src/main/res/layout/`: ملفات التخطيط XML.
  - `app/src/main/res/drawable/`: الصور وموارد الرسوم الأخرى.

</details>

<details>
  <summary><h2>📁 مشاريع أخرى على Kotlin</h2></summary>

  - ☀️ [تطبيق الطقس](https://github.com/SamuelRocha91/kotlinWeatherApp/blob/main/README_ar.md)
  - 👤 [تسجيل الدخول الاجتماعي](https://github.com/SamuelRocha91/kotlinLoginSocial/blob/main/README_ar.md)
  - 💱 [سعر الصرف Kotlin](https://github.com/SamuelRocha91/kotlinExchangeRate/blob/main/README_ar.md)

</details>

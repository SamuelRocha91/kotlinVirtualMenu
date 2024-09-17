# تطبيق قائمة الطعام للمطاعم

<h2>🌐</h2>
<ul>
  <li><a href="https://github.com/SamuelRocha91/kotlinVirtualMenu" target="_blank">Português</a></li>
  <li><a href="https://github.com/SamuelRocha91/kotlinVirtualMenu/blob/main/README_es.md" target="_blank">Español</a></li>
  <li><a href="https://github.com/SamuelRocha91/kotlinVirtualMenu/blob/main/README_en.md" target="_blank">English</a></li>
  <li><a href="https://github.com/SamuelRocha91/kotlinVirtualMenu/blob/main/README_ru.md" target="_blank">Русский</a></li>
  <li><a href="https://github.com/SamuelRocha91/kotlinVirtualMenu/blob/main/README_ch.md" target="_blank">中文</a></li>
  <li><a href="https://github.com/SamuelRocha91/kotlinVirtualMenu/blob/main/README_ar.md" target="_blank">العربية</a></li>
</ul>

يحتوي هذا المستودع على الشيفرة المصدرية لتطبيق Android يعرض قائمة طعام للمطعم. يشمل التطبيق ميزات لعرض قائمة الأطباق، تفاصيل كل طبق، والتنقل بين الشاشات.

![معاينة التطبيق](./assets/menuVirtual.gif)

## الميزات

1. **شاشة القائمة الرئيسية**:
   - عرض شعار المطعم.
   - عنوان الشاشة الرئيسية.
   - قائمة العناصر في القائمة.

2. **شاشة تفاصيل الطبق**:
   - عرض شعار المطعم.
   - عنوان شاشة التفاصيل.
   - زر العودة.
   - صورة الطبق.
   - عنوان الطبق.
   - وصف الطبق.
   - سعر الطبق.

3. **قائمة الأطباق المتاحة**:
   - تتضمن أطباق مثل شرائح اللحم المقلية، الدجاج المشوي مع الخضروات، مزيج شرائح اللحم والدجاج المشوي، وغيرها.
   - كل طبق يحتوي على صورة، وصف وسعر.

4. **تصميم عنصر القائمة**:
   - استخدام `MaterialCardView` لعرض كل عنصر من القائمة مع صورة وعنوان.

5. **أحداث النقر**:
   - التنقل إلى شاشة التفاصيل عند النقر على عنصر في القائمة.
   - العودة إلى الشاشة الرئيسية عند النقر على زر العودة في شاشة التفاصيل.

## التقنيات المستخدمة

- **Android SDK**: لتطوير تطبيق Android.
- **RecyclerView**: لعرض قائمة عناصر القائمة.
- **بيانات الفئات**: لتمثيل بيانات الأطباق.
- **محولات**: لربط البيانات بواجهة المستخدم.
- **تخطيطات**: تشمل `LinearLayout`، `ScrollView`، و `MaterialCardView` لبناء الشاشات.

## إعداد المشروع

لتشغيل المشروع محلياً، اتبع الخطوات أدناه:

### المتطلبات السابقة

- تثبيت [Android Studio](https://developer.android.com/studio) على جهاز الكمبيوتر الخاص بك.
- [JDK 11](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) أو إصدار أحدث.

### استنساخ المستودع

1. استنساخ المستودع إلى جهاز الكمبيوتر المحلي:
   ```bash
   git clone git@github.com:SamuelRocha91/kotlinVirtualMenu.git
   ```

2. انتقل إلى دليل المشروع:
   ```bash
   cd kotlinVirtualMenu
   ```

### إعداد المشروع

1. افتح المشروع في Android Studio.
2. تأكد من أن Android Studio مُعدة لاستخدام JDK 11 أو إصدار أحدث.
3. قم بمزامنة المشروع مع Gradle:
   - في Android Studio، انقر على "File" > "Sync Project with Gradle Files".

### تشغيل المشروع

1. قم بتوصيل جهاز Android بالكمبيوتر أو قم بتشغيل محاكي Android.
2. شغّل التطبيق:
   - في Android Studio، انقر على زر "Run" (رمز التشغيل) في أعلى نافذة التطبيق.

## هيكل الدليل

- `app/src/main/java/com/example/trybevirtualmenu/`: الشيفرة المصدرية للتطبيق.
- `app/src/main/res/layout/`: ملفات تخطيط XML.
- `app/src/main/res/drawable/`: الصور والموارد الرسومية الأخرى.

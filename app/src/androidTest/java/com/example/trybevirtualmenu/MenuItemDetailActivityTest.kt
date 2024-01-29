package com.example.trybevirtualmenu

import android.content.Context
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.ScrollView
import android.widget.TextView
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isAssignableFrom
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withParent
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
import com.example.trybevirtualmenu.views.MenuItemDetailActivity
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

private fun getId(id: String): Int {
    val targetContext: Context = InstrumentationRegistry.getInstrumentation().targetContext
    val packageName: String = targetContext.packageName
    return targetContext.resources.getIdentifier(id, "id", packageName)
}

@RunWith(AndroidJUnit4::class)
class MenuItemDetailActivityTest {

    @get:Rule
    val activityRuleDetail = ActivityScenarioRule(MenuItemDetailActivity::class.java)

    @Test
    fun test_req_2_crie_a_estrutura_da_tela_de_detalhe_do_prato() {
        onView((withId(getId("detail_scroll_view"))))
            .check(matches(isDisplayed()))
            .check(matches(isAssignableFrom(ScrollView::class.java)))

        onView(withId(getId("detail_linear_container")))
            .check(matches(isDisplayed()))
            .check(matches(isAssignableFrom(LinearLayout::class.java)))
            .check(matches(withParent(withId(getId("detail_scroll_view")))))

        onView((withId(getId("detail_back"))))
            .check(matches(isDisplayed()))
            .check(matches(isAssignableFrom(Button::class.java)))
            .check(matches(withParent(withId(getId("detail_linear_container")))))

        onView((withId(getId("detail_logo"))))
            .check(matches(isDisplayed()))
            .check(matches(isAssignableFrom(ImageView::class.java)))
            .check(matches(withParent(withId(getId("detail_linear_container")))))

        onView((withId(getId("detail_title"))))
            .check(matches(isDisplayed()))
            .check(matches(isAssignableFrom(TextView::class.java)))
            .check(matches(withParent(withId(getId("detail_linear_container")))))

        onView((withId(getId("detail_image"))))
            .check(matches(isDisplayed()))
            .check(matches(isAssignableFrom(ImageView::class.java)))
            .check(matches(withParent(withId(getId("detail_linear_container")))))

        onView((withId(getId("detail_name"))))
            .perform(ViewActions.scrollTo())
            .check(matches(isDisplayed()))
            .check(matches(isAssignableFrom(TextView::class.java)))
            .check(matches(withParent(withId(getId("detail_linear_container")))))

        onView((withId(getId("detail_description"))))
            .perform(ViewActions.scrollTo())
            .check(matches(isDisplayed()))
            .check(matches(isAssignableFrom(TextView::class.java)))
            .check(matches(withParent(withId(getId("detail_linear_container")))))

        onView((withId(getId("detail_price"))))
            .perform(ViewActions.scrollTo())
            .check(matches(isDisplayed()))
            .check(matches(isAssignableFrom(TextView::class.java)))
            .check(matches(withParent(withId(getId("detail_linear_container")))))
    }
}

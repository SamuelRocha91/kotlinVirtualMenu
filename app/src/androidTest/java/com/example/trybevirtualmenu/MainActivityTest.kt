package com.example.trybevirtualmenu

import android.content.Context
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.intent.Intents
import androidx.test.espresso.intent.Intents.intended
import androidx.test.espresso.intent.matcher.IntentMatchers.hasComponent
import androidx.test.espresso.matcher.ViewMatchers.hasDescendant
import androidx.test.espresso.matcher.ViewMatchers.isAssignableFrom
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withParent
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
import com.example.trybevirtualmenu.views.MainActivity
import com.example.trybevirtualmenu.views.MenuItemDetailActivity
import org.hamcrest.Matchers.allOf
import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

private fun getId(id: String): Int {
    val targetContext: Context = InstrumentationRegistry.getInstrumentation().targetContext
    val packageName: String = targetContext.packageName
    return targetContext.resources.getIdentifier(id, "id", packageName)
}

@RunWith(AndroidJUnit4::class)
class MainActivityTest {

    @get:Rule
    val activityRuleMain = ActivityScenarioRule(MainActivity::class.java)

    @Before
    fun setup() {
        Intents.init()
    }

    @After
    fun tearDown() {
        Intents.release()
    }

    @Test
    fun test_req_1_crie_a_estrutura_da_tela_inicial_do_cardapio() {
        onView(withId(getId("main_linear_container")))
            .check(matches(isDisplayed()))
            .check(matches(isAssignableFrom(LinearLayout::class.java)))

        onView((withId(getId("main_logo"))))
            .check(matches(isDisplayed()))
            .check(matches(isAssignableFrom(ImageView::class.java)))
            .check(matches(withParent(withId(getId("main_linear_container")))))

        onView((withId(getId("main_title"))))
            .check(matches(isDisplayed()))
            .check(matches(isAssignableFrom(TextView::class.java)))
            .check(matches(withParent(withId(getId("main_linear_container")))))

        onView((withId(getId("main_menu"))))
            .check(matches(isDisplayed()))
            .check(matches(isAssignableFrom(RecyclerView::class.java)))
            .check(matches(withParent(withId(getId("main_linear_container")))))
    }

    @Test
    fun test_req_3_crie_a_lista_de_pratos_disponiveis_no_cardapio() {
        onView(withId(getId("main_menu")))
            .check(RecyclerViewItemCountAssertion(6))

        onView(withId(getId("main_menu")))
            .check(
                matches(
                    hasDescendant(
                        allOf(
                            hasDescendant(withText("File de Carne com Fritas"))
                        )
                    )
                )
            )
    }

    @Test
    fun test_req_4_crie_o_layout_responsavel_por_cada_item_no_cardapio() {
        onView(withId(getId("main_menu")))
            .check(
                matches(
                    hasDescendant(
                        allOf(
                            withId(getId("item_menu_card_view")),
                            hasDescendant(withId(getId("item_menu_linear_container"))),
                            hasDescendant(withId(getId("item_menu_image"))),
                            hasDescendant(withId(getId("item_menu_name")))
                        )
                    )
                )
            )
    }

    @Test
    fun test_req_5_crie_o_evento_para_clicar_no_item_do_menu() {
        onView((withId(getId("main_menu"))))
            .check(matches(isDisplayed()))
            .check(matches(isAssignableFrom(RecyclerView::class.java)))
            .check(matches(withParent(withId(getId("main_linear_container")))))

        onView(withId(getId("main_menu")))
            .perform(
                RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(0, click())
            )

        intended(hasComponent(MenuItemDetailActivity::class.java.name))

        onView(withId(getId("detail_name")))
            .check(matches(withText("File de Carne com Fritas")))
    }

    @Test
    fun test_req_6_crie_o_evento_do_botao_de_voltar_da_tela_de_detalhe_do_prato() {
        onView((withId(getId("main_menu"))))
            .check(matches(isDisplayed()))
            .check(matches(isAssignableFrom(RecyclerView::class.java)))
            .check(matches(withParent(withId(getId("main_linear_container")))))

        onView(withId(getId("main_menu")))
            .perform(
                RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(0, click())
            )

        intended(hasComponent(MenuItemDetailActivity::class.java.name))

        onView(withId(getId("detail_name")))
            .check(matches(withText("File de Carne com Fritas")))

        onView(withId(getId("detail_back"))).perform(click())

        onView((withId(getId("main_menu"))))
            .check(matches(isDisplayed()))
    }
}

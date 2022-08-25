package com.arash.altafi.jetpackcomposelearn.core

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.arash.altafi.jetpackcomposelearn.R
import com.arash.altafi.jetpackcomposelearn.animation.Animation1Activity
import com.arash.altafi.jetpackcomposelearn.animation.Animation2Activity
import com.arash.altafi.jetpackcomposelearn.animation.ListAnimationActivity
import com.arash.altafi.jetpackcomposelearn.animation.TextAnimationActivity
import com.arash.altafi.jetpackcomposelearn.customview.CustomViewActivity
import com.arash.altafi.jetpackcomposelearn.customview.CustomViewPaintActivity
import com.arash.altafi.jetpackcomposelearn.customview.MeasuringScaleActivity
import com.arash.altafi.jetpackcomposelearn.customview.ZoomableActivity
import com.arash.altafi.jetpackcomposelearn.image.ImageActivity
import com.arash.altafi.jetpackcomposelearn.interop.ComposeInClassicAndroidActivity
import com.arash.altafi.jetpackcomposelearn.layout.ConstraintLayoutActivity
import com.arash.altafi.jetpackcomposelearn.layout.LayoutModifierActivity
import com.arash.altafi.jetpackcomposelearn.layout.ViewLayoutConfigurationsActivity
import com.arash.altafi.jetpackcomposelearn.material.AlertDialogActivity
import com.arash.altafi.jetpackcomposelearn.material.BottomNavigationActivity
import com.arash.altafi.jetpackcomposelearn.material.ButtonActivity
import com.arash.altafi.jetpackcomposelearn.material.DrawerAppActivity
import com.arash.altafi.jetpackcomposelearn.material.FixedActionButtonActivity
import com.arash.altafi.jetpackcomposelearn.material.FlowRowActivity
import com.arash.altafi.jetpackcomposelearn.material.MaterialActivity
import com.arash.altafi.jetpackcomposelearn.material.ShadowActivity
import com.arash.altafi.jetpackcomposelearn.scrollers.HorizontalScrollableActivity
import com.arash.altafi.jetpackcomposelearn.scrollers.VerticalScrollableActivity
import com.arash.altafi.jetpackcomposelearn.stack.StackActivity
import com.arash.altafi.jetpackcomposelearn.state.ProcessDeathActivity
import com.arash.altafi.jetpackcomposelearn.state.StateActivity
import com.arash.altafi.jetpackcomposelearn.state.backpress.BackPressActivity
import com.arash.altafi.jetpackcomposelearn.state.coroutine.CoroutineFlowActivity
import com.arash.altafi.jetpackcomposelearn.state.livedata.LiveDataActivity
import com.arash.altafi.jetpackcomposelearn.text.CustomTextActivity
import com.arash.altafi.jetpackcomposelearn.text.SimpleTextActivity
import com.arash.altafi.jetpackcomposelearn.text.TextFieldActivity
import com.arash.altafi.jetpackcomposelearn.theme.DarkModeActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun startSimpleText(view: View) {
        startActivity(Intent(this, SimpleTextActivity::class.java))
    }

    fun startCustomText(view: View) {
        startActivity(Intent(this, CustomTextActivity::class.java))
    }

    fun startVerticalScrollable(view: View) {
        startActivity(Intent(this, VerticalScrollableActivity::class.java))
    }

    fun startHorizontalScrollable(view: View) {
        startActivity(Intent(this, HorizontalScrollableActivity::class.java))
    }

    fun starLoadImage(view: View) {
        startActivity(Intent(this, ImageActivity::class.java))
    }

    // The Table API has been removed in dev11 update. Removing this arash.altafi until there is a 
    // better alternative available
//    fun startGrid(view: View) {
//        startActivity(Intent(this, GridLayoutActivity::class.java))
//    }

    fun startAlertDialog(view: View) {
        startActivity(Intent(this, AlertDialogActivity::class.java))
    }

    fun startDrawer(view: View) {
        startActivity(Intent(this, DrawerAppActivity::class.java))
    }

    fun startButtons(view: View) {
        startActivity(Intent(this, ButtonActivity::class.java))
    }

    fun startState(view: View) {
        startActivity(Intent(this, StateActivity::class.java))
    }

    fun startCustomView(view: View) {
        startActivity(Intent(this, CustomViewActivity::class.java))
    }

    fun startCustomViewPaint(view: View) {
        startActivity(Intent(this, CustomViewPaintActivity::class.java))
    }

    fun startAutofillText(view: View) {
        startActivity(Intent(this, TextFieldActivity::class.java))
    }

    fun startStack(view: View) {
        startActivity(Intent(this, StackActivity::class.java))
    }

    fun startViewAlign(view: View) {
        startActivity(Intent(this, ViewLayoutConfigurationsActivity::class.java))
    }

    fun startMaterialDesign(view: View) {
        startActivity(Intent(this, MaterialActivity::class.java))
    }

    fun startFixedActionButton(view: View) {
        startActivity(Intent(this, FixedActionButtonActivity::class.java))
    }

    fun startConstraintLayout(view: View) {
        startActivity(Intent(this, ConstraintLayoutActivity::class.java))
    }

    fun startBottomNavigation(view: View) {
        startActivity(Intent(this, BottomNavigationActivity::class.java))
    }

    fun startAnimation1(view: View) {
        startActivity(Intent(this, Animation1Activity::class.java))
    }

    fun startAnimation2(view: View) {
        startActivity(Intent(this, Animation2Activity::class.java))
    }

    fun startTextInlineContent(view: View) {
        startActivity(Intent(this, TextAnimationActivity::class.java))
    }

    fun startListAnimation(view: View) {
        startActivity(Intent(this, ListAnimationActivity::class.java))
    }

    fun startTheme(view: View) {
        startActivity(Intent(this, DarkModeActivity::class.java))
    }

    fun startLayoutModifier(view: View) {
        startActivity(Intent(this, LayoutModifierActivity::class.java))
    }

    fun startProcessDeath(view: View) {
        startActivity(Intent(this, ProcessDeathActivity::class.java))
    }

    fun startLiveData(view: View) {
        startActivity(Intent(this, LiveDataActivity::class.java))
    }

    fun startFlowRow(view: View) {
        startActivity(Intent(this, FlowRowActivity::class.java))
    }

    fun startShadow(view: View) {
        startActivity(Intent(this, ShadowActivity::class.java))
    }

    fun startCoroutineFlow(view: View) {
        startActivity(Intent(this, CoroutineFlowActivity::class.java))
    }

    fun startComposeWithClassicAndroid(view: View) {
        startActivity(Intent(this, ComposeInClassicAndroidActivity::class.java))
    }

    fun startMeasuringScale(view: View) {
        startActivity(Intent(this, MeasuringScaleActivity::class.java))
    }

    fun startBackPress(view: View) {
        startActivity(Intent(this, BackPressActivity::class.java))
    }

    fun startZoomable(view: View) {
        startActivity(Intent(this, ZoomableActivity::class.java))
    }
}

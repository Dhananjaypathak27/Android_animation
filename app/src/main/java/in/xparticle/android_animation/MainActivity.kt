package `in`.xparticle.android_animation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val topToBottom = AnimationUtils.loadAnimation(this,R.anim.top_to_bottom)
        val smallToBig = AnimationUtils.loadAnimation(this,R.anim.small_to_big)
        val btn1BottomToTop = AnimationUtils.loadAnimation(this,R.anim.button1_bottom_to_top)
        val btn2BottomToTop = AnimationUtils.loadAnimation(this,R.anim.button2_bottom_to_top)
        val btn3BottomToTop = AnimationUtils.loadAnimation(this,R.anim.button3_bottom_to_top)
        val btn = AnimationUtils.loadAnimation(this,R.anim.bottom_btn_bottom_to_top)

        findViewById<TextView>(R.id.headertitle).startAnimation(topToBottom)
        findViewById<TextView>(R.id.subtitle).startAnimation(topToBottom)

        findViewById<ImageView>(R.id.ic_cards).startAnimation(smallToBig)

        findViewById<LinearLayout>(R.id.one).startAnimation(btn1BottomToTop)
        findViewById<LinearLayout>(R.id.two).startAnimation(btn2BottomToTop)
        findViewById<LinearLayout>(R.id.three).startAnimation(btn3BottomToTop)
        findViewById<Button>(R.id.btn_next_course).startAnimation(btn)
        //bjhbjk
    }
}

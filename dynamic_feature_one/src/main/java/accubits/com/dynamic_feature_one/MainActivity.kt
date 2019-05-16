package accubits.com.dynamic_feature_one

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.facebook.drawee.backends.pipeline.Fresco
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    var min : Int = 1
    var max : Int = 7

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Fresco.initialize(this)

        when ((min..max).random()) {
            1 -> splashImage.setActualImageResource(R.drawable.intro_1)
            2 -> splashImage.setActualImageResource(R.drawable.intro_2)
            3 -> splashImage.setActualImageResource(R.drawable.intro_3)
            4 -> splashImage.setActualImageResource(R.drawable.intro_4)
            5 -> splashImage.setActualImageResource(R.drawable.intro_5)
            6 -> splashImage.setActualImageResource(R.drawable.intro_6)
            7 -> splashImage.setActualImageResource(R.drawable.intro_7)
        }
    }

}

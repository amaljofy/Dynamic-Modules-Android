package accubits.com.dynamic_feature_one

import android.app.Application
import com.facebook.drawee.backends.pipeline.Fresco

class MyDynamicAppOne : Application(){

    override fun onCreate() {
        super.onCreate()
        Fresco.initialize(this)

    }
}
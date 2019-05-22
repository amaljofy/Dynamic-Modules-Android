package accubits.com.dynamic_feature_three.common

import accubits.com.dynamic_feature_three.R
import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import android.view.inputmethod.InputMethodManager

/**
 * Created by Amal Jofy on 04/06/2018.
 */
open class BaseActivity : AppCompatActivity() {

    private fun dismissSoftKeyBoard() {
        val view = this.currentFocus
        if (view != null) {
            val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            imm.hideSoftInputFromWindow(view.windowToken, 0)
        }
    }

}

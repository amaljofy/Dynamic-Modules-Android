package accubits.com.dynamic_feature_three.home.controller

import accubits.com.dynamic_feature_three.common.MvpBasePresenter
import android.content.Context

import java.lang.ref.WeakReference

class HomePresenterImpl(context: Context) : MvpBasePresenter<HomeView>(),
    HomePresenter {

    private val contextRef: WeakReference<Context> = WeakReference(context)

}

package accubits.com.dynamic_feature_three.home

import accubits.com.dynamic_feature_three.R
import accubits.com.dynamic_feature_three.common.MvpActivity
import accubits.com.dynamic_feature_three.home.controller.HomePresenter
import accubits.com.dynamic_feature_three.home.controller.HomePresenterImpl
import accubits.com.dynamic_feature_three.home.controller.HomeView

class HomeActivity : MvpActivity<HomeView, HomePresenter>() {

    override fun getLayoutResId(): Int {
        return R.layout.activity_main
    }

    override fun createPresenter(): HomePresenter {
        return HomePresenterImpl(this)
    }

    override fun showProgress() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun hideProgress() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun showNetworkMessage() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}
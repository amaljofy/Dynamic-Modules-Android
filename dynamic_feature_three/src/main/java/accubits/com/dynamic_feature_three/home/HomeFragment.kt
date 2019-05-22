package accubits.com.dynamic_feature_three.home

import accubits.com.dynamic_feature_three.R
import accubits.com.dynamic_feature_three.common.MvpFragment
import accubits.com.dynamic_feature_three.home.controller.HomePresenterImpl
import accubits.com.dynamic_feature_three.home.controller.HomeView
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class HomeFragment : MvpFragment<HomeView, HomePresenterImpl>(),HomeView {

    private var baseActivity: HomeActivity? = null
    private var mContext: Context? = null
    private var rootView: View? = null

    override fun showProgress() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun hideProgress() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun showNetworkMessage() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun createPresenter(): HomePresenterImpl {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        baseActivity = activity as HomeActivity
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        rootView = inflater.inflate(R.layout.activity_home_fragment, container, false)
        return rootView
    }

    override fun onAttach(context: Context?) {
        super.onAttach(context)
        this.mContext = context
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

}
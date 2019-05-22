package accubits.com.dynamic_feature_three.common;

import android.os.Bundle;

/**
 * Created by Amal Jofy on 04/06/2018.
 */

public abstract class MvpActivity<V extends MvpView, P extends MvpPresenter>
        extends BaseActivity implements MvpView {

    protected P presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(0!=getLayoutResId()) {
            setContentView(getLayoutResId());
        }

        // Create the presenter if needed
        if(null == presenter){
            presenter = createPresenter();
        }
        presenter.attachView(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.detachView(false);
    }

    protected abstract P createPresenter();
    protected abstract int getLayoutResId();

}

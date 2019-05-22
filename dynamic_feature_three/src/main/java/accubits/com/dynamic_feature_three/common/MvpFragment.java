package accubits.com.dynamic_feature_three.common;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.View;


/**
 * Created by Amal Jofy on 04/06/2018.
 */
public abstract class MvpFragment<V extends MvpView, P extends MvpPresenter>
        extends Fragment implements MvpView  {

    protected P presenter;

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        // Create the presenter if needed
        if (presenter == null) {
            presenter = createPresenter();
        }
        presenter.attachView(this);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        presenter.detachView(getRetainInstance());
    }



    protected abstract P createPresenter();
    public boolean onBackPressed() {
        return true;
    }
}

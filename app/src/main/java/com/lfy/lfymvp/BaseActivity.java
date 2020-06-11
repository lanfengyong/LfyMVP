package com.lfy.lfymvp;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.lfy.lfymvp.Presenter.BasePresenter;

/**
 * Author:lanfy
 * e-mail:lanfengyong@163.com
 * on 2020-6-9
 */
public abstract class BaseActivity<V,T extends BasePresenter<V>> extends AppCompatActivity {
    protected T mPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPresenter = createPresenter();
        mPresenter.attch((V) this);
    }

    protected  abstract T createPresenter() ;

    @Override
    protected void onDestroy() {
        mPresenter.dettch();
        super.onDestroy();
    }
}

package com.lfy.lfymvp;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.lfy.lfymvp.Presenter.BasePresenter;
import com.lfy.lfymvp.Presenter.GirlPresenter;
import com.lfy.lfymvp.bean.Girl;
import com.lfy.lfymvp.model.IGirlModel;
import com.lfy.lfymvp.view.IGirlView;

import java.util.List;

public class MainActivity extends BaseActivity<IGirlView,GirlPresenter<IGirlView>> implements IGirlView {
    GirlPresenter girlPresenter;
    private ListView listView ;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.list);
        mPresenter.feach();
    }

    @Override
    public void showLoading() {

    }

    @Override
    public void showGirl(List<Girl> list) {
        listView.setAdapter(new LFYAdapter(list,this));
    }

    @Override
    protected GirlPresenter<IGirlView> createPresenter() {
        return new GirlPresenter<>(this);
    }
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        listView = findViewById(R.id.list);
//        girlPresenter = new GirlPresenter(this);
//        girlPresenter.feach();
//    }
//
//
//    @Override
//    public void showLoading() {
//
//    }
//
//    @Override
//    public void showGirl(List<Girl> list) {
//        listView.setAdapter(new LFYAdapter(list,this));
//    }


    @Override
    protected void onDestroy() {
        mPresenter.dettch();
        super.onDestroy();
    }
}

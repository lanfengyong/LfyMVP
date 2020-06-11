package com.lfy.lfymvp.Presenter;

import com.lfy.lfymvp.bean.Girl;
import com.lfy.lfymvp.model.GirlModel;
import com.lfy.lfymvp.model.IGirlModel;
import com.lfy.lfymvp.view.IGirlView;

import java.util.List;

/**
 * Author:lanfy
 * e-mail:lanfengyong@163.com
 * on 2020-6-8
 */
public class GirlPresenter<T> extends BasePresenter<IGirlView> {
    IGirlView iGirlView;
    IGirlModel iGirlModel = new GirlModel();

    public GirlPresenter(IGirlView iGirlView) {
        this.iGirlView = iGirlView;
    }
    @Override
    public void feach(){
        iGirlView.showLoading();
        if(iGirlModel != null){
            iGirlModel.loading(new IGirlModel.GirlOnLoadListener() {
                @Override
                public void onComplete(List<Girl> list) {
                    iGirlView.showGirl(list);
                }
            });
        }
    }
}

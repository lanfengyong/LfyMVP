package com.lfy.lfymvp.model;

import com.lfy.lfymvp.bean.Girl;

import java.util.List;

/**
 * Author:lanfy
 * e-mail:lanfengyong@163.com
 * on 2020-6-8
 */
public interface IGirlModel {
    void loading(GirlOnLoadListener girlOnLoadListener);
    interface GirlOnLoadListener{
        void onComplete(List<Girl> list);
    }
}

package com.lfy.lfymvp.view;

import com.lfy.lfymvp.bean.Girl;

import java.util.List;

/**
 * Author:lanfy
 * e-mail:lanfengyong@163.com
 * on 2020-6-8
 */
public interface IGirlView {
    void showLoading();

    void showGirl(List<Girl> list);
}

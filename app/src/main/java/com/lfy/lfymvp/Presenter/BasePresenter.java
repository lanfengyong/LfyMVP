package com.lfy.lfymvp.Presenter;

import java.lang.ref.WeakReference;

/**
 * Author:lanfy
 * e-mail:lanfengyong@163.com
 * on 2020-6-9
 */
public abstract class BasePresenter<T> {
    protected WeakReference<T> mViewRef;
    public abstract void feach();
    public void attch(T view){
        mViewRef = new WeakReference<T>(view);
    }

    public void dettch(){
        if(mViewRef!=null){
            mViewRef.clear();
            mViewRef = null;
        }
    }
}

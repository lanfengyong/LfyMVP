package com.lfy.lfymvp.model;

import android.os.Handler;
import android.os.Looper;

import com.lfy.lfymvp.R;
import com.lfy.lfymvp.bean.Girl;

import java.util.ArrayList;
import java.util.List;

/**
 * Author:lanfy
 * e-mail:lanfengyong@163.com
 * on 2020-6-8
 */
public class GirlModel implements IGirlModel{
    Handler handler = new Handler(Looper.getMainLooper());
    @Override
    public void loading(final GirlOnLoadListener girlOnLoadListener) {
        new Thread(){
            @Override
            public void run() {
                try {
                    sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                final List<Girl> data = new ArrayList<>();
                data.add(new Girl((R.drawable.f1),"dadada"));
                data.add(new Girl((R.drawable.ic_launcher),"dadada1"));
                data.add(new Girl((R.mipmap.ic_launcher),"dadada2"));
                data.add(new Girl((R.drawable.f1),"dadada3"));
                data.add(new Girl((R.drawable.f1),"4"));
                data.add(new Girl((R.drawable.f1),"dadada"));
                data.add(new Girl((R.drawable.ic_launcher),"dadada1"));
                data.add(new Girl((R.mipmap.ic_launcher),"dadada2"));
                data.add(new Girl((R.drawable.f1),"dadada3"));
                data.add(new Girl((R.drawable.f1),"4"));
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        girlOnLoadListener.onComplete(data);
                    }
                });

            }
        }.start();


    }
}

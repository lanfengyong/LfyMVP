package com.lfy.lfymvp.bean;

import java.io.Serializable;

/**
 * Author:lanfy
 * e-mail:lanfengyong@163.com
 * on 2020-6-8
 */
public class Girl implements Serializable {
    private int icon;
    private String context;

    public Girl(int icon, String context) {
        this.icon = icon;
        this.context = context;
    }

    @Override
    public String toString() {
        return "Girl{" +
                "icon=" + icon +
                ", context='" + context + '\'' +
                '}';
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }
}

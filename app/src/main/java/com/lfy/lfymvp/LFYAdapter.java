package com.lfy.lfymvp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.lfy.lfymvp.bean.Girl;

import java.util.List;

/**
 * Author:lanfy
 * e-mail:lanfengyong@163.com
 * on 2020-6-8
 */
public class LFYAdapter extends BaseAdapter {
    private List<Girl> data;
    private Context mContext;
    public LFYAdapter(List data,Context context){
        this.data = data;
        this.mContext = context;
    }
    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(mContext);
        ViewHolder holder = null;
        if(convertView == null) {
            convertView = inflater.inflate(R.layout.list_item, null);
            holder = new ViewHolder();
            holder.imageView = convertView.findViewById(R.id.iv);
            holder.textView = convertView.findViewById(R.id.tv);
            convertView.setTag(holder);
        }else{
            holder = (ViewHolder) convertView.getTag();
        }
        holder.textView.setText(data.get(position).getContext());
        holder.imageView.setImageResource(data.get(position).getIcon());
        return convertView;
    }

    static class ViewHolder{
        TextView textView;
        ImageView imageView;
    }
}

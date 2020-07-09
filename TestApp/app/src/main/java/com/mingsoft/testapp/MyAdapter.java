package com.mingsoft.testapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Administrator on 2020/07/09.
 */

public class MyAdapter extends BaseAdapter {
    public List<Bean> mList;
    public Context mContext;
    public LayoutInflater mLayoutInflater;

    public MyAdapter(Context context,List<Bean> mList){
        this.mList=mList;
        this.mContext=context;
        mLayoutInflater=LayoutInflater.from(mContext);
    }
    @Override
    public int getCount() {
        return mList.size();
    }

    @Override
    public Object getItem(int i) {
        return mList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup viewGroup) {
        ViewHolder viewHolder;
        if (convertView==null){
            viewHolder=new ViewHolder();
            convertView=mLayoutInflater.inflate(R.layout.item,null);
            viewHolder.mImageView=(ImageView) convertView.findViewById(R.id.image1);
            viewHolder.mTextView=(TextView) convertView.findViewById(R.id.text1);
            convertView.setTag(viewHolder);
        }else {
            viewHolder= (ViewHolder) convertView.getTag();
        }
        //从list取出对象
        Bean bean=mList.get(i);
        //设置item的内容
        viewHolder.mImageView.setImageResource(bean.getImage());
        viewHolder.mTextView.setText(bean.getContext());
        return convertView;
    }
    private static class ViewHolder{
        public ImageView mImageView;
        public TextView mTextView;
    }
}

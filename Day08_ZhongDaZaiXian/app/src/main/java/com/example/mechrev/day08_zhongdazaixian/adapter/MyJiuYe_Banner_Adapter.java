package com.example.mechrev.day08_zhongdazaixian.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.mechrev.day08_zhongdazaixian.R;
import com.example.mechrev.day08_zhongdazaixian.bean.JiuYeBean;

import java.util.List;

/**
 * Created by MECHREV on 2017/11/27.
 */

public class MyJiuYe_Banner_Adapter extends BaseAdapter {

    private List<JiuYeBean.DataBean> mLists;

    private Context mContext;

    public MyJiuYe_Banner_Adapter(List<JiuYeBean.DataBean> mLists, Context mContext) {
        this.mLists = mLists;
        this.mContext = mContext;
    }

    @Override
    public int getCount() {
        return mLists.isEmpty()?0:mLists.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder holder;

        if (convertView==null){

            holder = new ViewHolder();

            convertView = LayoutInflater.from(mContext).inflate(R.layout.jiuye_banner_item,null);

            holder.title = convertView.findViewById(R.id.Title);

            holder.description = convertView.findViewById(R.id.Description);

            convertView.setTag(holder);

        }else {

            holder = (ViewHolder) convertView.getTag();
        }

        JiuYeBean.DataBean bean = mLists.get(position);

        holder.title.setText(bean.getTitle());

        holder.description.setText(bean.getDescription());


        return convertView;
    }

    class ViewHolder {

        private TextView title,description;

    }
}

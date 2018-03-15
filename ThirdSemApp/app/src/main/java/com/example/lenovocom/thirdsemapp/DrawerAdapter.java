package com.example.lenovocom.thirdsemapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * Created by lenovo.com on 3/15/2018.
 */

public class DrawerAdapter extends BaseAdapter {
    Context mContext;
    String [] fields;

    public DrawerAdapter(Context mContext, String[] fields) {
        this.mContext = mContext;
        this.fields = fields;
    }

    @Override
    public int getCount() {
        return fields.length;
    }

    @Override
    public Object getItem(int position) {
        return fields[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = LayoutInflater.from(mContext).inflate(R.layout.drawer_view, parent, false);
        TextView txtView =(TextView) row.findViewById(R.id.list_item);
        txtView.setText(fields[position]);
        return row;
    }
}

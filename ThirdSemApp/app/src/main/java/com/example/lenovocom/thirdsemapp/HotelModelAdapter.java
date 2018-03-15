package com.example.lenovocom.thirdsemapp;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by lenovo.com on 3/15/2018.
 */

public class HotelModelAdapter extends BaseAdapter{
    Context mContext;
    List<HotelModel> hotels;


    public HotelModelAdapter(Context mContext, List<HotelModel> hotels) {
        this.mContext = mContext;
        this.hotels = hotels;
    }

    @Override
    public int getCount() {
        return hotels.size();
    }

    @Override
    public Object getItem(int position) {
        return hotels.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.hotel_item_view, parent, false);

        ImageView img = (ImageView) view.findViewById(R.id.img);
        TextView hotelsName = (TextView) view.findViewById(R.id.hotel_name);
        TextView star = (TextView) view.findViewById(R.id.star);
        TextView dist = (TextView)view.findViewById(R.id.dist_to_center);

        hotelsName.setText( hotels.get(position).getName());
        star.setText(hotels.get(position).getStar()+"");
        dist.setText(hotels.get(position).getDistanceToCenter() + "");
        img.setImageResource(hotels.get(position).getImgResource());
     // img.setImageURI(Uri.parse(hotels.get(position).getImgURL()));

        return view;
    }
}

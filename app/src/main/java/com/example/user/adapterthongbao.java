package com.example.user;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.List;

public class adapterthongbao extends BaseAdapter {

    private Context context;
    private int layout;
    public List<listthongbao> arraylist;

    public adapterthongbao(Context context, int layout, List<listthongbao> arraylist) {
        this.context = context;
        this.layout = layout;
        this.arraylist = arraylist;
    }

    @Override
    public int getCount() {
        return arraylist.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @SuppressLint("ViewHolder")
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(layout,null);
        listthongbao monan =  arraylist.get(position);

        TextView txtnamemoan =convertView.findViewById(R.id.txtname);
        TextView txttitle =convertView.findViewById(R.id.txttitle);
        ImageView imagehinh = convertView.findViewById(R.id.imageHinh);
        ImageButton btnadd = convertView.findViewById(R.id.btnadd);
        ImageButton btntru = convertView.findViewById(R.id.btntru);
        TextView txttime = convertView.findViewById(R.id.txttime);

        txtnamemoan.setText(monan.getTenmonan());
        txttitle.setText(monan.getMota());
        imagehinh.setImageResource(monan.getHinh());

        btntru.setImageResource(monan.getTru());
        btnadd.setImageResource(monan.getAdd());
        txttime.setText(monan.getTime());



        return convertView;
    }
}


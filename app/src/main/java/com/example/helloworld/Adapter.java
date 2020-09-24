package com.example.helloworld;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Adapter extends BaseAdapter {

    private LayoutInflater inflater;
    private ArrayList<Item> data;
    private int layout;

    public Adapter(Context context, int layout, ArrayList<Item> data){
        this.inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.data = data;
        this.layout = layout;
    }

    @Override
    public int getCount(){return data.size();}

    @Override
    public String getItem(int position){return data.get(position).getFlowername();}

    @Override
    public long getItemId(int position){return position;}

    @Override
    public View getView(int position, View convertview, ViewGroup parent){
        if(convertview == null)
            convertview = inflater.inflate(layout, parent, false);

        Item item = data.get(position);

        ImageView image = convertview.findViewById(R.id.imageview);
        image.setImageResource(item.getImage());

        TextView flowername = convertview.findViewById(R.id.textview);
        flowername.setText(item.getFlowername());

        return convertview;
    }
}

package com.codeclan.fastcars;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Adam Baxter on 16/03/2017.
 */

public class TopCarsAdapter extends ArrayAdapter<Car> {

    public TopCarsAdapter(Context context, ArrayList<Car> cars) { super(context, 0 , cars); }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        View listItemView = convertView;

        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.top_cars_item, parent, false);
        }

        Car currentCar = getItem(position);

        TextView laptime = (TextView) listItemView.findViewById(R.id.laptime);
        laptime.setText(currentCar.getLapTime());

        TextView manufacturer = (TextView) listItemView.findViewById(R.id.manufacturer);
        manufacturer.setText(currentCar.getManufacturer());

        TextView model = (TextView) listItemView.findViewById(R.id.model);
        model.setText(currentCar.getModel());

        return listItemView;


    }










}

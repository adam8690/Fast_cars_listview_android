package com.codeclan.fastcars;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class TopCarsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_cars);

        TopCars topcars = new TopCars();
        ArrayList<Car> list = topcars.getList();

        TopCarsAdapter carsAdapter = new TopCarsAdapter(this, list);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(carsAdapter);







    }
}

package com.vania.sunshine;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ArrayAdapter<String> mForecastAdapter;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_item_forecast);

        String[] forecastArray = {
                "Today - Sunny - 88 / 3",
                "Tomorrow - Foggy - 70 / 46",
                "Weds - Cloudy - 72 / 63",
                "Thurs - Rainy - 64 / 51",
                "Fri - Foggy - 70 / 46",
                "Sat - Sunny - 76 / 86",
                "Sun - unny - 72 / 68"
        };

        List<String> weekForest = new ArrayList<>(
                Arrays.asList(forecastArray)
        );

        listView = (ListView) findViewById(R.id.listview_forecast);

        mForecastAdapter =  new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, weekForest);
        listView.setAdapter(mForecastAdapter);
    }
}
//
//    ArrayList<String> forecast = new ArrayList<>();
//forecast.add("Today - Sunny - 88 / 3");
//        forecast.add("Tomorrow - Foggy - 70 / 46");
//        forecast.add("Weds - Cloudy - 72 / 63");
//        forecast.add("Thurs - Rainy - 64 / 51");
//        forecast.add("Fri - Foggy - 70 / 46");
//        forecast.add("Sat - Sunny - 76 / 86");
//        forecast.add("Sun - unny - 72 / 68");
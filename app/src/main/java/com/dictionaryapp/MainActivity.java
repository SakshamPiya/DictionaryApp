package com.dictionaryapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    public static final String countries1[] = {
            "Nepal", "Kathmandu" ,
            "India", "New Dehli" ,
            "China", "Beijing" ,
            "USA", "New York" ,
            "UK", "london"
    };

    private Map<String,String> dictionary;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView Countries = findViewById(R.id.countries);

        dictionary = new HashMap<>();
        for(int i=0;i<countries1.length;i+=2){
            dictionary.put(countries1[i],countries1[i+1]);
        }

        ArrayAdapter countryAdaptor = new ArrayAdapter<>(
                MainActivity.this,
                android.R.layout.simple_list_item_1,
                new ArrayList<String>(dictionary.keySet())


        );

        Countries.setAdapter(countryAdaptor);

    }
}

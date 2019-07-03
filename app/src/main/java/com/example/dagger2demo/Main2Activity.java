package com.example.dagger2demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        PersonComponent personComponent = DaggerPersonComponent.create();
        Person person = personComponent.getPerson();
        Log.i("DineshTag", "name:" + person.name);
        Log.i("DineshTag", "cityName:" + person.address.cityName);
        Log.i("DineshTag", "fname:" + person.parentDetail.fname);
        Log.i("DineshTag", "fage:" + person.parentDetail.fage);
    }
}

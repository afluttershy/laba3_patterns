package com.example.fabric_factory;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.fabric_factory.cars.BMW;
import com.example.fabric_factory.cars.Tesla;
import com.example.fabric_factory.factory.Dialog;

public class MainActivity extends AppCompatActivity {
    private static Dialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        configure();
        run();
    }
    private void configure(){
        //метод
    }
    static void run(){
        dialog.renderCar();
    }
}


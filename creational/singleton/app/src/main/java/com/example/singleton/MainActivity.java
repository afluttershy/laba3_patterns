package com.example.singleton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance("№1");
        Singleton anotherSingleton = Singleton.getInstance("№2");
        System.out.println(singleton.value);
        System.out.println(anotherSingleton.value);
    }
}

package com.example.state;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.state.ui.Player;
import com.example.state.ui.UI;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public static void main(String[] args) {
        Player player = new Player();
        UI ui = new UI(player);
        ui.init();
    }
}

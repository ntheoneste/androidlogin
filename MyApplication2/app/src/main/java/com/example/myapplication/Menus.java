package com.example.myapplication;

import android.arch.lifecycle.ViewModelStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.menu.MenuView;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.TextView;

public class Menus extends AppCompatActivity {
    TextView Item1;
    TextView Item2,Item3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menus);
        Item1 = (TextView) findViewById(R.id.Item1);
        Item2 = (TextView) findViewById(R.id.Item2);
        Item3 = (TextView) findViewById(R.id.Item3);


    }

}

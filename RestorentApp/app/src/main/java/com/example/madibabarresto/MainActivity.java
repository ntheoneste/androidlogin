package com.example.madibabarresto;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static EditText username;
    private static EditText password;
    private static Button login_btn;
    public static NavigationView navigationView;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("Online Services Account....");
        login_btn = (Button) findViewById(R.id.bpt1);
        password = (EditText) findViewById(R.id.tes2);
        username = (EditText)findViewById(R.id.edt1);
        login_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (username.getText().toString().equals("madiba") && password.getText().toString().equals("pass")){

                    openActivity2();

                }
                else if(!(username.getText().toString().equals("madiba") && password.getText().toString().equals("pass"))){
                    Toast.makeText(MainActivity.this, "Wrong entry", Toast.LENGTH_SHORT).show();
                }

            }
        });



    }
    public void openActivity2(){

        Intent sample = new Intent(this,Activity2.class);
        startActivity(sample);

    }
}

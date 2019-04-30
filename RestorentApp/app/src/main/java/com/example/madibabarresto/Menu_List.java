package com.example.madibabarresto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

public class Menu_List extends AppCompatActivity {
    ListView listView;


    String[] listviewItem = new String[]{
           "MAIN DISHS ", "Beff","Chicken Wings","Steke","Mushroom","Cips Salade","Pome Natule","Gacumbari","Goht","Boirro",
            "PIZZA","Four Season","Vegetarian","Extoca","Chees",
            "AGATOGO","ChickenBoiro","BeefBoiro","Boiro No Meet",
            "SNACKES","Golilos"

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu__list);

        listView = (ListView)findViewById(R.id.notremenu);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ArrayAdapter<String>adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,android.R.id.text1,listviewItem);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String listesviEw = listviewItem[position].toString();

                Intent mo = new Intent(Menu_List.this,secondActivity.class);
                mo.putExtra("listviewclickvalue",listesviEw );
                startActivity(mo);


            }
        });
        getSupportActionBar().setTitle("Golden Resto&Bar Menu");

    }
}

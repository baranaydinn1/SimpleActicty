package com.example.multipleacticty;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

   /* public void goToNext(View view){
        Intent intent=new Intent(getApplicationContext(),SecondActivity.class); we tried with button first lets try another fuction which is listview
        intent.putExtra("age",27);
        startActivity(intent);
    } */


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView =findViewById(R.id.listView);
        ArrayList<String>friends = new ArrayList<String>();
        friends.add("Acos");
        friends.add("Baran");
        friends.add("Nevzat");
        friends.add("Acos");

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_expandable_list_item_1,friends);

        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {     //Regardig select item  on listview we gotta proivde that function
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getApplicationContext(),SecondActivity.class);
                intent.putExtra("name",friends.get(i));
                startActivity(intent);

            }
        });

    }
}
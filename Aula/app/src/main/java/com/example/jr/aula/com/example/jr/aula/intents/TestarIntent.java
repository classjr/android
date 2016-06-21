package com.example.jr.aula.com.example.jr.aula.intents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.jr.aula.R;

import java.util.ArrayList;

public class TestarIntent extends AppCompatActivity {

    private ListView listNames;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_testar_intent);

        /**
         * This Intent is responsable for capture the result
         */
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        String[] names = bundle.getStringArray("Names");

        //Create a link to ListView
        this.listNames = (ListView)findViewById(R.id.listNames);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,names);
        this.listNames.setAdapter(adapter);

    }
}

package com.monsh.resistance;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Resume extends AppCompatActivity {

    List<String> valuesList;
    ListView myListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resume);

        myListView = (ListView) findViewById(R.id.listView);

        valuesList = ResitancesValuesList.getValuesList();

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, valuesList);
        myListView.setAdapter(adapter);

        //int val = ChooseComplexType.getCircuitType();
    }

    /**
     * Calling activity Result
     */
    public void callResultPage(View view) {
        Intent intent = new Intent(this, Result.class);
        this.startActivity(intent);
    }

    /**
     * Calling ChhoseComplexType class with MODIFY button
     */
    public void modifyBtn(View v) {
        ResitancesValuesList.setValuesList(new ArrayList<String>());
        Intent intent = new Intent(this, ChooseComplexType.class);
        this.startActivity(intent);
    }

    public void callHome(View view) {
        ResitancesValuesList.setValuesList(new ArrayList<String>());
        Intent intent = new Intent(this, MainActivity.class);
        this.startActivity(intent);
    }
}
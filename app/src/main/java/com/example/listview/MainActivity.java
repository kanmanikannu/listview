Main activity: package com.example.list_view;

import android.os.Bundle; import android.widget.ArrayAdapter; import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

ListView simpleList;
String countryList[] = {"India", "China", "australia", "Portugal", "America", "NewZealand"};

@Override
protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    simpleList = (ListView)findViewById(R.id.simpleListView);
    ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.activity_listview, R.id.textView, countryList);
    simpleList.setAdapter(arrayAdapter);
}
}

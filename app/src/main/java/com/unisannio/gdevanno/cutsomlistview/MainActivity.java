package com.unisannio.gdevanno.cutsomlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    String fruitList[] = {"Apple","Banana","Apricot","Orange","Water Melon"};
    int fruitImage[] = {R.drawable.apple, R.drawable.banana, R.drawable.apricot, R.drawable.orangefruit, R.drawable.watermelon};
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.customListView);
        CustomBaseAdapter customBaseAdapter = new CustomBaseAdapter(getApplicationContext(), fruitList, fruitImage);
        listView.setAdapter(customBaseAdapter);
    }
}
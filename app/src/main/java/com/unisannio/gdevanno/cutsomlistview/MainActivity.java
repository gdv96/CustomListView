package com.unisannio.gdevanno.cutsomlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    String fruitList[] = {"Apple","Banana","Apricot","Orange","Water Melon"};
    int fruitImage[] = {R.drawable.apple, R.drawable.banana, R.drawable.apricot, R.drawable.orangefruit, R.drawable.watermelon};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
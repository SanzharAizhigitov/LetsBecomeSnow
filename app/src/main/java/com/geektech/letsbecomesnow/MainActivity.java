package com.geektech.letsbecomesnow;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.geektech.letsbecomesnow.SnowAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView snowRV;
    private ArrayList<String> snowList = new ArrayList<>();
    private SnowAdapter adapter = new SnowAdapter(snowList);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        snowRV = findViewById(R.id.recycler_view);

        loadData();
        snowRV.setAdapter(adapter);

    }
    private void loadData( ){
        snowList.add("А");
        snowList.add("Может");
        snowList.add("Просто");
        snowList.add("Снегом");
        snowList.add("Стать");
        snowList.add("Белым");
        snowList.add("Первым");
        snowList.add("Первым");
        snowList.add("Белым");
        snowList.add("По");
        snowList.add("Стеклу");
        snowList.add("Снегом");
        snowList.add("Стать");
    }
}
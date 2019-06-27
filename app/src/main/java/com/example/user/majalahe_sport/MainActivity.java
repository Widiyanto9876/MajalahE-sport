package com.example.user.majalahe_sport;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.user.majalahe_sport.Adapter.CardViewMajalah;
import com.example.user.majalahe_sport.entity.Majalah;
import com.example.user.majalahe_sport.Adapter.MajalahData;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView ;

    private CardViewMajalah adapter;
    private LinearLayoutManager layoutManager;
    private List<Majalah> majalahList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.rv_data);

        majalahList = new ArrayList<>();
        majalahList = MajalahData.getListData();

        layoutManager = new LinearLayoutManager(this);

        adapter = new CardViewMajalah(majalahList, this);

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }
}

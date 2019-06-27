package com.example.user.majalahe_sport;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import org.w3c.dom.Text;

public class majalah1 extends AppCompatActivity {

    private TextView tv_judul;
    private TextView tv_remarks;
    private TextView tv_detail;
    private ImageView imageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_majalah1);
        // inisialisasi
        tv_judul = (TextView) findViewById(R.id.judul);
        tv_remarks = (TextView) findViewById(R.id.remarks);
        tv_detail = (TextView) findViewById(R.id.detail);
        imageView = (ImageView) findViewById(R.id.gambar);
        //set data from inten
        Intent intent = getIntent();
        tv_judul.setText(intent.getStringExtra("judul" ));
        tv_remarks.setText(intent.getStringExtra("remarks"));
        Glide.with(this )
                .load(intent.getStringExtra("gambar"))
                .into(imageView);
        // equal buat sama dengan di string
        if (intent.getStringExtra("detail").equals("data1")){
            tv_detail.setText(this.getResources().getString(R.string.S1));
        }
        else if
            (intent.getStringExtra("detail").equals("data2")){
                tv_detail.setText(this.getResources().getString(R.string.S2));
        }
        else if
                (intent.getStringExtra("detail").equals("data3")){
            tv_detail.setText(this.getResources().getString(R.string.S3));
        }
        else if
                (intent.getStringExtra("detail").equals("data4")){
            tv_detail.setText(this.getResources().getString(R.string.S4));
        }







    }
}

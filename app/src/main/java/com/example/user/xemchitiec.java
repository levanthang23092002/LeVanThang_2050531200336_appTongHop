package com.example.user;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class xemchitiec extends AppCompatActivity  {
        private ImageView logo,image_rate_ct,image_main;
        private TextView txtname,ratio_ct,type,year_ct,love_ct,amount_rate_ct;
        private Button btndownload;
        private ProgressBar progressBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xemchitiec);
        Intent intent = getIntent();
        item_game item_game = (item_game) intent.getSerializableExtra("item_game");

        image_main=findViewById(R.id.image);
        logo =findViewById(R.id.logo);
        txtname=findViewById(R.id.txtname);
        ratio_ct=findViewById(R.id.ratio_ct);
        type=findViewById(R.id.type);
        year_ct=findViewById(R.id.year_ct);
        image_rate_ct=findViewById(R.id.image_rate_ct);
        love_ct=findViewById(R.id.love_ct);
        amount_rate_ct=findViewById(R.id.amount_rate_ct);



        btndownload=findViewById(R.id.Down);
        progressBar=findViewById(R.id.run);

        image_main.setImageResource(item_game.getImage());
        txtname.setText(item_game.getName());
        logo.setImageResource(item_game.getImage());
        ratio_ct.setText(item_game.getRatio());
        type.setText(item_game.getType());
        image_rate_ct.setImageResource(item_game.getImage_rate());
        year_ct.setText(item_game.getYear());
        love_ct.setText(item_game.getAmount());
        amount_rate_ct.setText(item_game.getAmount_rate());










        btndownload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                progressBar.setProgress(0);
                final int totalProgressTime = 100;
                final Thread thread = new Thread() {
                    @Override
                    public void run() {
                        int jumpTime = 0;
                        while (jumpTime < totalProgressTime) {
                            int radom=50+(int)(Math.random()*(800-2)+1);
                            try {
                                sleep(radom);
                                jumpTime += 1;
                                progressBar.setProgress(jumpTime);
//                      Hoặc:
//                      progressBar.incrementProgressBy(5);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                };
                thread.start();





            }
        });



    }


}
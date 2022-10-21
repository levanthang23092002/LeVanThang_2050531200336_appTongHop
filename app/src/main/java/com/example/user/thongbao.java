package com.example.user;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.io.Serializable;
import java.util.ArrayList;

public class thongbao extends AppCompatActivity {
    Button quayve;
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thongbao);
        setTitle("Thông báo");
        quayve=findViewById(R.id.btnquayvehome);
        quayve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openhome();
            }

        });

        listView = findViewById(R.id.listview);
        ArrayList<listthongbao> arrayList;
        adapterthongbao adapter;
        arrayList = new ArrayList<>();
        arrayList.add(new listthongbao("Longca","Vừa Đạt top 1",R.drawable.image1,R.drawable.tru,R.drawable.bacham,"6 phút trước"));
        arrayList.add(new listthongbao("Longca","Vừa Đạt top 1",R.drawable.image1,R.drawable.tru,R.drawable.bacham,"7 phút trước"));
        arrayList.add(new listthongbao("tantu"," Vừa Đạt top 1",R.drawable.image2,R.drawable.tru,R.drawable.bacham,"10 phút trước"));
        arrayList.add(new listthongbao("congphung","Vừa Đạt top 1",R.drawable.image1,R.drawable.tru,R.drawable.bacham,"1 tiếng trước"));
        arrayList.add(new listthongbao("quanghai","Vừa Đạt top 1",R.drawable.image1,R.drawable.tru,R.drawable.bacham,"1 ngày trước"));
        arrayList.add(new listthongbao("vanhau","Vừa Đạt top 1 ",R.drawable.image2,R.drawable.tru,R.drawable.bacham,"2 ngày trước"));

        arrayList.add(new listthongbao("longle"," Vừa Đạt top 1",R.drawable.image1,R.drawable.tru,R.drawable.bacham," 2 ngày trước"));
        arrayList.add(new listthongbao("congphung","Vừa Đạt top 1",R.drawable.image2,R.drawable.tru,R.drawable.bacham,"1 tuần trước"));
        arrayList.add(new listthongbao("quanghai","Vừa Đạt top 1",R.drawable.image1,R.drawable.tru,R.drawable.bacham,"1 tuần trước"));
        arrayList.add(new listthongbao("vanhau","Vừa Đạt top 1",R.drawable.image2,R.drawable.tru,R.drawable.bacham,"1 tháng trước" ));
        adapter = new adapterthongbao(thongbao.this,R.layout.layout_thongbao,arrayList);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(),"Hello ",Toast.LENGTH_SHORT).show();
            }
        });


    }
    public void openhome(){
        Intent intent = new Intent(this ,home.class);
        startActivity(intent);
    }
}
package com.example.user;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

import java.util.ArrayList;
import java.util.List;

public class home extends AppCompatActivity implements Item_game_Adapter.OnGameListener{
    private  RecyclerView recyview;
    private List<item_game> item_game_List;
    private Button btnDownload,btnlistview;
    private ProgressBar progressBar;



    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Toolbar toolbar = findViewById(R.id.toolbar);
        item_game_List= getlistvideo();
        btnlistview = findViewById(R.id.btndangxuat);

        setTitle("Trang Chủ");

        recyview =findViewById(R.id.baidang);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,1);
        recyview.setLayoutManager(gridLayoutManager);
        Item_game_Adapter adapter = new Item_game_Adapter(home.this,this,item_game_List);
        recyview.setAdapter(adapter);



        btnDownload=(Button)findViewById(R.id.Down);
        progressBar=(ProgressBar)findViewById(R.id.run);




    }






    private List<item_game> getlistvideo() {
        List<item_game> list =new ArrayList<>();
        list.add(new item_game(R.drawable.image1,"The gaming","1+ ","game Sport","15N","13N","2.0",R.drawable.hai_sao));
        list.add(new item_game(R.drawable.image2,"The gaming","1 ","game Sport","15N","13N","4.0",R.drawable.bon_sao));
        list.add(new item_game(R.drawable.image1,"The gaming","1 ","game Sport","15N","13N","2.0",R.drawable.hai_sao));
        list.add(new item_game(R.drawable.image2,"The gaming","1 ","game Sport","15N","13N","4.5",R.drawable.bon_sao));
        list.add(new item_game(R.drawable.image1,"The gaming","1 ","game Sport","15N","13N","4.5",R.drawable.hai_sao));
        list.add(new item_game(R.drawable.image2,"The gaming","1 ","game Sport","15N","13N","4.5",R.drawable.hai_sao));
        list.add(new item_game(R.drawable.image1,"The gaming","1 ","game Sport","15N","13N","4.5",R.drawable.hai_sao));
        list.add(new item_game(R.drawable.image2,"The gaming","1 ","game Sport","15N","13N","4.5",R.drawable.hai_sao));
        list.add(new item_game(R.drawable.image1,"The gaming","1 ","game Sport","15N","13N","4.5",R.drawable.hai_sao));
        list.add(new item_game(R.drawable.image2,"The gaming","1 ","game Sport","15N","13N","4.5",R.drawable.hai_sao));
        list.add(new item_game(R.drawable.image1,"The gaming","1 ","game Sport","15N","13N","4.5",R.drawable.hai_sao));
        list.add(new item_game(R.drawable.image2,"The gaming","1 ","game Sport","15N","13N","4.5",R.drawable.hai_sao));
        list.add(new item_game(R.drawable.image1,"The gaming","1 ","game Sport","15N","13N","4.5",R.drawable.hai_sao));
        list.add(new item_game(R.drawable.image2,"The gaming","1 ","game Sport","15N","13N","4.5",R.drawable.hai_sao));


        return list;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menutoolbar,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected( MenuItem item) {

        int id= item.getItemId();
        switch (id){
            case R.id.btnprofile:
                openprofile();
                break;
            case R.id.btnlistview:
                openthongbao();
                break;

            case R.id.btndangxuat:
                opensignin();
                break;
            case R.id.toolbarprofile:
                openprofile();
                break;
            case R.id.toolbarlistview:
                openthongbao();
                break;
            default:
                break;

        }
        return super.onOptionsItemSelected(item);
    }

    private void openthongbao() {
        Intent intent = new Intent(this ,thongbao.class);
        startActivity(intent);
    }

    public void openprofile(){
        Intent intent = new Intent(this ,profile.class);
        startActivity(intent);
    }
    public void opensignin(){
        Intent intent = new Intent(this ,MainActivity.class);
        startActivity(intent);
    }


    @Override
    public void onGameClick(int position) {
        item_game item_game = item_game_List.get(position);
        Intent intent = new Intent(home.this, xemchitiec.class);
         intent.putExtra("item_game", item_game);
        startActivity(intent);
    }



}
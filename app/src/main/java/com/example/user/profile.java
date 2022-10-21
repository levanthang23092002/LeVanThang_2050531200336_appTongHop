package com.example.user;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class profile extends AppCompatActivity {
    private View back;
    private TextView name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        setTitle("Profile");
        back = findViewById(R.id.btnback);
        name =findViewById(R.id.txtnamepro);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openhome();
            }
        });


    }
    public void openhome(){
        Intent intent = new Intent(this ,home.class);
        startActivity(intent);
    }
    public void backlognin(){
        Intent intent =new Intent(this,MainActivity.class);
        startActivity(intent);
    }
    protected void onResume(){
        super.onResume();
        name.setText(appunti.name);

    }
}
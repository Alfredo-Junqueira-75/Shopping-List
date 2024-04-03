package com.junqueira.shoppinglist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainPage extends AppCompatActivity {

    Button btnMainPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);

        btnMainPage=(Button)findViewById(R.id.buttonMainPage);

        btnMainPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrTelaNewList();
            }
        });
    }

    public void abrTelaNewList(){
        Intent it_tela_new_list = new Intent(this, NewList.class);
        startActivity(it_tela_new_list);
    }
}
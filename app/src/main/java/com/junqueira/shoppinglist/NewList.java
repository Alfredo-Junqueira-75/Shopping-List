package com.junqueira.shoppinglist;

import androidx.appcompat.app.AppCompatActivity;
import com.junqueira.shoppinglist.models.List;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class NewList extends AppCompatActivity {

    Button btnDone, btnCancel;
    EditText etListName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_list);

        btnDone =(Button)findViewById(R.id.btnDone);
        btnCancel = findViewById(R.id.btnCancel);
        etListName = findViewById(R.id.etListName);

        btnDone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                List newList = new List(etListName.getText().toString());
                Intent intent = new Intent(NewList.this, ShoppingList.class);
                intent.putExtra("lista", newList);
                startActivity(intent);
            }
        });

    }



}
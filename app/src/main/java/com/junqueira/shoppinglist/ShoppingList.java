package com.junqueira.shoppinglist;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.junqueira.shoppinglist.models.Item;
import com.junqueira.shoppinglist.models.List;

import java.util.ArrayList;

public class ShoppingList extends AppCompatActivity {

    Button btnNewItem;
    TextView tvListTitle, tvItems;
    private List receivedList;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        btnNewItem=(Button) findViewById(R.id.btnNewItem);
        tvListTitle=(TextView) findViewById(R.id.List_Title);
        tvItems=(TextView) findViewById(R.id.tvItems);

        Intent intent = getIntent();
        receivedList = (List) intent.getSerializableExtra("lista");

        if (receivedList != null) {
            tvListTitle.setText(receivedList.getName());

        } else {
            tvListTitle.setText("Lista sem nome");
        }

        btnNewItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrTelaNewItem();
            }
        });



    }

    private static final int NEW_ITEM_REQUEST_CODE = 1;

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == NEW_ITEM_REQUEST_CODE && resultCode == RESULT_OK) {

            //receivedList.addItem((Item) data.getSerializableExtra("item"));
            Toast.makeText(this, "OK", Toast.LENGTH_LONG);

            /*if (updatedList != null) {
                tvItems.setText(buildItemListString(updatedList.getList()));
            }*/
        }
    }


    private String buildItemListString(ArrayList<Item> items) {
        StringBuilder stringBuilder = new StringBuilder();
        for (Item item : items) {
            stringBuilder.append(item.getName()).append(" - ").append(item.getAmount()).append("\n");
        }
        return stringBuilder.toString();
    }


    public void abrTelaNewItem(){
        Intent it_tela_new_item = new Intent(this, NewItem.class);
        startActivity(it_tela_new_item);
    }
}
package com.junqueira.shoppinglist;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.junqueira.shoppinglist.models.Item;
import com.junqueira.shoppinglist.models.List;

public class NewItem extends AppCompatActivity {

    Button btnItemDone, btnITemCancel;
    EditText etItemName, etItemAmount, etItemDetails;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_item);

        btnItemDone=(Button) findViewById(R.id.btnItemDone);
        btnITemCancel=(Button) findViewById(R.id.btnItemCancel);

        etItemName=(EditText) findViewById(R.id.etItemName);
        etItemAmount=(EditText) findViewById(R.id.etItemAmount);
        etItemDetails=(EditText) findViewById(R.id.etItemDetails);

        btnItemDone.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("UnsafeIntentLaunch")
            @Override
            public void onClick(View v) {
                String name = etItemName.getText().toString();
                int amount = Integer.parseInt(etItemAmount.getText().toString());
                String details = etItemDetails.getText().toString();
                Item item = new Item(name, amount, details);


                Intent resultIntent = new Intent();
                resultIntent.putExtra("item", item);
                setResult(RESULT_OK, resultIntent);

                finish();
            }
        });
    }
}
package com.example.veb1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class ActivityC extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c);

        Button buttonActAfromC = findViewById(R.id.opActivityA_С);
        buttonActAfromC.setOnClickListener(view -> {
            Intent intent  = new Intent(ActivityC.this, ActivityA.class);
            startActivity(intent);
        });
        Button buttonActBfromC = findViewById(R.id.openActivityB_С);
        buttonActBfromC.setOnClickListener(view -> {
            Intent intent  = new Intent(ActivityC.this, ActivityB.class);
            startActivity(intent);
        });
        Button buttonActD = findViewById(R.id.opActivityD);
        buttonActD.setOnClickListener(view -> {
            Intent intent  = new Intent(ActivityC.this, ActivityD.class);
            finishAffinity();
            startActivity(intent);
        });
        Button closeStack = findViewById(R.id.CloseStack);
        closeStack.setOnClickListener(view -> finishAffinity());
    }
}
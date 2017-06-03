package com.adawolfs.banca;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MenuActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        findViewById(R.id.btCard).setOnClickListener(this);
        findViewById(R.id.btLoan).setOnClickListener(this);
        findViewById(R.id.btService).setOnClickListener(this);
        findViewById(R.id.btLogout).setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.btCard){
            Intent i = new Intent(this, CardPaymentActivity.class);
            startActivity(i);
        } else if(v.getId() == R.id.btLoan){
            Intent i = new Intent(this, LoanPaymentActivity.class);
            startActivity(i);
        } else if(v.getId() == R.id.btService){
            Intent i = new Intent(this, ServicePaymentActivity.class);
            startActivity(i);
        } else if(v.getId() == R.id.btLogout){
            Intent i = new Intent(this, MainActivity.class);
            startActivity(i);
            finish();
        }
    }
}

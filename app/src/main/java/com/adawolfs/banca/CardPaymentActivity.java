package com.adawolfs.banca;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class CardPaymentActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_payment);
        findViewById(R.id.button).setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Toast.makeText(this, "Pago Realizado", Toast.LENGTH_SHORT).show();
    }
}

package com.adawolfs.banca;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.adawolfs.banca.orm.User;

import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView user, password;
    Button login, newUser;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        user = (EditText) findViewById(R.id.etUser);
        password = (EditText) findViewById(R.id.etPassword);
        login = (Button) findViewById(R.id.bLogin);
        newUser = (Button) findViewById(R.id.bNewAccount);

        login.setOnClickListener(this);
        newUser.setOnClickListener(this);
        Toast.makeText(this, "Login", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == login.getId()){
            String userName = user.getText().toString();
            String userPass = password.getText().toString();
            List<User> users = User.find(User.class, "name = ? and password = ?",
                    userName, userPass);
            //if(!users.isEmpty()){
                Intent i = new Intent(this, MenuActivity    .class);
                startActivity(i);
                finish();
            //}
        } else if (v.getId() == newUser.getId()){
            Toast.makeText(this, "Click", Toast.LENGTH_SHORT).show();
        }


    }
}

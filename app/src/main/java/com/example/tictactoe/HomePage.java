package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomePage extends AppCompatActivity {
Button btnDjrs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        btnDjrs=(Button)findViewById(R.id.btnDeuxJoueur);
    }
    public  void openJoueur(View v){
        Intent i=new Intent(this,Page1.class);
        startActivity(i);
    }
}

package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Page1 extends AppCompatActivity {
    public  static String Extrajoueur1="m_joueur1";
    public  static String Extrajoueur2="m_joueur2";
    EditText joueur1,joueur2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page1);
        joueur1=(EditText)findViewById(R.id.txtLeJoueur1);
        joueur2=(EditText)findViewById(R.id.txtLeJoueur2);
    }

    public  void Entrerjoueur(View v){

        String j1=joueur1.getText().toString();
        String j2=joueur2.getText().toString();

        Intent i=new Intent(this,Page2.class);

        i.putExtra(Extrajoueur1,j1);
        i.putExtra(Extrajoueur2,j2);
        startActivity(i);

    }
}

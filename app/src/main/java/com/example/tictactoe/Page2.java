package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Page2 extends AppCompatActivity {
    public  static String ExtraPlayer1="m_joueur1";
    public  static String ExtraPlayer2="m_joueur2";
    TextView player1,player2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);
        player1=(TextView)findViewById(R.id.txtLeJoueur1);
        player2=(TextView)findViewById(R.id.txtLeJoueur2);
        Intent i=getIntent();
        String c=i.getStringExtra(Page1.Extrajoueur1);
        String n=i.getStringExtra(Page1.Extrajoueur2);

        player1.setText(c);
        player2.setText(n);

    }

    public  void getInfoActivity(View v){

        String j1=player1.getText().toString();
        String j2=player2.getText().toString();

        Intent myI=new Intent(this,Main2Activity.class);

        myI.putExtra(ExtraPlayer1,j1);
        myI.putExtra(ExtraPlayer2,j2);
        startActivity(myI);

    }


}

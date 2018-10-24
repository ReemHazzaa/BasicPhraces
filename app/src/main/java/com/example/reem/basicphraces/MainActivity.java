package com.example.reem.basicphraces;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    public void play(View view){
        Button pressedButton = (Button) view;
        TextView phraseTextView = findViewById(R.id.phraseTextView);
        phraseTextView.setVisibility(view.VISIBLE);

        String phraseTOBePlayed = view.getTag().toString();

        MediaPlayer mPlayer = MediaPlayer.create(this, getResources().getIdentifier(phraseTOBePlayed, "raw", getPackageName()));
        mPlayer.start();


        if(phraseTOBePlayed.equals("canyoutakemetoairportplease")){
            phraseTextView.setText("Beni havalimanı götürebilirmisiniz lütfen?");

        }else if(phraseTOBePlayed.equals("howmuchwillitbe")){
            phraseTextView.setText("Ne kadar tutar?");

        }else if(phraseTOBePlayed.equals("isitfarfromhere")){
            phraseTextView.setText("Buraya uzak mi?");

        }else if(phraseTOBePlayed.equals("itsstraighton")){
            phraseTextView.setText("Dümdüz gidin.");

        }else if(phraseTOBePlayed.equals("stop")){
            phraseTextView.setText("Dur!");

        }else if(phraseTOBePlayed.equals("takemethereplease")){
            phraseTextView.setText("Lütfen beni buraya götürün.");

        }else if(phraseTOBePlayed.equals("taxi")){
            phraseTextView.setText("Taxi!");

        }else{
            phraseTextView.setText("Sola gideceksinis.");
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

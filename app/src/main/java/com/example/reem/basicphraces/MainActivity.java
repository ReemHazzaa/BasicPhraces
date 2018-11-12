package com.example.reem.basicphraces;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void play(View view){
        Button pressedButton = (Button) view;

        String phraseTOBePlayed = view.getTag().toString();

        MediaPlayer mPlayer = MediaPlayer.create(this, getResources().getIdentifier(phraseTOBePlayed, "raw", getPackageName()));
        mPlayer.start();


        if(phraseTOBePlayed.equals("canyoutakemetoairportplease")){
            makeLongToast("Beni havalimanı götürebilirmisiniz lütfen?");

        }else if(phraseTOBePlayed.equals("howmuchwillitbe")){
            makeLongToast("Ne kadar tutar?");

        }else if(phraseTOBePlayed.equals("isitfarfromhere")){
            makeLongToast("Buraya uzak mi?");

        }else if(phraseTOBePlayed.equals("itsstraighton")){
            makeLongToast("Dümdüz gidin.");

        }else if(phraseTOBePlayed.equals("stop")){
            makeLongToast("Dur!");

        }else if(phraseTOBePlayed.equals("takemethereplease")){
            makeLongToast("Lütfen beni buraya götürün.");

        }else if(phraseTOBePlayed.equals("taxi")){
            makeLongToast("Taxi!");

        }else{
            makeLongToast("Sola gideceksinis.");
        }
    }

    public void makeLongToast(String turkishTranslation) {
        Toast.makeText(this, turkishTranslation, Toast.LENGTH_LONG).show();
    }
}

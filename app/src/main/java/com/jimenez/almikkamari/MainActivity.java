package com.jimenez.almikkamari;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         Log.d("act5", "onCreate activity1 will run.");
    }
    @Override
    protected void onStart(){
        super.onStart();
        Log.d("act5", "onStart activity1 will run.");

    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.d("act5", "onResume activity1 will run.");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.d("act5", "onStop activity1 will run.");
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.d("act5", "onRestart activity1 will run.");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d("act5", "onDestroy activity1 will run.");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.d("act5", "onPause activity1 will run.");
    }


    public void process(android.view.View v) {
        Intent i = null, chooser = null;

        if (v.getId() == R.id.btnAct2) {

            i = new Intent(this, activity2.class);

            startActivity(i);

    } else if(v.getId()==R.id.btnMap){
            i=new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo:48.871652,2.314630"));

            chooser= Intent.createChooser(i, "Select Map");

            startActivity(chooser);

        }
    }
}

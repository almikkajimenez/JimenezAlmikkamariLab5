package com.jimenez.almikkamari;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        Log.d("act5", "onCreate will run.");
        Intent i = new Intent(this, MyService.class);
        startService(i);
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.d("act5", "onStart activity2 will run.");

    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.d("act5", "onResume activity2 will run.");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.d("act5", "onStop activity2 will run.");
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.d("act5", "onRestart activity2 will run.");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d("act5", "onDestroy activity2 will run.");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.d("act5", "onPause activity2 will run.");
    }

    public void process(android.view.View v) {
        Intent i = null, chooser = null;

        if (v.getId() == R.id.btnAct1) {

            i = new Intent(this, MainActivity.class);

            startActivity(i);

        } else if(v.getId()==R.id.btnMap1){
            i=new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo:48.863819,2.293331"));

            chooser= Intent.createChooser(i, "Select Map");

            startActivity(chooser);

        }
    }

}
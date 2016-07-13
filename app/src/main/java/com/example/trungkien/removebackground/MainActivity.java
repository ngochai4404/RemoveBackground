package com.example.trungkien.removebackground;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity implements View.OnClickListener{

    Button btnEraser,btnJoin;


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnEraser= (Button) findViewById(R.id.btnEraser);
        btnJoin= (Button) findViewById(R.id.btnJoin);
        btnEraser.setOnClickListener(this);
        btnJoin.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnEraser:
                startActivity(new Intent(getBaseContext(),menu1.class));
                break;
            case R.id.btnJoin:
                startActivity(new Intent(getBaseContext(),menu1.class));
                break;
        }
    }
}

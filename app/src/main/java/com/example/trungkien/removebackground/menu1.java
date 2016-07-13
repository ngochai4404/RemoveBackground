package com.example.trungkien.removebackground;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class menu1 extends ActionBarActivity implements View.OnClickListener{
    Button btnCamera,btnGallery,btnFolder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu1);
        btnCamera= (Button) findViewById(R.id.btnCamera);
        btnGallery= (Button) findViewById(R.id.btnGallery);
        btnFolder= (Button) findViewById(R.id.btnFolder);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnCamera:
                break;
            case R.id.btnEraser:
                break;
            case R.id.btnGallery:
                break;
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.action_bar, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.mnCheck) {
            this.finish();
        }

        return super.onOptionsItemSelected(item);
    }
}

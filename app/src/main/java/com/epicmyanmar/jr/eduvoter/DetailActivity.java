package com.epicmyanmar.jr.eduvoter;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.widget.TextView;


public class DetailActivity extends AppCompatActivity {
    Toolbar toolbar;
    TextView tv_detail_header,tv_detail_description;
    WebView wv_detail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        toolbar=(Toolbar)findViewById(R.id.item_1toolbar);
        wv_detail=(WebView) findViewById(R.id.wv_detail);
        wv_detail.loadUrl("http://www.google.com");
        initialize();
        Intent intent=getIntent();
        String header=intent.getStringExtra("header");
        String description=intent.getStringExtra("description");
        getSupportActionBar().setTitle(header);



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_detail, menu);
        return true;
    }
    void initialize(){
        setSupportActionBar(toolbar);

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setTitle("How to Vote");
            actionBar.setHomeButtonEnabled(true);
            actionBar.setDisplayHomeAsUpEnabled(true);

        }
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

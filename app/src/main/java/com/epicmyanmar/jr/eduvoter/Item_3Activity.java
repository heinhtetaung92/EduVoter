package com.epicmyanmar.jr.eduvoter;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ListView;

import java.util.Arrays;
import java.util.List;

import adapter.Item2Adapter;


public class Item_3Activity extends ActionBarActivity {
    Toolbar toolbar;
    /*ListView listview;
    Button title2;*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_2);

        //title2 = (Button) findViewById(R.id.item2_title2);
        toolbar=(Toolbar) findViewById(R.id.toolbar);
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

        WebView webView = (WebView) findViewById(R.id.item2_webview);
        webView.loadUrl("file:///android_asset/htmls/definitions.html");

        /*listview = (ListView) findViewById(R.id.item2_listview);
        List<String> dl = Arrays.asList(new String[]{"one", "one", "one", "one", "one", "one", "one", "one", "one"});
        Item2Adapter adp = new Item2Adapter(this, dl);
        listview.setAdapter(adp);



        title2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://checkvoterlist.uecmyanmar.org"));
                startActivity(browserIntent);

            }
        });*/

    }






}

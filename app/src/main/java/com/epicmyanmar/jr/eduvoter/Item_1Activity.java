package com.epicmyanmar.jr.eduvoter;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import adapter.Item1_Card_adapter;
import model.VoteRules;


public class Item_1Activity extends ActionBarActivity {
    Toolbar toolbar;
    ListView listView;

    List<VoteRules> mVoteList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_1);
        toolbar=(Toolbar)findViewById(R.id.item_1toolbar);

        initialize();
        demo_db();

        listView=(ListView) findViewById(R.id.item1_list);
        Item1_Card_adapter item1_card_adapter=new Item1_Card_adapter(this,mVoteList);
        listView.setAdapter(item1_card_adapter);
        listView.setOnItemClickListener(new item1_listCLickListener());
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


    void demo_db(){
        mVoteList=new ArrayList<VoteRules>();
        VoteRules vr1=new VoteRules();
        vr1.setHeader("Header 1");
        vr1.setDescription("Lorem ispumLorem ispumLorem ispumLorem ispumLorem ispumLorem ispumLorem ispumLorem ispum");
        VoteRules vr2=new VoteRules();
        vr2.setHeader("Header 2");
        vr2.setDescription("Lorem ispumLorem ispumLorem ispumLorem ispumLorem ispumLorem ispumLorem ispumLorem ispum");
        VoteRules vr3=new VoteRules();
        vr3.setHeader("Header 1");
        vr3.setDescription("Lorem ispumLorem ispumLorem ispumLorem ispumLorem ispumLorem ispumLorem ispumLorem ispum");
        mVoteList.add(vr1);
        mVoteList.add(vr2);
        mVoteList.add(vr3);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_item_1, menu);
        return true;
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

    protected  class item1_listCLickListener implements AdapterView.OnItemClickListener {

        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            Intent intent=new Intent(getApplication(),DetailActivity.class);
            intent.putExtra("header",mVoteList.get(position).getHeader());
            intent.putExtra("description",mVoteList.get(position).getDescription());
            startActivity(intent);
        }
    }
}

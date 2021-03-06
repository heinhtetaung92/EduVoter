package com.epicmyanmar.jr.eduvoter;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.Arrays;
import java.util.List;

import adapter.Cardview_Adapter;
import uk.co.chrisjenx.calligraphy.CalligraphyConfig;


public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    Toolbar toolbar;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                        .setDefaultFontPath("fonts/avenir-next-demibold.ttf")
                        .setFontAttrId(R.attr.fontPath)
                        .build()
        );
        toolbar=(Toolbar) findViewById(R.id.toolbar);

        initialize();

        listView = (ListView) findViewById(R.id.main_list);
        List<String> datalist = Arrays.asList(new String[]{"မဲစာရင်းပြုစုခြင်းနှင့် \n" +
                "မဲစာရင်းစစ်ဆေးခြင်း","မေးလေ့ရှိသည်များ","အဓိပ္ပယ်ဖွင့်ဆိုချက်များ"});
        Cardview_Adapter adp = new Cardview_Adapter(this, datalist);
        listView.setAdapter(adp);

        listView.setOnItemClickListener(this);

    }
    void initialize(){
        setSupportActionBar(toolbar);


    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        switch (position){

            case 0:
                startActivity(new Intent(MainActivity.this, Item_1Activity.class));
                break;

            case 1:
                startActivity(new Intent(MainActivity.this, Item_3Activity.class));
                break;

            case 2:
                startActivity(new Intent(MainActivity.this, Item_2Activity.class));
                break;

        }
    }


    /*@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
    }*/
}

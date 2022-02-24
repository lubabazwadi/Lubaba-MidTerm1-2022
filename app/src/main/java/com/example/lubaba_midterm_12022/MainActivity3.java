package com.example.lubaba_midterm_12022;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        setTitle(R.string.activity3);

        final Button mainButton1 = (Button) findViewById(R.id.activity11);
        final Button mainButton2 = (Button) findViewById(R.id.activity22);

        mainButton1.setOnClickListener(e-> startActivity(new Intent(MainActivity3.this,MainActivity.class)));
        mainButton2.setOnClickListener(e-> startActivity(new Intent(MainActivity3.this,MainActivity2.class)));
        ListView listView = (ListView) findViewById(R.id.lv);
        MediaPlayer catPlayer = MediaPlayer.create(this, R.raw.track1);

        String[] imgs = {"First", "Second", "Third", "Forth",};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, imgs);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http:/alfaisal.com")));
                        break;
                    case 1:
                        startActivity(new Intent(MainActivity3.this, BigItem.class));
                        break;
                    case 2:
                        catPlayer.start();
                        break;
                    case 3:
                        startActivity(new Intent(MainActivity3.this, Splash.class));
                        break;
                }
            }
        });
    }
}
package com.example.lubaba_midterm_12022;
import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TableLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.text.DateFormat;
import java.util.Calendar;

public class MainActivity2 extends AppCompatActivity {

    private TextView reservation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        setTitle(R.string.activity2);

        final TableLayout t1 = (TableLayout) findViewById(R.id.tableLayout);

        final Button mainButton1 = (Button) findViewById(R.id.activity111);
        final Button mainButton2 = (Button) findViewById(R.id.activity333);
        final ImageView ta1= (ImageView) findViewById(R.id.ta1);
        final ImageView ta2= (ImageView) findViewById(R.id.ta2);
        final ImageView ta3= (ImageView) findViewById(R.id.ta3);
        final ImageView ta4= (ImageView) findViewById(R.id.ta4);
        final ImageView bigta= (ImageView) findViewById(R.id.bigta);

        ta1.setOnClickListener(e-> {bigta.setImageDrawable(ta1.getDrawable()); Toast.makeText(MainActivity2.this, "you clicked on pic1", Toast.LENGTH_LONG).show();});
        ta2.setOnClickListener(e-> {bigta.setImageDrawable(ta2.getDrawable()); Toast.makeText(MainActivity2.this, "you clicked on pic2", Toast.LENGTH_LONG).show();});
        ta3.setOnClickListener(e-> {bigta.setImageDrawable(ta3.getDrawable()); Toast.makeText(MainActivity2.this, "you clicked on pic3", Toast.LENGTH_LONG).show();});
        ta4.setOnClickListener(e-> {bigta.setImageDrawable(ta4.getDrawable()); Toast.makeText(MainActivity2.this, "you clicked on pic4", Toast.LENGTH_LONG).show();});

        mainButton1.setOnClickListener(e-> startActivity(new Intent(MainActivity2.this,MainActivity.class)));
        mainButton2.setOnClickListener(e-> startActivity(new Intent(MainActivity2.this,MainActivity3.class)));

        t1.setOnClickListener(e-> Toast.makeText(MainActivity2.this, "alert message", Toast.LENGTH_LONG).show());
    }
}
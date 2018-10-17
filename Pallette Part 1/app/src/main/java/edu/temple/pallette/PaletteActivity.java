package edu.temple.pallette;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

import static android.graphics.Color.parseColor;

public class PaletteActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_palette);

        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        Resources res = getResources();
        final String[] colors = res.getStringArray(R.array.colorsArray);

        //final String colors[] = {"WHITE", "CYAN", "YELLOW", "GREEN", "RED"};

        CanvasActivity adapterOne = new CanvasActivity(this, colors);

        spinner.setAdapter(adapterOne);

        final RelativeLayout relativeLayout = findViewById(R.id.activityPal);

        AdapterView.OnItemSelectedListener selectColor = new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                relativeLayout.setBackgroundColor(Color.parseColor(colors[position]));
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                relativeLayout.setBackgroundColor(Color.parseColor("White"));
            }
        };
        spinner.setOnItemSelectedListener(selectColor);
    }
}
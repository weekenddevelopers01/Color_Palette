package com.weekenddevelopers.colorpalette;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.weekenddevelopers.colorpalette.utils.Adapter;

public class HomePage extends AppCompatActivity {
RecyclerView recyclerView;

static TextView textView;
static CardView cardView;

        String[] colors ={"#b71c1c", "#d32f2f", "#f44336", "#e57373", "#ffcdd2", "#880e4f", "#c2185b", "#e91e63", "#f06292", "#f8bbd0", "#4a148c", "#7b1fa2", "#9c27b0", "#ba68c8", "#e1bee7", "#311b92", "#512da8", "#673ab7", "#9575cd", "#d1c4e9", "#1a237e", "#303f9f", "#3f51b5", "#7986cb", "#c5cae9", "#0d47a1", "#1976d2", "#2196f3", "#64b5f6", "#bbdefb", "#01579b", "#0288d1", "#03a9f4", "#4fc3f7", "#b3e5fc", "#006064", "#0097a7", "#00bcd4", "#4dd0e1", "#b2ebf2", "#004d40", "#00796b", "#009688", "#4db6ac", "#b2dfdb", "#194D33", "#388e3c", "#4caf50", "#81c784", "#c8e6c9", "#33691e", "#689f38", "#8bc34a", "#aed581", "#dcedc8", "#827717", "#afb42b", "#cddc39", "#dce775", "#f0f4c3", "#f57f17", "#fbc02d", "#ffeb3b", "#fff176", "#fff9c4", "#ff6f00", "#ffa000", "#ffc107", "#ffd54f", "#ffecb3", "#e65100", "#f57c00", "#ff9800", "#ffb74d", "#ffe0b2", "#bf360c", "#e64a19", "#ff5722", "#ff8a65", "#ffccbc", "#3e2723", "#5d4037", "#795548", "#a1887f", "#d7ccc8", "#263238", "#455a64", "#607d8b", "#90a4ae", "#cfd8dc", "#000000", "#525252", "#969696", "#D9D9D9", "#FFFFFF"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        getSupportActionBar().hide();
        recyclerView = findViewById(R.id.gridrecycler);
        textView = findViewById(R.id.colorCode);
        cardView = findViewById(R.id.palette);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getApplicationContext(), 5);
        gridLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(gridLayoutManager);

        Adapter adapter = new Adapter(getApplicationContext(), colors);


        recyclerView.setAdapter(adapter);


    }

    public static void setColor(String colorCode){
        textView.setText(colorCode);
        cardView.setBackgroundColor(Color.parseColor(colorCode));
    }
}
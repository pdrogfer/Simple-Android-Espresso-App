package com.pgf.simpleandroidespressoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.btn_show_text);
        textView = (TextView) findViewById(R.id.tv_text);

    }

    public void onButtonClick(View view) {

        textView.setText("An old silent pond...\n" +
                "A frog jumps into the pond,\n" +
                "splash! Silence again.\n");
    }
}

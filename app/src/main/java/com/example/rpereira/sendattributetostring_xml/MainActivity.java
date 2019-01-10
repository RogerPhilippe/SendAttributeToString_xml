package com.example.rpereira.sendattributetostring_xml;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tvRandonValues = findViewById(R.id.idtvRandonValues);

        Random random = new Random();

        int val1 = random.nextInt(100);

        int val2 = random.nextInt(100);

        int val3 = random.nextInt(100);

        tvRandonValues.setText(getString(R.string.valores_randomicos, val1, val2, val3));

    }
}

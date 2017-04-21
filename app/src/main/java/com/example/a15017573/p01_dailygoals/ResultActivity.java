package com.example.a15017573.p01_dailygoals;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Intent intent = getIntent();

        String[] info = intent.getStringArrayExtra("info");

        TextView tvMaterial = (TextView) findViewById(R.id.textViewMaterialResult);
        TextView tvPunctual = (TextView) findViewById(R.id.textViewPunctualResult);
        TextView tvAttempt = (TextView) findViewById(R.id.textViewAttemptResult);
        TextView tvReflect = (TextView) findViewById(R.id.textViewReflectResult);

        tvMaterial.setText("Read up on materials before class: " + info[0]);
        tvPunctual.setText("Arrive on time so as not to miss important part of the lessson: " + info[1]);
        tvAttempt.setText("Attempt the problem myself: " + info[2]);
        tvReflect.setText("Reflection: " + info[3]);

    }
}

package com.example.a15017573.p01_dailygoals;

import android.content.Intent;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnOK = (Button) findViewById(R.id.buttonOK);

        btnOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                RadioGroup rgRead = (RadioGroup) findViewById(R.id.radioGroupRead);
                int readButtonID = rgRead.getCheckedRadioButtonId();
                RadioButton rbRead = (RadioButton) findViewById(readButtonID);

                RadioGroup rgPunctual = (RadioGroup) findViewById(R.id.radioGroupPunctual);
                int punctualButtonID = rgPunctual.getCheckedRadioButtonId();
                RadioButton rbPunctual = (RadioButton) findViewById(punctualButtonID);

                RadioGroup rgAttempt = (RadioGroup) findViewById(R.id.radioGroupAttempt);
                int attemptButtonID = rgAttempt.getCheckedRadioButtonId();
                RadioButton rbAttempt = (RadioButton) findViewById(attemptButtonID);

                EditText etReflect = (EditText) findViewById(R.id.editTextReflect);

                String[] info = {rbRead.getText().toString(), rbPunctual.getText().toString(), rbAttempt.getText().toString(), etReflect.getText().toString()};

                Intent intent = new Intent(MainActivity.this, ResultActivity.class);

                intent.putExtra("info", info);

                startActivity(intent);


            }
        });


    }
}

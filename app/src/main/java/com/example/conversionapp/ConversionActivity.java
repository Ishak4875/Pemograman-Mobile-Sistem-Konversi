package com.example.conversionapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ConversionActivity extends AppCompatActivity {

    EditText edt_task_value, edt_attendance_value, edt_mid_value, edt_final_value;
    EditText edt_total_value, edt_word_value;
    Button btn_count;
    String word;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversion);
        edt_task_value = findViewById(R.id.edt_student_task_value);
        edt_attendance_value = findViewById(R.id.edt_student_attendance_value);
        edt_mid_value = findViewById(R.id.edt_student_mid_value);
        edt_final_value = findViewById(R.id.edt_student_final_value);
        edt_total_value = findViewById(R.id.edt_total_value);
        edt_word_value = findViewById(R.id.edt_word_value);
        btn_count = findViewById(R.id.btn_count);

        btn_count.setOnClickListener(view -> {
            float task_value = Float.parseFloat(edt_task_value.getText().toString());
            float attendance_value = Float.parseFloat(edt_attendance_value.getText().toString());
            float mid_value = Float.parseFloat(edt_mid_value.getText().toString());
            float final_value = Float.parseFloat(edt_final_value.getText().toString());

            double value = (0.2 * task_value) + (0.1 * attendance_value) + (0.3 * mid_value)
                    + (0.4 * final_value);

            if (value >= 80){
                word = "A";
            }else if (value >= 70){
                word = "B";
            }else{
                word = "C";
            }

            edt_total_value.setText("" + value);
            edt_word_value.setText("" + word);
        });
    }
}
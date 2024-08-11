package com.example.mobileprogramminglab;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class DisplayText extends AppCompatActivity {

    private EditText editTextInput;
    private Button buttonSubmit;
    private TextView textViewOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_text);

        editTextInput = findViewById(R.id.editTextInput);
        buttonSubmit = findViewById(R.id.buttonSubmit);
        textViewOutput = findViewById(R.id.textViewOutput);

        buttonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userInput = editTextInput.getText().toString();
                textViewOutput.setText(userInput);
            }
        });
    }
}
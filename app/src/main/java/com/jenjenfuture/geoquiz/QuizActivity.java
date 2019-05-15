package com.jenjenfuture.geoquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class QuizActivity extends AppCompatActivity {

    private Button buttonLuis;
    private EditText editTextNumber1;
    private EditText editTextNumber2;
    private TextView textViewHasil;
    private Spinner spinner;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        buttonLuis = findViewById(R.id.id_btn_result);
        buttonLuis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                boolean error = false;

                if (editTextNumber1.getText().toString().equals(""))
                {
                    error = true;
                    editTextNumber1.setError("This field may not be empty");
                }
                if (editTextNumber2.getText().toString().equals(""))
                {
                    error = true;
                    editTextNumber2.setError("This field may not be empty");
                }
                if (!error) {
                    int a = Integer.parseInt(editTextNumber1.getText().toString());
                    int b = Integer.parseInt(editTextNumber2.getText().toString());
                    if (spinner.getSelectedItem().toString().equals("+"))
                    {
                        int sum = a + b;
                        textViewHasil.setText(String.valueOf(sum));

                    } else if (spinner.getSelectedItem().toString().equals("*"))
                    {

                        int sum = a * b;
                        textViewHasil.setText(String.valueOf(sum));

                    } else if (spinner.getSelectedItem().toString().equals("-"))
                    {
                        int sum = a - b;
                        textViewHasil.setText(String.valueOf(sum));

                    } else if (spinner.getSelectedItem().toString().equals("/"))
                    {

                        double sum = (double) a / b;
                        textViewHasil.setText(String.valueOf(sum));

                    }
                }


                

            }
        });
        editTextNumber1 = findViewById(R.id.id_edt_name);
        editTextNumber2 = findViewById(R.id.id_edt_nim);
        textViewHasil = findViewById(R.id.id_tv_str);

        String[] arraySpinner = new String[] {
                "+", "/", "*", "-"
        };
        spinner = (Spinner) findViewById(R.id.id_action_bar_spinner);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, arraySpinner);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);


    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}

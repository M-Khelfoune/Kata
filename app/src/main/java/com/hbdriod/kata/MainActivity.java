package com.hbdriod.kata;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final EditText editText = (EditText) findViewById(R.id.edit_text);

        Button button = (Button) findViewById(R.id.button);

        final TextView textView = (TextView) findViewById(R.id.text);
        textView.setText("Résultat");

        final Calculator calculator = new Calculator();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String string = editText.getText().toString();
                textView.setText(""+calculator.add(string));
            }
        });


    }

}

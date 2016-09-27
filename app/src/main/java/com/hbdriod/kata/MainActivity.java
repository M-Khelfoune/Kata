package com.hbdriod.kata;

import android.graphics.drawable.shapes.Shape;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        EditText editText = (EditText) findViewById(R.id.edit_text);
        editText.setText("Tapez ici votre calcul");

        Button button = (Button) findViewById(R.id.button);

        TextView textView = (TextView) findViewById(R.id.text);
        textView.setText("Résultat");

    }

}

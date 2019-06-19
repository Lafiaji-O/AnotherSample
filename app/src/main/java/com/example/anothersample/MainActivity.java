package com.example.anothersample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convertButton (View view) {

        ImageView catImageView = (ImageView) findViewById(R.id.catImageView);
        catImageView.setImageResource(R.drawable.cat2);

        EditText nameText = (EditText) findViewById(R.id.nameText);

        EditText editText3 = (EditText) findViewById(R.id.editText3);

        Double amount = Double.parseDouble(editText3.getText().toString());

        Double convert = amount * 0.85 ;

        Toast.makeText(MainActivity.this, "Hi "+ nameText.getText().toString() + ", your money in dollars is $" + String.format("%.2f", convert), Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

package com.example.dwis.spinnerarrayadaptor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    //Declare and Define the Datasource
    String animalList[] = {"Lion", "Tiger", "Monkey", "Elephant", "Dog", "Cat", "Camel"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Spinner spin = (Spinner) findViewById(R.id.animalNamesSpinner);
        spin.setOnItemSelectedListener(this);
        //Creating the ArrayAdapter instance having the animal name's list
        ArrayAdapter aa = new ArrayAdapter(this, android.R.layout.simple_spinner_item, animalList);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin.setAdapter(aa);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(getApplicationContext(), animalList[position], Toast.LENGTH_LONG).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}


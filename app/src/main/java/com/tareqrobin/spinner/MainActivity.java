package com.tareqrobin.spinner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {
    private Spinner spin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spin=findViewById(R.id.spn);

        final List<String> country=new ArrayList<String>();
        country.add("Bangladesh");
        country.add("Argentina");
        country.add("Brasil");
        country.add("Germany");
        country.add("Portugal");
        country.add("Croatia");

        ArrayAdapter<String> adptr=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,country);
        adptr.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin.setAdapter(adptr);

        spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this,country.get(i),Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}

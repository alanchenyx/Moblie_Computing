package com.example.alanc.helloworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button)findViewById(R.id.buttonAct1);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //move from activity one to activity two
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                intent.putExtra("myname", "alan");
                startActivity(intent);

            }
        });


        int intA = 0;
        int intB = 1;
        Log.d("MyApp","Value of A + B =" + (intA + intB));
        Log.d("MyApp","line number =" + 18);




    }
}

package com.murach.m15_progassign_app2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button while_loop, do_while_loop, for_loop, enhanced_for_loop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        while_loop = (Button)findViewById(R.id.while_loop);
        do_while_loop = (Button)findViewById(R.id.do_while_loop);
        for_loop = (Button)findViewById(R.id.for_loop);
        enhanced_for_loop = (Button)findViewById(R.id.enhanced_for_loop);

        while_loop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                theWhileLoop();
            }
        });

        do_while_loop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                theDoWhileLoop();
            }
        });

        for_loop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                theForLoop();
            }
        });

        enhanced_for_loop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                theEnhancedForLoop();
            }
        });
    }

    public void theWhileLoop(){
        int i = 0;
        while (i < 10){
            Log.i("testing", "whileloop test: i = " + i);
            i++;
        }
    }

    public void theDoWhileLoop(){
        int i = 0;
        do {
            Log.i("testing", "Do/While Loop test: i = " + i);
            i++;
        } while (i < 10);
    }

    public void theForLoop (){
        for (int i = 0; i <10; i++){
            Log.i("testing", "For Loop Test: i = " + i);
        }
    }

    public void theEnhancedForLoop (){
        int[] integers = new int[]{
                0, 1, 2, 3, 4, 5, 6, 7, 8, 9
        };
        for (int i: integers){
            Log.i("testing", "Enhanced Loop Test: i = " + i);
        }
    }
}

package com.example.student.layout_events;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private int P1Score=0;
    private int P2Score=0;
    private Button button1;
    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = (Button)findViewById(R.id.button);
        button2 = (Button)findViewById(R.id.button2);
    }

    public void button1_func(View view) {
        button1.setText(++P1Score+"");
    }

    public void button2_func(View view) {
        button2.setText(++P2Score+"");
        button1.setText(++P1Score+"");
    }

    public void reset_func(View view) {
        P1Score=0;
        P2Score=0;
        button1.setText(0+"");
        button2.setText(0+"");
    }
}

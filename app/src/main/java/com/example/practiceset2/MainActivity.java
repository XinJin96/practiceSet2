package com.example.practiceset2;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    int totalScoresA=0;
    int totalScoresB=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // PASTE CODE YOU WANT TO TEST HERE

    }

    /**
     * Display methods that allow the text to appear on the screen. Don't worry if you don't know
     * how these work yet. We'll be covering them in lesson 3.
     */
    public void add3scores(View v)
    {
        totalScoresA+=3;
        display(totalScoresA);

    }
    public void add2scores(View v)
    {
        totalScoresA+=2;
        display(totalScoresA);
    }
    public void add1scores(View v)
    {
        totalScoresA+=1;
        display(totalScoresA);
    }
    public void add3scoresB(View v)
    {
        totalScoresB+=3;
        displayB(totalScoresB);

    }
    public void add2scoresB(View v)
    {
        totalScoresB+=2;
        displayB(totalScoresB);
    }
    public void add1scoresB(View v)
    {
        totalScoresB+=1;
        displayB(totalScoresB);
    }
    public void display(int text) {
        TextView t = (TextView) findViewById(R.id.score_screen);
        t.setText(text + "");
    }
    public void displayB(int text) {
        TextView t = (TextView) findViewById(R.id.score_screenB);
        t.setText(text + "");
    }
    public void reset(View v)
    {
        totalScoresA=0;
        totalScoresB=0;
        display(totalScoresA);
        displayB(totalScoresB);
    }
}
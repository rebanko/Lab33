package com.example.lab3;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(LinearLayout.VERTICAL);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams
                        (LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);

        layoutParams.gravity = Gravity.RIGHT;

        TextView textView1 = new TextView(this);
        textView1.setText("Hello Java!");
        textView1.setTextSize(30);
        linearLayout.addView(textView1, layoutParams);
        setContentView(linearLayout);

        layoutParams.gravity = Gravity.CENTER;

        TextView textView2 = new TextView(this);
        textView2.setText("Hello World!");
        textView2.setTextSize(30);
        linearLayout.addView(textView2, layoutParams);
        setContentView(linearLayout);

        layoutParams.gravity = Gravity.LEFT;

        TextView textView3 = new TextView(this);
        textView3.setText("Hello Android!");
        textView3.setTextSize(30);
        linearLayout.addView(textView3, layoutParams);
        setContentView(linearLayout);

        layoutParams.gravity = Gravity.CENTER;
        TextView textView4 = new TextView(this);
        textView4.setText("Hello Kotlin!");
        textView4.setTextSize(30);
        linearLayout.addView(textView4, layoutParams);
        setContentView(linearLayout);
    }
}

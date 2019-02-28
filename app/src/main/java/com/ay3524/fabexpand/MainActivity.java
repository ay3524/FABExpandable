package com.ay3524.fabexpand;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    FloatingActionButton floatingActionButton;
    TextView aBc, dEf, gHi, jKl, mNo;
    Animation fabOpen, fabClose, fabCW, fabACW;
    boolean isOpen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        floatingActionButton = findViewById(R.id.fab);
        floatingActionButton.setOnClickListener(this);

        aBc = findViewById(R.id.abc);
        dEf = findViewById(R.id.def);
        gHi = findViewById(R.id.ghi);
        jKl = findViewById(R.id.jkl);
        mNo = findViewById(R.id.mno);

        Context context = getApplicationContext();
        fabOpen = AnimationUtils.loadAnimation(context, R.anim.fab_open);
        fabClose = AnimationUtils.loadAnimation(context, R.anim.fab_close);
        fabCW = AnimationUtils.loadAnimation(context, R.anim.rotate_cw);
        fabACW = AnimationUtils.loadAnimation(context, R.anim.rotate_acw);


    }

    @Override
    public void onClick(View v) {
        if (isOpen) {
            aBc.setAnimation(fabClose);
            dEf.setAnimation(fabClose);
            gHi.setAnimation(fabClose);
            jKl.setAnimation(fabClose);
            mNo.setAnimation(fabClose);
            setInvisible(aBc, dEf, gHi, jKl, mNo);
            isOpen = false;
        } else {
            aBc.setAnimation(fabOpen);
            dEf.setAnimation(fabOpen);
            gHi.setAnimation(fabOpen);
            jKl.setAnimation(fabOpen);
            mNo.setAnimation(fabOpen);

            setVisible(aBc, dEf, gHi, jKl, mNo);

            isOpen = true;
        }
    }

    public void setInvisible(TextView... textView) {
        for (TextView aTextView : textView) {
            aTextView.setVisibility(View.INVISIBLE);
        }
    }

    public void setVisible(TextView... textView) {
        for (TextView aTextView : textView) {
            aTextView.setVisibility(View.VISIBLE);
        }
    }
}

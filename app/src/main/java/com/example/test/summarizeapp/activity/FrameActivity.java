package com.example.test.summarizeapp.activity;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.test.summarizeapp.R;

public class FrameActivity extends AppCompatActivity {

    private Button btnAttack;
    private ImageView ivIori;
    private AnimationDrawable animationDrawable;

    private boolean attackFlag = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame);
        initView();
    }

    private void initView() {
        ivIori = findViewById(R.id.iv_iori);
        btnAttack = findViewById(R.id.btn_iori_attack);
        btnAttack.setOnClickListener(attackClickListener);
    }

    View.OnClickListener attackClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if(!attackFlag){
                ivIori.setImageResource(R.drawable.iori_attack);
                animationDrawable = (AnimationDrawable) ivIori.getDrawable();
                animationDrawable.start();
                attackFlag = true;
            }else {
                ivIori.setImageResource(R.drawable.iori_attack);
                animationDrawable = (AnimationDrawable) ivIori.getDrawable();
                animationDrawable.stop();
                attackFlag = false;
            }
        }
    };
}

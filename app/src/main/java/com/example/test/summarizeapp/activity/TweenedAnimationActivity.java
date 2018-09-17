package com.example.test.summarizeapp.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

import com.example.test.summarizeapp.R;

public class TweenedAnimationActivity extends AppCompatActivity {

    private Button btnTranslate;
    private Button btnSet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_veiw_animation);
        initView();
    }

    private void initView() {
        btnTranslate = findViewById(R.id.btn_view_ani);
        btnTranslate.setOnClickListener(translateClickListener);
        btnSet = findViewById(R.id.btn_view_set_ani);
        btnSet.setOnClickListener(viewSetClickListener);
    }

    private View.OnClickListener translateClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Animation translateAnim = AnimationUtils.loadAnimation(TweenedAnimationActivity.this, R.anim.translate_animation);
            btnTranslate.startAnimation(translateAnim);
        }
    };

    private View.OnClickListener viewSetClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Animation setAnimation = AnimationUtils.loadAnimation(TweenedAnimationActivity.this, R.anim.view_set_animation);
            btnSet.startAnimation(setAnimation);
        }
    };

}

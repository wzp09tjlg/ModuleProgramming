package com.millet.mymoudletest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.millet.bottomapp.BottomMainActivity;
import com.millet.topapp.TopMainActivity;


public class MainActivity extends AppCompatActivity {

    private Button mTopButton, mBottomButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTopButton = (Button) findViewById(R.id.top_app_button);
        mBottomButton = (Button) findViewById(R.id.bottom_app_button);
        mTopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _view) {
                TopMainActivity.launch(MainActivity.this);
            }
        });

        mBottomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _view) {
                BottomMainActivity.launch(MainActivity.this);
            }
        });
    }
}

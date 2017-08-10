package com.millet.bottomapp;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class BottomMainActivity extends AppCompatActivity {

    public static void launch(Context _context) {
        Intent _intent = new Intent(_context, BottomMainActivity.class);
        _context.startActivity(_intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_main);
    }
}

package com.millet.topapp;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class TopMainActivity extends AppCompatActivity {

    public static void launch(Context _context) {
        Intent _intent = new Intent(_context, TopMainActivity.class);
        _context.startActivity(_intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_main);
    }
}

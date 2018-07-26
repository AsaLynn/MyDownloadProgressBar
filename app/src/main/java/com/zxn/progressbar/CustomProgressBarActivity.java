package com.zxn.progressbar;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class CustomProgressBarActivity extends AppCompatActivity {

    public static void jumpTo(Context context) {
        Intent intent = new Intent(context, CustomProgressBarActivity.class);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_progress_bar);
    }
}

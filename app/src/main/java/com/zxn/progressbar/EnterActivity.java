package com.zxn.progressbar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class EnterActivity extends AppCompatActivity implements View.OnClickListener {

    protected Button btn1;
    protected Button btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.activity_enter);
        initView();
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btn1) {
            MainActivity.jumpTo(this);
        } else if (view.getId() == R.id.btn2) {
            CustomProgressBarActivity.jumpTo(this);
        }
    }

    private void initView() {
        btn1 = (Button) findViewById(R.id.btn1);
        btn1.setOnClickListener(EnterActivity.this);
        btn2 = (Button) findViewById(R.id.btn2);
        btn2.setOnClickListener(EnterActivity.this);
    }
}

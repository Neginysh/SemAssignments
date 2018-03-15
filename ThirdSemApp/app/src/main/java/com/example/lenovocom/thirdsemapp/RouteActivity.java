package com.example.lenovocom.thirdsemapp;

import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class RouteActivity extends AppCompatActivity implements View.OnClickListener {
    TextView mText;
    Button mButton;
    EditText mEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_route);
        bindViews();

        Intent intent = getIntent();
        String msg = intent.getStringExtra("msg");
        Boolean gpsOn = intent.getBooleanExtra("isGpsOn", false);
        mText.setText(msg);

        mButton.setOnClickListener(this);


    }



    private void bindViews() {
        mText = (TextView) findViewById(R.id.des_text);
        mButton = (Button) findViewById(R.id.go_to_url);
        mEditText = (EditText) findViewById(R.id.url);

    }

    @Override
    public void onClick(View v) {
      /*  String fetchedURL = mEditText.getText().toString();
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(fetchedURL));
        startActivity(intent);*/
    }
}

package com.example.lenovocom.thirdsemapp;

import android.content.Context;
import android.content.Intent;
import android.preference.PreferenceManager;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText streetName;
    Button route;
    Button save;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bindViews();
        streetName.setOnClickListener(this);
        route.setOnClickListener(this);
        save.setOnClickListener(this);
        streetName.setText(getShared("street", ""));

    }

    private void bindViews() {
        streetName = (EditText) findViewById(R.id.street_name);
        route = (Button) findViewById(R.id.route);
        save = (Button) findViewById(R.id.save);
    }

    @Override
    public void onClick(View v) {
        String msg = streetName.getText().toString();

        if (v.getId() == R.id.save) {
            setShared("street", msg);
        } else if (v.getId() == R.id.street_name) {
            toast(this, "your destination: " + msg);
        } else if (v.getId() == R.id.route) {

            //turn on gps
            startActivityForResult(new Intent(Settings.ACTION_LOCATION_SOURCE_SETTINGS), 1);

            //    if(the user turned on gps){
            //    toast(this, "GPS turned on");}

            Intent destIntent = new Intent(this, RouteActivity.class);
            destIntent.putExtra("msg", msg);
            destIntent.putExtra("isGpsOn", true);
            startActivity(destIntent);

        }
    }

    private void setShared(String key, String value) {
        PreferenceManager.getDefaultSharedPreferences(this).edit()
                .putString(key, value).apply();
    }
    private String getShared(String key, String defValue) {
       return PreferenceManager.getDefaultSharedPreferences(this).getString(key, defValue);
    }

    private void toast(Context context, String msg) {
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == 1) {
            switch (requestCode) {
                case 1:
                    break;
            }
        }
    }
}

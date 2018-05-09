package com.example.usuario.redbullteam;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class TimeActivity extends AppCompatActivity {

    ImageView imgLogo;
    ListView lvTime;

    public void CarregaElementos(){

        imgLogo = (ImageView) findViewById(R.id.im_logo);
        lvTime = (ListView) findViewById(R.id.lv_time);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time);
        CarregaElementos();
    }
}

package com.mohit.vip;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.View;

import java.util.ArrayList;

public class responses extends AppCompatActivity {
    ArrayList<in> dt;
    RecyclerView rv;
    viewadapter adap;
    databasehelper dbv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_responses);

        dt = new ArrayList<in>();

        dbv = new databasehelper(this);
        dt = dbv.getAllFeedBack();
        adap = new viewadapter(dt,this);
        rv = (RecyclerView)findViewById(R.id.recycler);
        rv.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        rv.setAdapter(adap);
        adap.notifyDataSetChanged();
    }

}

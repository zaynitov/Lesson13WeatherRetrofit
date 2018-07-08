package com.example.admin.myapplicationjhk;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.admin.myapplicationjhk.helpers.MyResultReceiver;
import com.example.admin.myapplicationjhk.helpers.OnItemClickListener;
import com.example.admin.myapplicationjhk.helpers.RecyclerItemClickListener;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity implements MyResultReceiver.Receiver {
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private LinearLayoutManager mManager;
    private MyResultReceiver mReceiver;

    @Override
    public void onReceiveResult(int resultCode, Bundle resultData) {
        ArrayList<String> listForRecView = resultData.getStringArrayList("list");
        mRecyclerView = (RecyclerView) findViewById(R.id.recycleview);
        mManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        mRecyclerView.setLayoutManager(mManager);
        mAdapter = new CustomAdapter(listForRecView);
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.addOnItemTouchListener(
                new RecyclerItemClickListener(this, mRecyclerView, new OnItemClickListener() {
                    @Override
                    public void onItemClick(View view, int position) {
                        TextView viewById = (TextView) view.findViewById(R.id.textview);
                        Intent intent = new Intent(MainActivity.this, ActivityExtraWeather.class);
                        intent.putExtra("dayOfWeek", viewById.getText());
                        startActivity(intent); }

                    @Override
                    public void onLongItemClick(View view, int position) {
                    }
                })
        );


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mReceiver = new MyResultReceiver(new Handler());
        mReceiver.setReceiver(this);
    }

    public void onClickCreate(View view) {
        Intent intent = MyIntentService.getIntent(this);
        intent.putExtra("receiverTag", mReceiver);
        startService(intent);
    }
}

package com.agga.assignment2counter;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private  TextView mTextViewCout;
    private  int mCount;

    Button tambah;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        tambah = (Button) findViewById(R.id.btnTambah) ;
        mTextViewCout = (TextView) findViewById(R.id.txtNilai);

        mTextViewCout.setText("" + mCount);

        tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mCount++;
                mTextViewCout.setText("" + mCount);
                mTextViewCout.setText(String.valueOf((mCount)));
            }
        });

        if (savedInstanceState != null) {
            mCount = savedInstanceState.getInt("count");
            mTextViewCout.setText(String.valueOf(mCount));
        }

    }

    @Override
    protected void onSaveInstanceState(@Nullable Bundle outState) {
        super.onPostCreate(outState);

        outState.putInt("count", mCount);
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);


    }
}
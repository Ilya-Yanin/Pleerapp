package com.example.pleerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private MediaPlayer mediaPlayer;
    private Toast toast;

    private TextView textOut;
    private Switch switchLoop;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textOut = findViewById(R.id.textOut);
        switchLoop = findViewById(R.id.switchLoop);

        switchLoop.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if (mediaPlayer != null) {
                    mediaPlayer.setLooping(isChecked);
                }

            }
        });

    }

    @SuppressLint("NonConstantResourceId")
    public void onClickSource(View view) {
        switch (view.getId()) {
            case R.id.btnStream :
                toast = Toast.makeText(this, "Запущен поток аудио", Toast.LENGTH_SHORT);
                toast.show();



                break;
            case R.id.btnRAW :
                toast = Toast.makeText(this, "Запущен аудио-файл с памяти телефона", Toast.LENGTH_SHORT);
                toast.show();

                break;

        }
    }


    public void onClick(View view) {
    }
}
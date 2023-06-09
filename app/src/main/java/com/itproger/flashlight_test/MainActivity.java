package com.itproger.flashlight_test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button bFlash;
    private FlashClass flashClass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }
    private void init()
    {
        bFlash = findViewById(R.id.b1);
        flashClass = new FlashClass(this);

    }
    public void onClickFlash(View view) {
        if(flashClass.isFlash_status())
        {
            flashClass.flashOff();
            bFlash.setText("ON");
        }
        else
        {
            flashClass.flashOn();
            bFlash.setText("OFF");
        }
    }
}
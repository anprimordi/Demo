package com.example.ahmadnprimordi.demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

import com.rengwuxian.materialedittext.MaterialEditText;

public class MainActivity extends AppCompatActivity {

//    private Button widthDecrease, widthIncrease, heightDecrease, heightIncrease;
    private LinearLayout inputLayout;
    private EditText widthValue, heightValue;
    private MaterialEditText roomName;
    private Button calculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        widthDecrease = findViewById(R.id.btn_decreaseWidth);
//        widthIncrease = findViewById(R.id.btn_increaseWidth);
//        heightDecrease = findViewById(R.id.btn_decreaseHeight);
//        heightIncrease = findViewById(R.id.btn_increaseHeight);

        inputLayout = findViewById(R.id.layout_input);
        roomName = findViewById(R.id.edt_roomName);
        widthValue = findViewById(R.id.edt_valueWidth);
        heightValue = findViewById(R.id.edt_valueHeight);

    }
}

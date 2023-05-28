package com.example.hw6;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button =findViewById(R.id.btn_entrance);
        EditText email=findViewById(R.id.et_email);
        RelativeLayout relativeLayout=findViewById(R.id.rl_entrance);
        button.setOnClickListener(view -> {
            relativeLayout.setVisibility(View.GONE);
        });

        email.addTextChangedListener(new TextWatcher() {

            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                if(charSequence.length() > 0 ){
                    button.setBackgroundColor(getResources().getColor(R.color.orange));
                }else {
                    // Измените цвет кнопки на исходный цвет
                    button.setBackgroundColor(Color.GRAY);
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
    }
}
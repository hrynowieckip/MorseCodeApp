package com.hrynowieckip.morsecodeapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.hrynowieckip.morsecodeapp.core.Core;

public class MainActivity extends AppCompatActivity {
    boolean toMorseCodeBool = false;
    boolean toTextBool = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button translateButton = findViewById(R.id.translateButton);
        final EditText userIn = findViewById(R.id.userIn);
        final TextView resultText = findViewById(R.id.resultText);

        //hide navigation bar, status bar, fullscreen
        View decorView = getWindow().getDecorView();
        decorView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                | View.SYSTEM_UI_FLAG_FULLSCREEN
                | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);


        translateButton.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View v) {
                        String userInString = String.valueOf(userIn.getText());

                        if (toMorseCodeBool && !toTextBool) {
                            resultText.setText(Core.textToMorseCode(userInString));
                        } else if (!toMorseCodeBool && toTextBool) {
                            resultText.setText(Core.morseCodeToText(userInString));
                        }
                    }
                });

    }

    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.toTextButton:
                if (checked) {
                    toMorseCodeBool = false;
                    toTextBool = true;
                }
                break;
            case R.id.toMorseCodeButton:
                if (checked) {
                    toMorseCodeBool = true;
                    toTextBool = false;
                }
                break;
        }
    }
}
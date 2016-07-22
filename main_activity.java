package com.example.window10.calculatorwitharaaylist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements TopFragment.TopSectionListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void clearOrBackspace(boolean buttonClearPressed, boolean buttonbackspacePressed) {
        BottomFragment bottomFragment = (BottomFragment)getSupportFragmentManager().findFragmentById(R.id.fragment2);
        bottomFragment.clearTextClicked(buttonClearPressed,buttonbackspacePressed);
    }

    public void createClick(String showNumberText){
        BottomFragment bottomFragment = (BottomFragment)getSupportFragmentManager().findFragmentById(R.id.fragment2);
        bottomFragment.setClickedText(showNumberText);
    }
}

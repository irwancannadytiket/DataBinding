package com.example.irwancannady.databinding;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.irwancannady.databinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding mBinding;

    private int quantity = 0;
    private int mPrice = 30000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        getResult();
    }

    private void getResult(){
        mBinding.btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                quantity = quantity + 1;
                displayResult(quantity);
                total(quantity);
            }
        });

        mBinding.btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                quantity = quantity - 1;
                displayResult(quantity);
                total(quantity);
            }
        });
    }

    private void displayResult(int number){
        mBinding.tvResult.setText("" + number);
    }

    private void total(int total){
        mBinding.tvTotal.setText("" + quantity * mPrice);
    }

}

package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private int number = 1;
    private int price = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitOrder(View view) {
        display(number);
        displayPrice(number);
        number++;

    }

    private void display(int i) {
        TextView quantityTextView = findViewById(R.id.quantityTextViewID);
        quantityTextView.setText("" + i);
    }

    private void displayPrice(int number) {

        TextView priceTextView = findViewById(R.id.priceTextView);
        int price = number * 2;
        priceTextView.setText(getString(R.string.priceTag) + price);
    }
}

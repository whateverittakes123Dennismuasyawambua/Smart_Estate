package com.example.smartestate;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.widget.ImageView;

public class PaymentsActivity extends AppCompatActivity {
    private ImageView estateImageView, profileImageView;
    private CardView rentBalanceCard, serviceChargeBalanceCard, loanBalanceCard, rentPaymentCard, serviceChargePaymentCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payments);
    }
}
package com.example.exam_shop2022;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity  {
    ImageView img_product_main;
    EditText edit_count;
    TextView txt_price, txt_delivery, txt_pay;
    CheckBox chk_agree;

    int val_price;                  // 제품의 총 가격(배송비 미포함)
    int val_delivery;               // 배송비 ( 제품 총 가격이 10000원 이상이면 0원, 미만이면 2500원)
    int val_pay;                    // 총 결제 금액
    int selected_product=2000;      // 선택한 제품 한개의 가격
    int selected_count;             // 선택한 수량

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RadioButton radio1 = findViewById(R.id.radio1);
        RadioButton radio2 = findViewById(R.id.radio2);
        RadioButton radio3 = findViewById(R.id.radio3);
        RadioButton radio4 = findViewById(R.id.radio4);

        Button btn_minus = findViewById(R.id.btn_minus);
        EditText edit_count = findViewById(R.id.edit_count);
        Button btn_plus = findViewById(R.id.btn_plus);

        TextView txt_price = findViewById(R.id.txt_price);
        TextView txt_delivery = findViewById(R.id.txt_delivery);
        TextView txt_pay = findViewById(R.id.txt_pay);

        CheckBox chk_agree = findViewById(R.id.chk_agree);
        Button btn_pay = findViewById(R.id.btn_pay);
    }
}

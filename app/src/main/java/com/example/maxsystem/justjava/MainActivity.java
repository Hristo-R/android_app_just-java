package com.example.maxsystem.justjava;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.btn_order) Button btnOrder;
    @BindView(R.id.edt_username) EditText edtUsername;
    @BindView(R.id.chbx_cream) CheckBox chbxCream;
    @BindView(R.id.chbx_sugar) CheckBox chbxSugar;
    @BindView(R.id.txt_coffee_count) TextView txtCoffeeCount;
    private String username;
    private boolean hasCreamTopping = false;
    private boolean hasExtraSugarTopping = false;
    private int coffeeCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btn_less)
    public void onLessClicked(){
        this.coffeeCount = Integer.parseInt(txtCoffeeCount.getText().toString());
        if (coffeeCount > 0) {
            coffeeCount--;
        }
        txtCoffeeCount.setText(String.valueOf(coffeeCount));
    }

    @OnClick(R.id.btn_more)
    public void onMoreClicked(){
        this.coffeeCount = Integer.parseInt(txtCoffeeCount.getText().toString());
        coffeeCount++;
        txtCoffeeCount.setText(String.valueOf(coffeeCount));
    }

    @OnClick(R.id.btn_order)
    public void onOrderClicked() {
        //Toast.makeText(MainActivity.this, "Neshto", Toast.LENGTH_SHORT).show();
        this.username = edtUsername.getText().toString();
        this.hasCreamTopping = chbxCream.isChecked();
        this.hasExtraSugarTopping = chbxSugar.isChecked();
        this.coffeeCount = Integer.parseInt(txtCoffeeCount.getText().toString());

        String orderText = "Hello from " + username + "\nPleace get me " + coffeeCount + " caffees";
        if (hasCreamTopping) {
            orderText += "\nAlso add cream";
        }
        if (hasExtraSugarTopping) {
            orderText += "\nAlso add extra sugar";
        }

        orderText += "\nThank You";

        Toast.makeText(MainActivity.this, orderText, Toast.LENGTH_LONG).show();

        //Intent emailIntent = new Intent(Intent.ACTION_SENDTO);
        //emailIntent.setType("/*/");
        //emailIntent.putExtra(Intent.EXTRA_EMAIL, "coffee@gmail.com");
        //emailIntent.putExtra(Intent.EXTRA_TEXT, orderText);
        //startActivity(emailIntent);

    }

}

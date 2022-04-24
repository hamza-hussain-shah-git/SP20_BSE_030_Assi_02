package com.example.sp20_bse_030_assi2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editText;

    Button btnOne;
    Button btnTwo;
    Button btnThree;
    Button btnFour;
    Button btnFive;
    Button btnSix;
    Button btnSeven;
    Button btnEight;
    Button btnNine;
    Button btnZero;
    Button btnBack;
    Button btnOpen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnOne = findViewById(R.id.btnOne);
        btnTwo= findViewById(R.id.btnTwo);
        btnThree= findViewById(R.id.btnThree);
        btnFour= findViewById(R.id.btnFour);
        btnFive= findViewById(R.id.btnFive);
        btnSix= findViewById(R.id.btnSix);
        btnSeven= findViewById(R.id.btnSeven);
        btnEight= findViewById(R.id.btnEight);
        btnNine= findViewById(R.id.btnNine);
        btnZero= findViewById(R.id.btnZero);
        btnOpen= findViewById(R.id.btnOpen);
        btnBack= findViewById(R.id.btnBack);
        editText=findViewById(R.id.editText);


    }

    public void one(View v){
    btnClick(btnOne,"1",editText);
    } public void two(View v){
        btnClick(btnTwo,"2",editText);
    } public void three(View v){
        btnClick(btnThree,"3",editText);
    } public void four(View v){
        btnClick(btnFour,"4",editText);
    } public void five(View v){
        btnClick(btnFive,"5",editText);
    } public void six(View v){
        btnClick(btnSix,"6",editText);
    } public void seven(View v){
        btnClick(btnSeven,"7",editText);
    } public void eight(View v){
        btnClick(btnEight,"8",editText);
    } public void nine(View v){
        btnClick(btnNine,"9",editText);
    } public void zero(View v){
        btnClick(btnZero,"0",editText);
    }
    public void back(View v){
    editText.setText("");
    } public void open(View v){
        String txt = editText.getText().toString();
        String number = "1234";
        if(txt.equals(number)){
            Intent intent = new Intent(MainActivity.this,Profile.class);
            startActivity(intent);
        }else{
            Toast.makeText(this, "Wrong key", Toast.LENGTH_SHORT).show();
        }


    }
    public void btnClick(Button btn, String num, EditText text){
        String txt =text.getText().toString();
        String number = num;
        text.setText(txt+number);

    }
}
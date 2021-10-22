package com.example.mycalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import javax.xml.transform.Result;

public class calculActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnAdd,btnClear,btnSub,btnMlt,btnDiv;
    EditText editTextNUm1, editTextNUm2, editTextREsult;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calcul);
        initial();

    }
    private  void initial(){
        btnAdd= findViewById(R.id.buttonAdd);
        btnClear= findViewById(R.id.buttonClear);
        btnAdd.setOnClickListener(this);
        btnClear.setOnClickListener(this);
        btnSub= findViewById(R.id.buttonSub);
        btnSub.setOnClickListener(this);
        btnMlt= findViewById(R.id.buttonMulty);
        btnMlt.setOnClickListener(this);
        btnDiv= findViewById(R.id.buttonDivid);
        btnDiv.setOnClickListener(this);

        editTextNUm1 = findViewById(R.id.editTextNum1);
        editTextNUm2 = findViewById(R.id.editTextNum2);
        editTextREsult = findViewById(R.id.editTextResult);


    }
    public void onClick(View view){
        switch (view.getId()){
            case R.id.buttonAdd:
            {
                int number1=Integer.parseInt(editTextNUm1.getText().toString()) ;
                int number2=Integer.parseInt(editTextNUm2.getText().toString());
                int sum = number1+number2;
                editTextREsult.setText(String.valueOf(sum));

               // Toast.makeText(this,String.valueOf(sum) ,Toast.LENGTH_LONG).show();
                break;
            }
            case R.id.buttonSub:
            {
                int number1=Integer.parseInt(editTextNUm1.getText().toString()) ;
                int number2=Integer.parseInt(editTextNUm2.getText().toString());
                int sum1 = number1-number2;
                editTextREsult.setText(String.valueOf(sum1));


                break;
            }
            case R.id.buttonMulty:
            {
                int number1=Integer.parseInt(editTextNUm1.getText().toString()) ;
                int number2=Integer.parseInt(editTextNUm2.getText().toString());
                int sum2 = number1*number2;
                editTextREsult.setText(String.valueOf(sum2));


                break;
            }
            case R.id.buttonDivid:
            {
                int number1=Integer.parseInt(editTextNUm1.getText().toString()) ;
                int number2=Integer.parseInt(editTextNUm2.getText().toString());
                int sum3 = number1/number2;
                editTextREsult.setText(String.valueOf(sum3));


                break;
            }

            case R.id.buttonClear:{
                finish();
                break;
            }
        }




    }
}

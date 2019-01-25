package com.concordia.cejv669;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Button b1 = (Button) findViewById(R.id.btn_showMessage);

        Button b2 = (Button) findViewById(R.id.btn_add);


        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText num1 = findViewById(R.id.number1);
                EditText num2 = findViewById(R.id.number2);
                Integer n1 = Integer.valueOf(num1.getText().toString());
                Integer n2 = Integer.valueOf(num2.getText().toString());

                TextView tv2 = findViewById(R.id.result);
                tv2.setText(String.valueOf(n1 + n2));

            }
        });

//        final TextView tv1 = findViewById(R.id.lbl_result);

//        b1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                EditText t1 = findViewById(R.id.edit_name);
//                Toast.makeText(getApplicationContext(), "Hello" + tv1.getText().toString(), Toast.LENGTH_LONG).show();
//            }
//        });

    }

//    public void btn1_pressed(View v){
//        EditText t1 = findViewById(R.id.edit_name);
//        TextView tv1 = findViewById(R.id.lbl_result);
//
//        tv1.setText("Hello" + tv1.getText().toString());
//
//
//
//    }


}

package com.example.biggestamongtwo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.FileReader;

public class MainActivity extends AppCompatActivity {

    Button CK,CL;
    EditText F1,F2;
    TextView RE;
    Float Fir,Sec;
    String S;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CK = (Button)findViewById(R.id.CHK);
        CL = (Button)findViewById(R.id.CLR);
        F1 = (EditText) findViewById(R.id.N1);
        F2 = (EditText) findViewById(R.id.N2);
        RE = (TextView)findViewById(R.id.RES);

        CK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (F1.getText().length() == 0) {
                    if (F2.getText().length() == 0) {
                        Toast toast = Toast.makeText(getApplicationContext(), "Enter the Values in the input boxes and press CHECK Button", Toast.LENGTH_LONG);
                        toast.show();
                    }
                }
                else {
                    Fir = Float.parseFloat(F1.getText().toString());
                    Sec = Float.parseFloat(F2.getText().toString());
                    if (Fir > Sec){
                        S = Float.toString(Fir);
                        RE.setText(S);
                    } else
                        {
                            S = Float.toString(Sec);
                            RE.setText(S);
                        }
                }
            }
        });

        CL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (F1.getText().length() == 0) {
                    if (F2.getText().length() == 0) {
                        Toast toast = Toast.makeText(getApplicationContext(), "Perform the Logical Operations by entering the Values in the input boxes and then press CLEAR Button", Toast.LENGTH_LONG);
                        toast.show();
                    }
                }
                else {
                    F1.setText("");
                    F2.setText("");
                    RE.setText("");
                }

            }
        });
    }
}
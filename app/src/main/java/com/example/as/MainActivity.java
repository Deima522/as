//https://www.clcoding.com/2021/02/calculator-in-android-studio-with.html
package com.example.as;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button b1;
    private Button b2;
    private Button b3;
    private Button b4;
    private Button b5;
    private Button b6;
    private Button b7;
    private Button b8;
    private Button b9;
    private Button b0;
    private Button b_equal;
    private Button b_multi;
    private Button b_div;
    private Button b_add;
    private Button b_sub;
    private Button b_clear;
    private Button b_dot;
    private Button b_sqrt;
    private Button b_M;
    private Button b_MS;
    private Button b_mod;
    private Button b_M2;
    private Button b_MC;
    private Button b_1x;
    private Button b_CE;
    private Button b_plus_min;
    private Button b_MR;
    private Button b_b;
    private final char ADDITION = '+';
    private final char SUBTRACTION = '-';
    private final char MULTIPLICATION = '*';
    private final char DIVISION = '/';
    private final char EQU = '=';
    private TextView input;
    private TextView output;
    private char ACTION;
    private double val1 = Double.NaN;
    private double val2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewSetup();
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ifErrorOnOutput();
                exceedLength();
                input.setText(input.getText().toString() + "1");
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ifErrorOnOutput();
                exceedLength();
                input.setText(input.getText().toString() + "2");
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ifErrorOnOutput();
                exceedLength();
                input.setText(input.getText().toString() + "3");
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ifErrorOnOutput();
                exceedLength();
                input.setText(input.getText().toString() + "4");
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ifErrorOnOutput();
                exceedLength();
                input.setText(input.getText().toString() + "5");
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ifErrorOnOutput();
                exceedLength();
                input.setText(input.getText().toString() + "6");
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ifErrorOnOutput();
                exceedLength();
                input.setText(input.getText().toString() + "7");
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ifErrorOnOutput();
                exceedLength();
                input.setText(input.getText().toString() + "8");
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ifErrorOnOutput();
                exceedLength();
                input.setText(input.getText().toString() + "9");
            }
        });

        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ifErrorOnOutput();
                exceedLength();
                input.setText(input.getText().toString() + "0");
            }
        });
        b_dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                exceedLength();
                input.setText(input.getText().toString() + ".");
            }
        });
        b_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (input.getText().length() > 0) {
                    ACTION = ADDITION;
                    operation();
                    if (!ifReallyDecimal()) {
                        output.setText(val1 + "+");
                    } else {
                        output.setText((int) val1 + "+");
                    }
                    input.setText(null);
                } else {
                    output.setText("Error");
                }
            }
        });
        b_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (input.getText().length() > 0) {
                    ACTION = SUBTRACTION;
                    operation();
                    if (input.getText().length() > 0)
                        if (!ifReallyDecimal()) {
                            output.setText(val1 + "-");
                        } else {
                            output.setText((int) val1 + "-");
                        }
                    input.setText(null);
                } else {
                    output.setText("Error");
                }
            }
        });
        b_multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (input.getText().length() > 0) {
                    ACTION = MULTIPLICATION;
                    operation();
                    if (!ifReallyDecimal()) {
                        output.setText(val1 + "×");
                    } else {
                        output.setText((int) val1 + "×");
                    }
                    input.setText(null);
                } else {
                    output.setText("Error");
                }
            }
        });
        b_divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (input.getText().length() > 0) {
                    ACTION = DIVISION;
                    operation();
                    if (ifReallyDecimal()) {
                        output.setText((int) val1 + "/");
                    } else {
                        output.setText(val1 + "/");
                    }
                    input.setText(null);
                } else {
                    output.setText("Error");
                }
            }
        });

    }
}
package com.example.pdm_labo2_00038617_ejercicio3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    private LinearLayout panel1, panel2,panel3;
    private int cont_red = 0, cont_green = 0, cont_blue = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        panel1 = findViewById(R.id.panel_1);
        panel2 = findViewById(R.id.panel_2);
        panel3 = findViewById(R.id.panel_3);

        panel1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cont_red <6){
                    switch (cont_red){
                        case 0:
                            panel1.setBackgroundColor(getResources().getColor(R.color.color_red_first));
                            break;
                        case 1:
                            panel1.setBackgroundColor(getResources().getColor(R.color.color_red_second));
                            break;
                        case 2:
                            panel1.setBackgroundColor(getResources().getColor(R.color.color_red_third));
                            break;
                        case 3:
                            panel1.setBackgroundColor(getResources().getColor(R.color.color_red_fourth));
                            break;
                        case 4:
                            panel1.setBackgroundColor(getResources().getColor(R.color.color_red_fifth));
                            break;
                        case 5:
                            panel1.setBackgroundColor(getResources().getColor(R.color.color_red_sixth));
                            break;
                    }
                }
                else{
                    cont_red =0;
                }
                cont_red++;
            }
        });
        panel2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cont_green <6){
                    switch (cont_green){
                        case 0:
                            panel2.setBackgroundColor(getResources().getColor(R.color.color_green_first));
                            break;
                        case 1:
                            panel2.setBackgroundColor(getResources().getColor(R.color.color_green_second));
                            break;
                        case 2:
                            panel2.setBackgroundColor(getResources().getColor(R.color.color_green_third));
                            break;
                        case 3:
                            panel2.setBackgroundColor(getResources().getColor(R.color.color_green_fourth));
                            break;
                        case 4:
                            panel2.setBackgroundColor(getResources().getColor(R.color.color_green_fifth));
                            break;
                        case 5:
                            panel2.setBackgroundColor(getResources().getColor(R.color.color_green_sixth));
                            break;
                    }
                }
                else{
                    cont_green =0;
                }
                cont_green++;
            }
        });
        panel3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cont_blue <6){
                    switch (cont_blue){
                        case 0:
                            panel3.setBackgroundColor(getResources().getColor(R.color.color_blue_first));
                            break;
                        case 1:
                            panel3.setBackgroundColor(getResources().getColor(R.color.color_blue_second));
                            break;
                        case 2:
                            panel3.setBackgroundColor(getResources().getColor(R.color.color_blue_third));
                            break;
                        case 3:
                            panel3.setBackgroundColor(getResources().getColor(R.color.color_blue_fourth));
                            break;
                        case 4:
                            panel3.setBackgroundColor(getResources().getColor(R.color.color_blue_fifth));
                            break;
                        case 5:
                            panel3.setBackgroundColor(getResources().getColor(R.color.color_blue_sixth));
                            break;
                    }
                }
                else{
                    cont_blue =0;
                }
                cont_blue++;
            }
        });
    }
}

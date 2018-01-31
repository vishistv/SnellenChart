package com.example.vishistvarugeese.snellenchart;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView txtOne, txtTwo, txtThree, txtFour, txtFive;

    private String[] letters = new String[11];

    int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        txtOne = (TextView) findViewById(R.id.txtOne);
        txtTwo = (TextView) findViewById(R.id.txtTwo);
        txtThree = (TextView) findViewById(R.id.txtThree);
        txtFour = (TextView) findViewById(R.id.txtFour);
        txtFive = (TextView) findViewById(R.id.txtFive);

        //btnAuto = (Button) findViewById(R.id.btnAuto);
        //btnPause = (Button) findViewById(R.id.btnPause);

        letters[0] = "E";
        letters[1] = "F P";
        letters[2] = "T O Z";
        letters[3] = "L P E D";
        letters[4] = "P E C F D";
        letters[5] = "E D F C Z F";
        letters[6] = "F E L O P Z D";
        letters[7] = "D E F P O T E C";
        letters[8] = "L E F O D P C T";
        letters[9] = "F D P L T C E O";
        letters[10] = "P E Z O L C F T D";


    }

    public void onSizePlus(View view) {
        i++;
        if (i > 10)
            i = i - 11;
        display(i);
    }


    public void onSizeMinus(View view) {

        i--;
        if(i < 0)
            i = i + 11;
        display(i);
    }

    void display(int i){

        switch(i){
            case 0:
                setFontStatic(9,10,0,1,2);
                assignText(letters[9], letters[10], letters[0], letters[1], letters[2]);
                break;
            case 1:
                setFontStatic(10,0,1,2,3);
                assignText(letters[10], letters[0], letters[1], letters[2], letters[3]);
                break;
            case 9:
                setFontStatic(7,8,9,10,0);
                assignText(letters[7], letters[8], letters[9], letters[10], letters[0]);
                break;
            case 10:
                setFontStatic(8,9,10,0,1);
                assignText(letters[8], letters[9], letters[10], letters[0], letters[1]);
                break;
            default:
                setFontStatic(i-2,i-1,i,i+1,i+2);
                assignText(letters[i-2], letters[i-1], letters[i], letters[i+1], letters[i+2]);
                break;
        }

    }

    void assignText(String txt1, String txt2, String txt3, String txt4, String txt5){
        txtOne.setText(txt1);
        txtTwo.setText(txt2);
        txtThree.setText(txt3);
        txtFour.setText(txt4);
        txtFive.setText(txt5);
    }


    void setFontStatic(int f1, int f2, int f3, int f4, int f5){
        txtOne.setTextSize(30 - (f1*2));
        txtTwo.setTextSize(30 - (f2*2));
        txtThree.setTextSize(30 - (f3*2));
        txtFour.setTextSize(30 - (f4*2));
        txtFive.setTextSize(30 - (f5*2));
    }

}


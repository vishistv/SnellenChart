package com.example.vishistvarugeese.snellenchart;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView txtOne, txtTwo, txtThree, txtFour, txtFive;

    private String[] letters = new String[11];

    private Button btnAuto, btnPause;

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

        btnAuto = (Button) findViewById(R.id.btnAuto);
        btnPause = (Button) findViewById(R.id.btnPause);

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

        btnAuto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    if(i < 9) {
                        txtThree.setText(letters[i]);
                        txtFour.setText(letters[i + 1]);
                        txtFive.setText(letters[i + 2]);

                        if (i >= 1)
                            txtTwo.setText(letters[i - 1]);
                        if (i >= 2)
                            txtOne.setText(letters[i - 2]);
                    } else if(i == 9) {
                        txtThree.setText(letters[i]);
                        txtFour.setText(letters[i + 1]);
                        txtFive.setText(letters[i - 9]);

                        if (i >= 1)
                            txtTwo.setText(letters[i - 1]);
                        if (i >= 2)
                            txtOne.setText(letters[i - 2]);
                    } else if(i == 10) {
                        txtThree.setText(letters[i]);
                        txtFour.setText(letters[i - 10]);
                        txtFive.setText(letters[i - 9]);

                        if (i >= 1)
                            txtTwo.setText(letters[i - 1]);
                        if (i >= 2)
                            txtOne.setText(letters[i - 2]);

                    }
                    i++;

            }
        });



    }
}

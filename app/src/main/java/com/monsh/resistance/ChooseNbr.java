package com.monsh.resistance;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;


public class ChooseNbr extends AppCompatActivity {

    private int nbRes;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_nbr);

        editText = (EditText) findViewById(R.id.enter_number);
        editText.setOnKeyListener(new View.OnKeyListener() {

            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                if (keyCode == event.KEYCODE_ENTER) {
                    try {
                        setNbRes(Integer.parseInt(editText.getText().toString().intern()));
                        validationNbRes(v);
                    } catch (NumberFormatException nfe) {
                        System.out.println("Could not parse " + nfe + " in integer");
                    }
                }
                return false;
            }
        });

    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        editText = (EditText) findViewById(R.id.enter_number);
        if (editText != null) {
            setNbRes(Integer.parseInt(editText.getText().toString().intern()));
            outState.putInt("myRingsNbr", getNbRes());
        }
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        editText = (EditText) findViewById(R.id.enter_number);
        editText.setText(String.valueOf(savedInstanceState.getInt("myRingsNbr")));
    }

    /**
     * Calling Home
     */
    public void callHome(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        this.startActivity(intent);
    }

    /**
     * validation of the number of resistances
     */
    public void validationNbRes(View v) {
        Intent intent = new Intent(getApplicationContext(), ListOfResistances.class);
        intent.putExtra("remainingLoops", Integer.parseInt(editText.getText().toString().intern())); //passage en boucle de l'activité getNbRes() fois
        startActivity(intent);
    }

    public int getNbRes() {
        return nbRes;
    }

    public void setNbRes(int nbRes) {
        this.nbRes = nbRes;
    }
}

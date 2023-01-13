package com.example.myapplication;

import android.os.Bundle;
import android.os.PersistableBundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.zip.DataFormatException;

public class LoginActivity extends AppCompatActivity {


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);


        try {
            genExcepcion(25);
        } catch (DataFormatException e) {
            e.printStackTrace();
        }

    }

    public void genExcepcion(int numero) throws DataFormatException {

        if (numero > 0 && numero < 19) {
            System.out.println("todo");
        } else {
            throw new DataFormatException();
        }
    }

}

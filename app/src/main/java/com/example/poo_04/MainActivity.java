package com.example.poo_04;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Objeto es la instanciación de una clase
        //Objeto es un elemento que nos permite usar la clase
        Circulo circuloVerde= new Circulo("verde",5);

        System.out.println(circuloVerde.color);
        System.out.println(circuloVerde.radio);
        System.out.println("Area:"+circuloVerde.area());
        System.out.println("Perimetro:"+circuloVerde.perimetro());
        circuloVerde.pintar();

        //Siempre que este la palabra new es indicio que se crea un objeto
        Circulo circuloAzul= new Circulo("azul",2);
        Circulo circuloRojo= new Circulo("rojo",1000);


    }
}
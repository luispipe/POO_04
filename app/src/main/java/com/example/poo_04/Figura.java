package com.example.poo_04;

public abstract class Figura {
    //Si una clase es Abstacta quiere decir que es una Super Clase
    //Una clase abstracta no puede ser instanciada
    //Una clase permite tener metodos abstractos

    String color;

    public Figura(String color) {
        this.color = color;
    }

    //Un metodo abstracto es aquel que no tiene logoca o cuerpo
    //Esta lógica la define la clase que herede

    public abstract double perimetro();

    public abstract double area();

    public abstract void pintar();

    public void saludardesdeFigura(){
        System.out.println("Hola desde la clase Figura");
    }


}

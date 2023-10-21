package com.example.poo_04;

public class Cuadrado extends Figura{
    //Atributos
   double lado;

    //Metodo constructor


    public Cuadrado(String color, double lado) {
        super(color);
        this.lado = lado;
    }

    //Metodos

    @Override
    public double area(){
        return this.lado*this.lado;
    }
    @Override
    public double perimetro(){
        return this.lado*4;
    }
    @Override
    public void pintar(){
        System.out.println("El cuadrado se pinto de color:"+this.color);
    }

}

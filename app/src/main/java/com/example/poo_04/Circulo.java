package com.example.poo_04;

public class Circulo extends Figura{
    //Una clase hereda otra usando la palabra reservada extends
    //Cuando heredo de una clase abstracta esta nos obliga a implementar
    //todos su metodos abstractos

    //Atributos
    double radio;

    //Metodo constructor --> el constructor del objeto

    public Circulo(String color, double radio) {
        //super es la palabra reservada que llama al contructor del padre
        super(color);
        this.radio = radio;
    }

    //Polimorfismo por sobreescritura
    //Polimorfismo--> una misma función tiene diferentes comportamientos
    @Override
    public double perimetro() {
        return 2*Math.PI*this.radio;
    }

    @Override
    public double area() {
        return Math.PI*(this.radio*this.radio);
    }

    @Override
    public void pintar() {
        System.out.println("Se pinto el circulo de color: "+this.color);
    }








}

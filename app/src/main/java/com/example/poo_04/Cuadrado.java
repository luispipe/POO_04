package com.example.poo_04;

public class Cuadrado {
    //Atributos
    String color;
    double lado;

    //Metodo constructor

    public Cuadrado(String color, double lado) {
        this.color = color;
        this.lado = lado;
    }

    public double area(){
        return this.lado*this.lado;
    }

    public double perimetro(){
        return this.lado*4;
    }

    public void pintar(){
        System.out.println("Se pinto el cuadrado de color:"+this.color);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }


}

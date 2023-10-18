package com.example.poo_04;

public class Circulo {
    //Atributos
    String color;
    double radio;

    //Metodo constructor --> el constructor del objeto

    public Circulo(String color, double radio){
    //Palabra reservada this hace referencia al objeto que se creara
        this.color=color;
        this.radio=radio;
    }

    //Metodos
    public double perimetro(){
        return 2*Math.PI*this.radio;
    }

    public double area(){
        return Math.PI*(this.radio*this.radio);
    }

    public void pintar(){
        System.out.println("El circulo se pinto de color:"+this.color);
    }




}

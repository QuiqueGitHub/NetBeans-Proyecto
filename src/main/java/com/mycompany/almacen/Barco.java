/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.almacen;
import java.util.Scanner;

/**
 *
 * @author kike0
 */
public class Barco extends Transporte {
    private int contenedores;
    
    private Scanner barco;
    
    public Barco(){
        super();
        this.tipo = "Barco";
        barco = new Scanner(System.in);
        System.out.println("Cuantos contenedores transporta: ");
        this.contenedores = barco.nextInt();
         // Calcula el precio basado en los remolques y casetas
        calcularPrecio();
    }
    
     public Barco(String tipo, double carga, long precio, String empresa, String matricula, int contenedores){
        super("Barco", carga, precio, empresa, matricula);
        this.contenedores = contenedores;
       // Calcula el precio basado en los remolques y casetas
        calcularPrecio();
    }
    
    private void calcularPrecio() {
        // Calcula el precio adicional basado en los remolques y casetas
        this.setPrecio(this.getPrecio() + this.contenedores * 450);
    }
     
    @Override
    public void mostrarVehiculo(){
        System.out.println("----------------------------------------------------");
        System.out.println("Tipo de vehiculo: " + this.getTipo());
        System.out.println("Empresa: " + this.getEmpresa());
        System.out.println("Matricula: " + this.getMatricula());
        System.out.println("Carga que soporta: " + this.getCarga() + "kg");
        System.out.println("Costo por servicio: $" + this.getPrecio());
        System.out.println("Cantidad de contenedores: " + this.contenedores);
        System.out.println("----------------------------------------------------");
    }
     
     @Override
    public String toString() {
        return super.toString() + "\n" + 
               "  Cantidad de contenedores: " + contenedores + "\n" + 
               "----------------------------------------------------";
    }
}

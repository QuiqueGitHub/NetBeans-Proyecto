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
public abstract class Transporte{
    protected double carga;
    protected String empresa;
    protected String matricula;
    protected String tipo;
    protected double precio;
    protected Scanner transporte;
     
    public Transporte(){
        transporte = new Scanner(System.in);
        System.out.println("Ingrese la carga que soporta (en kg): ");
        this.carga = transporte.nextDouble();
        transporte.nextLine();
        System.out.println("A que empresa pertenece el transporte: ");
        this.empresa = transporte.nextLine();
        System.out.println("Matricula: ");
        this.matricula = transporte.nextLine();
        System.out.println("Costo por sevicio: ");
        this.precio = transporte.nextDouble();
    }
    
    public Transporte(String tipo, double carga, double precio, String empresa, String matricula){
        this.tipo = tipo;
        this.carga = carga;
        this.precio = precio;
        this.empresa = empresa;
        this.matricula = matricula;
        
    }
    
    public abstract void mostrarVehiculo();
    
    // Método sobrescrito toString
    @Override
    public String toString() {
        return "---------------------------------------------------------------" + "\n" +
               "  Tipo de vehiculo: " + tipo + "\n" + 
               "  Empresa duena del vehiculo: " + empresa + "\n" + 
               "  Matricula del vehiculo: " + matricula + "\n" +
               "  Carga que soporta: " + carga + "kg" + "\n" + 
               "  Precio por uso del vehiculo: $" + precio;
    }
    
    
}

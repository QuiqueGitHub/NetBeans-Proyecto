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
public class Camion extends Transporte {
    private int remolques;
    private int casetas;
    private Scanner camion;
    
    public Camion(){
        super();
        this.tipo = "Camion";
        camion = new Scanner(System.in);
        System.out.println("Con cuantos remolques cuenta: ");
        this.remolques = camion.nextInt();
        
        this.casetas = this.remolques * 150;
        
        calcularPrecio();
    }
    
    public Camion(String tipo, double carga, double precio, String empresa, String matricula, int remolques, int casetas){
        super("Camion", carga, precio, empresa, matricula);
        this.remolques = remolques;
        this.casetas = this.remolques * 150;
        // Calcula el precio basado en los remolques y casetas
        calcularPrecio();
    }
    
    private void calcularPrecio() {
        // Calcula el precio adicional basado en los remolques y casetas
        this.precio += this.casetas;
    }
    
    @Override
    public void mostrarVehiculo(){
        System.out.println("----------------------------------------------------");
        System.out.println("Tipo de vehiculo: " + this.tipo);
        System.out.println("Empresa: " + this.empresa);
        System.out.println("Matricula: " + this.matricula);
        System.out.println("Carga que soporta: " + this.carga + "kg");
        System.out.println("Costo por servicio: $" + this.precio);
        System.out.println("Cantidad de remolques: " + this.remolques);
        System.out.println("Precio por caseta: " + this.casetas);
        System.out.println("----------------------------------------------------");
    }
    
    @Override
    public String toString() {
        return super.toString() + "\n" + 
               "  Cantidad de remolques: " + remolques + "\n" + 
               "  Precio por caseta: " + casetas + "\n" +
               "----------------------------------------------------";
    }
}
    



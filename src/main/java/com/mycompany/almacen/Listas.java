/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.almacen;
import java.util.LinkedList;

/**
 *
 * @author kike0
 */
public class Listas {
    
    private static final LinkedList<Object> Vehiculos = new LinkedList<>();

    public static LinkedList<Object> getVehiculos() {
        return Vehiculos;
    }
    
    private static final LinkedList<Object> Inventario = new LinkedList<>();

    public static LinkedList<Object> getInventario() {
        return Inventario;
    }
    
}

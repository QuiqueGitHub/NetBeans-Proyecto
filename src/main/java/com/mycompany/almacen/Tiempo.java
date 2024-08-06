/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.almacen;
import java.util.Calendar;

/**
 *
 * @author kike0
 */

public class Tiempo {
    private int horab;
    private int min;
    private int seg;
    private int dia;
    private int mes;
    private int anio;
    int hashCode = NombresCuentas.hashCode;
    private String horaC;
    private String fechaC;
    private String clave;
    private long folio;
    Calendar Hora = Calendar.getInstance();
    Calendar Fecha = Calendar.getInstance();

    
    public Tiempo(int horab, int min, int seg){
        this.horab = horab;
        this.min= min;
        this.seg = seg;
    }
    
     public Tiempo(){
        horab = Hora.get(Calendar.HOUR_OF_DAY);
        min = Hora.get(Calendar.MINUTE);
        seg = Hora.get(Calendar.SECOND);
        dia = Fecha.get(Calendar.DATE);
        mes = Fecha.get(Calendar.MONTH) + 1;
        anio = Fecha.get(Calendar.YEAR);
        horaC = String.valueOf(horab) + ":" + String.valueOf(min) + ":" + String.valueOf(seg); 
        fechaC = String.valueOf(dia) + "/" + String.valueOf(mes) + "/" + String.valueOf(anio); 
        clave = String.valueOf(horab) + String.valueOf(min) + String.valueOf(seg) + String.valueOf(dia) + String.valueOf(mes) + String.valueOf(anio) + String.valueOf(NombresCuentas.hashCode);
        folio = Long.parseLong(clave);
    }
     
    // Método sobrescrito toString
    @Override
    public String toString() {
        return "  Folio de la orden: " + folio + "\n" + "  Fecha de resgistro: " + fechaC + "\n" + "  Hora de registro: " + horaC;
    }
   
     
    public void mostrarFecha(){
        System.out.println(fechaC); 
    }
     
    public void mostrarHora(){
        System.out.println(horaC);
    } 
    
    public void mostrarFolio(){
        System.out.println(folio);
    }
    
    
    
    
    
}

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
    private int hashCode = NombresCuentas.hashCode;
    private String horaC;
    private String fechaC;
    private String clave;
    protected long folio;
    private Calendar Hora = Calendar.getInstance();
    private Calendar Fecha = Calendar.getInstance();

    
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
        return "  Folio de la orden: " + getFolio() + "\n" + "  Fecha de resgistro: " + getFechaC() + "\n" + "  Hora de registro: " + getHoraC();
    }
   
     
    public void mostrarFecha(){
        System.out.println(getFechaC()); 
    }
     
    public void mostrarHora(){
        System.out.println(getHoraC());
    } 
    
    public void mostrarFolio(){
        System.out.println(getFolio());
    }

    /**
     * @return the horab
     */
    public int getHorab() {
        return horab;
    }

    /**
     * @param horab the horab to set
     */
    public void setHorab(int horab) {
        this.horab = horab;
    }

    /**
     * @return the min
     */
    public int getMin() {
        return min;
    }

    /**
     * @param min the min to set
     */
    public void setMin(int min) {
        this.min = min;
    }

    /**
     * @return the seg
     */
    public int getSeg() {
        return seg;
    }

    /**
     * @param seg the seg to set
     */
    public void setSeg(int seg) {
        this.seg = seg;
    }

    /**
     * @return the dia
     */
    public int getDia() {
        return dia;
    }

    /**
     * @param dia the dia to set
     */
    public void setDia(int dia) {
        this.dia = dia;
    }

    /**
     * @return the mes
     */
    public int getMes() {
        return mes;
    }

    /**
     * @param mes the mes to set
     */
    public void setMes(int mes) {
        this.mes = mes;
    }

    /**
     * @return the anio
     */
    public int getAnio() {
        return anio;
    }

    /**
     * @param anio the anio to set
     */
    public void setAnio(int anio) {
        this.anio = anio;
    }

    /**
     * @return the hashCode
     */
    public int getHashCode() {
        return hashCode;
    }

    /**
     * @param hashCode the hashCode to set
     */
    public void setHashCode(int hashCode) {
        this.hashCode = hashCode;
    }

    /**
     * @return the horaC
     */
    public String getHoraC() {
        return horaC;
    }

    /**
     * @param horaC the horaC to set
     */
    public void setHoraC(String horaC) {
        this.horaC = horaC;
    }

    /**
     * @return the fechaC
     */
    public String getFechaC() {
        return fechaC;
    }

    /**
     * @param fechaC the fechaC to set
     */
    public void setFechaC(String fechaC) {
        this.fechaC = fechaC;
    }

    /**
     * @return the clave
     */
    public String getClave() {
        return clave;
    }

    /**
     * @param clave the clave to set
     */
    public void setClave(String clave) {
        this.clave = clave;
    }

    /**
     * @return the folio
     */
    public long getFolio() {
        return folio;
    }

    /**
     * @param folio the folio to set
     */
    public void setFolio(long folio) {
        this.folio = folio;
    }

    /**
     * @return the Hora
     */
    public Calendar getHora() {
        return Hora;
    }

    /**
     * @param Hora the Hora to set
     */
    public void setHora(Calendar Hora) {
        this.Hora = Hora;
    }

    /**
     * @return the Fecha
     */
    public Calendar getFecha() {
        return Fecha;
    }

    /**
     * @param Fecha the Fecha to set
     */
    public void setFecha(Calendar Fecha) {
        this.Fecha = Fecha;
    }
    
    
    
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.almacen;

/**
 *
 * @author kike0
 */
public class AvionEnvio implements EstadoEnvio{
    
    @Override
    public void pendiente() {
        System.out.println("Su envio con folio ******* aun esta en espera de ser enviado por avion"); 
    }

    @Override
    public void enviado() {
        System.out.println("Su envio con folio ******* ya fue enviado por avion"); 
    }
    
}

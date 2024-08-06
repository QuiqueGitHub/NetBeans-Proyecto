/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.almacen;

/**
 *
 * @author kike0
 */
public abstract interface EstadoEnvio {//Queremos que si el trabajador ya proceso el envio, al cliente le salga un mensaje diciendo que ya fue enviado, de lo contrario, que diga que sigue en lista de espera
    public void pendiente();
    public void enviado();
}

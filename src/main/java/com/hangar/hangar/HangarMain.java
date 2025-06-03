/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hangar.hangar;

/**
 *
 * @author simon
 */
public class HangarMain {
        
    public static void main(String[] args) throws CloneNotSupportedException {
        Hangar hangar1 = new Hangar(101, 23982.46);
        Hangar hangar2 = (Hangar)hangar1.clone();
        System.out.println((hangar1 == hangar2) ? "Los objetos son iguales\n" : "Los objetos no son iguales\n");
        System.out.println((hangar1.primerUso == hangar2.primerUso) ? "Las fechas son iguales\n" : "Las fechas no son iguales\n");
        System.out.println("hangar1: " + hangar1.primerUso );
    }
    
}

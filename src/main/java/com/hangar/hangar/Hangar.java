/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.hangar.hangar;

/**
 *
 * @author simon
 */
public class Hangar implements Cloneable, Comparable<Hangar> {

    private int id;
    private double area;
    protected java.util.Date primerUso;
    
    public Hangar(int id, double area) {
        
        this.id = id;
        this.area = area;
        primerUso = new java.util.Date();
        
    }
    
    public int obtenerId() { return id; }
    public double obtenerArea() { return area; }
    public java.util.Date obtenerFecha() { return primerUso; }
    
    public Object clone() throws CloneNotSupportedException {
        Hangar copiaHangar = (Hangar)super.clone();
        copiaHangar.primerUso = (java.util.Date)(primerUso.clone());
        return copiaHangar;
    }
    
    @Override
    public int compareTo(Hangar objeto) {
        if (area > objeto.area) 
            return 1;
        else if (area < objeto.area)
            return -1;
        else
            return 0;
    }

}

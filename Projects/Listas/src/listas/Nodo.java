/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas;

/**
 *
 * @author Yery Pedraza
 */
public class Nodo {
    
    
    private Nodo siguiente;
    private double dato;
    
    public Nodo(){
    
    }

    public Nodo(Nodo siguiente, double dato) {
        this.siguiente = siguiente;
        this.dato = dato;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public double getDato() {
        return dato;
    }

    public void setDato(double dato) {
        this.dato = dato;
    }
    
    public boolean tieneSiguente(){
    
    return siguiente!=null;
    }
}

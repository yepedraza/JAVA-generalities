/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas;

/**
 *
ddd * @author Yery Pedraza
 */
public class Listas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        CListas lista = new CListas();
        
        lista.adicionar(1);
        lista.adicionar(2);
        lista.adicionar(9);
        lista.adicionar(3);
        lista.adicionar(5);
        lista.adicionar(7);
        
        double prom=lista.promedioimpares(lista);
        
        System.out.println("El promedio de los numeros que se encuentran en las posiciones impares es: "+lista.promedioimpares(lista));
        
    }
    
}

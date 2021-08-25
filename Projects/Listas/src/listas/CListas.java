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
public class CListas {
    
    Nodo inicio;
    int tamaño;
    
    public boolean adicionar(double dato){
    
    if(inicio==null){
    
        inicio=new Nodo(null, dato);
        tamaño++;
        return true;
        
    }
    else{
            Nodo temp=inicio;
            while(temp.tieneSiguente()){
                temp=temp.getSiguiente();
            }
            temp.setSiguiente(new Nodo(null, dato));
            tamaño++;
            return true;
            }
    }
    
    public double promedioimpares(CListas lista){
    
        double promedio=0;
        Nodo aux=inicio;
        int posicion=0;
        
        while(aux!=null){
        
            if(posicion%2!=0){
            promedio+=aux.getDato();
            
            aux=aux.getSiguiente();
            posicion++;
            }
            else{
            
                aux=aux.getSiguiente();
                posicion++;
            }
        }
        
        promedio=promedio/cantidadimpares(lista);
        return promedio;
    }
    
    public int cantidadimpares(CListas lista){
    
    Nodo aux=inicio;
    int cont=0;
    int posicion=0;
    
    while (aux!=null){
    
        if(posicion%2!=0){
        
            cont++;
            aux=aux.getSiguiente();
            posicion++;
            
        }
        else{
        
            aux=aux.getSiguiente();
            posicion++;
        }
    }
    
    return cont;
    }
}

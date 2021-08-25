/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisiónmédica;

/**
 *
 * @author Yery Pedraza
 */
public class Paciente {
    
private String nombre;
private String genero;
private int edad;
private float peso;
private float estatura;

public Paciente(String n, String g, int e, float p, float es){

nombre = n;
genero = g;
edad = e;
peso = p;
estatura = es;

}   

public Paciente(){

}

public String getNombre(){

return nombre;
}

public String getGenero(){

return genero;
}

public int getEdad(){

return edad;
}

public float getPeso(){

return peso;
}

public float getEstatura(){

return estatura;
}

public void setNombre(String n){

nombre = n;
}

public void setGenero(String g){

genero = g;
}

public void setEdad(int e){

edad = e;
}

public void setPeso(float p){

peso = p;
}

public void setEstatura(float es){

estatura = es;
}

public void CalculoMasa(float peso, float estatura){

float IMC;

IMC = peso /(estatura * estatura);

if(IMC < 18){

    System.out.println("Su indice de masa corporal es: " + IMC);
    System.out.println("Necesita revision medica por desnutricion");
}

else{

if(IMC >= 18 && IMC <= 24.9){

    System.out.println("Su indice de masa corporal es: " + IMC);
    System.out.println("No necesita revision medica");
}
else{

    System.out.println("Su indice de masa corporal es: " + IMC);
    System.out.println("Necesita revision medica por sobrepeso");
}
}
}

public void CalculoEtapa(int edad){

if(edad >= 7 && edad <= 11){

    System.out.println("Su etapa actual es: Ni\\u00f1o");
}
    else{

        if(edad >11 && edad <= 18){

        System.out.println("Su etapa actual es: Adolescente");
}
            else{
            
                if(edad > 18 && edad <= 60){
                
                System.out.println("Su etapa actual es: Adulto");
                }
                else{
                
                    if(edad > 60){
                    
                    System.out.println("Su etapa actual es: Adulto mayor");    
                    }
                }
}
}
}

}

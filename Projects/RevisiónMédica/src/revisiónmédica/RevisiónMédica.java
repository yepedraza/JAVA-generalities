/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisiónmédica;

import java.util.Scanner;

/**
 *
 * @author Yery Pedraza
 */
public class RevisiónMédica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Creacion del objeto
        Paciente Pa = new Paciente();
        Scanner scanner = new Scanner(System.in);
        
        //Toma de datos
        System.out.println("Ingrese su nombre ");
        
        String nombre = scanner.nextLine();
        Pa.setNombre(nombre);
        
        System.out.println("Ingrese su genero ");
        
        String genero = scanner.nextLine();
        Pa.setGenero(genero);
        
        System.out.println("Ingrese su edad ");
        
        int edad = scanner.nextInt();
        Pa.setEdad(edad);
        
        System.out.println("Ingrese su peso ");
        
        float peso = scanner.nextFloat();
        Pa.setPeso(peso);
        
        System.out.println("Ingrese su estatura ");
        
        float estatura = scanner.nextFloat();
        Pa.setEstatura(estatura);
        
        //Calculo de masa corporal
        
        Pa.CalculoMasa(Pa.getPeso(), Pa.getEstatura());
        Pa.CalculoEtapa(Pa.getEdad());
        
        // TODO code application logic here
    }
    
}

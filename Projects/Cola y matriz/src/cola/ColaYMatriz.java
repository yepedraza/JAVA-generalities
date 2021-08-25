/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cola.y.matriz.uwu;

import java.util.Stack;

/**
 *
 * @author Yery Pedraza
 */
public class ColaYMatrizUwu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Stack a1 = new Stack();
        Stack a2 = new Stack();
        Stack a3 = new Stack();
        Stack a4 = new Stack();
        Stack a5 = new Stack();
        Stack a6 = new Stack();
        
        for (int i = 1; i < 6; i++) {    
            a1.push(i);
        }
        for (int i = 6; i < 11; i++) {    
            a2.push(i);
        }
        for (int i = 11; i < 16; i++) {    
            a3.push(i);
        }
        for (int i = 16; i < 21; i++) {    
            a4.push(i);
        }
        for (int i = 21; i < 26; i++) {    
            a5.push(i);
        }
        
        a6.push(a1);
        a6.push(a2);
        a6.push(a3);
        a6.push(a4);
        a6.push(a5);
        
        System.out.print(a6);
        System.out.println();
    }
    
}

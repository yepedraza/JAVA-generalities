/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio2;

/**
 *
 * @author Yery Pedraza
 */
public class CEstandar {
    
    private String memoria1;
    private String signo;
    private String memoria2;
    private String cadena;
    private Double num;
    private String resultado; 
    

    public CEstandar(String m1, String s, String m2, String c, Double n, String r) {
        
        memoria1 = m1;
        signo = s;
        memoria2 = m2;
        cadena = c;
        num = n;
        resultado = r;
        
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String r) {
        resultado = r;
    }

    public Double getNum() {
        return num;
    }

    public void setNum(Double n) {
        num = n;
    }

    public CEstandar(){
    
    }

    public String getMemoria1() {
        return memoria1;
    }

    public void setMemoria1(String m1) {
        memoria1 = m1;
    }

    public String getSigno() {
        return signo;
    }

    public void setSigno(String s) {
        signo = s;
    }

    public String getMemoria2() {
        return memoria2;
    }

    public void setMemoria2(String m2) {
        memoria2 = m2;
    }

    public String getCadena() {
        return cadena;
    }

    public void setCadena(String c) {
        cadena = c;
    }

    public String Calculo(){
    
    Double resul = 0.0;
    String respuesta;
    
    if(signo.equals("-")){
    
        resul=Double.parseDouble(memoria1)-Double.parseDouble(memoria2);
    }
    if(signo.equals("+")){
    
        resul=Double.parseDouble(memoria1)+Double.parseDouble(memoria2);
    }
    if(signo.equals("*")){
    
        resul=Double.parseDouble(memoria1)*Double.parseDouble(memoria2);
    }
    if(signo.equals("/")){
    
        resul=Double.parseDouble(memoria1)/Double.parseDouble(memoria2);
    }
    if(signo.equals("RAIZ")){
    
    resul=Math.sqrt(Double.parseDouble(memoria1))*Double.parseDouble(memoria2);
    }
    
    respuesta=resul.toString();
    return respuesta;
    }
    
    
    
      
}

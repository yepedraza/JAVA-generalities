
package laboratorio2;

public class CUnidades {
   
    public double valor_principal;
    public double valoresLongitud[] = new double [5];
    public double valoresMasa[] = new double[4];
    public double valoresMoneda[] = new double[4];
    public double valoresTemperatura[] = new double[3];
    public  CUnidades(double vp) {
        valor_principal = vp;
}

   public double  mostrarValorPrincipal(){//Método para mostrar el valor principal
                    return valor_principal;
    }
    public void  darValorPrincipal(double valor_cambiado){//Método para dar un valor principal
                   valor_principal = valor_cambiado;
    }
    public double[] convertirLongitud(int Unidad)
    {
        // donde 0 es Centimetros, 1 metros, 2 Pies , 3 Pulgadas, 4 millas
    if (Unidad == 0 )
    {
     valoresLongitud[0] = valor_principal;
     valoresLongitud[1] = (valor_principal/100);
     valoresLongitud[2] = (valor_principal * 0.032808);
     valoresLongitud[3] = (valor_principal * 0.39370);
     valoresLongitud[4] = (valor_principal * 0.0000062137);
    }
    else if (Unidad == 1 )
    {
     valoresLongitud[0] = valor_principal*100;
     valoresLongitud[1] = valor_principal;
     valoresLongitud[2] = (valor_principal * 3.2808);
     valoresLongitud[3] = (valor_principal * 39.370);   
     valoresLongitud[4] = (valor_principal * 0.00062137);
    }
    else if (Unidad == 2 )
    {
     valoresLongitud[0] = valor_principal/0.032808;
     valoresLongitud[1] = valor_principal/3.2808;
     valoresLongitud[2] = valor_principal;
     valoresLongitud[3] = (valor_principal *  12.0);   
     valoresLongitud[4] = (valor_principal * 0.00018939);
    }
    else if (Unidad == 3 )
    {
     valoresLongitud[0] = valor_principal/0.39370;
     valoresLongitud[1] = valor_principal/39.370;
     valoresLongitud[2] = valor_principal* 0.083333;
     valoresLongitud[3] = valor_principal;   
     valoresLongitud[4] = (valor_principal * 0.000015783);
    }
    else if (Unidad == 4 )
    {
     valoresLongitud[0] = valor_principal/0.0000062137;
     valoresLongitud[1] = valor_principal/0.00062137;
     valoresLongitud[2] = valor_principal* 5280.0;
     valoresLongitud[3] = valor_principal*63360.0;   
     valoresLongitud[4] = valor_principal;
    }
        return valoresLongitud;
    }
    public double[] convertirMasa(int Unidad)
    {
    // Donde, 0 es gramos, 1 kilogramos, 2 libras, 3 Onzas
    if (Unidad == 0 )
    {
     valoresMasa[0] = valor_principal;
     valoresMasa[1] = (valor_principal/1000);
     valoresMasa[2] = (valor_principal *0.0022046);
     valoresMasa[3] = (valor_principal * 0.035274);
    }
     else if (Unidad == 1 )
    {
     valoresMasa[0] = valor_principal*1000;
     valoresMasa[1] = valor_principal;
     valoresMasa[2] = valor_principal*2.2046;
     valoresMasa[3] = valor_principal*35.274;   
    }
     else if (Unidad == 2 )
    {
     valoresMasa[0] = valor_principal/0.0022046;
     valoresMasa[1] = valor_principal/2.2046;
     valoresMasa[2] = valor_principal;
     valoresMasa[3] = valor_principal*16.000;   
    }
    else if (Unidad == 3 )
    {
     valoresMasa[0] = valor_principal/0.035274;
     valoresMasa[1] = valor_principal/35.274;
     valoresMasa[2] = valor_principal*0.062500;
     valoresMasa[3] = valor_principal;   
    }
    return valoresMasa;
    }
    public double[] convertirMoneda(int Unidad)
    {
    // donde 0 es COP, 1 es Dolar, 2 Euro, 3 Yen japonés
    if (Unidad == 0 )
    {
     valoresMoneda[0] = valor_principal;
     valoresMoneda[1] = (valor_principal*0.00035);
     valoresMoneda[2] = (valor_principal * 0.00029);
     valoresMoneda[3] = (valor_principal * 0.0373134328);
    }
     else if (Unidad == 1 )
    {
     valoresMoneda[0] = valor_principal*2866.60897;
     valoresMoneda[1] = valor_principal;
     valoresMoneda[2] = (valor_principal * 0.819961134);
     valoresMoneda[3] = (valor_principal * 106.68206);
    }
     else if (Unidad == 2 )
    {
     valoresMoneda[0] = valor_principal*3484.48571;
     valoresMoneda[1] = valor_principal*1.21957;
     valoresMoneda[2] = valor_principal;
     valoresMoneda[3] = (valor_principal*130.018124 );
    }
    else if (Unidad == 3 )
    {
     valoresMoneda[0] = valor_principal*26.87058;
     valoresMoneda[1] = valor_principal*0.00937;
     valoresMoneda[2] = valor_principal*0.00769;
     valoresMoneda[3] = valor_principal;
    }
    return valoresMoneda;
    }
    public double[] convertirTemperatura(int Unidad)
    {
    // donde 0 celcius, 1 kelvin, 2 farenheit
    if (Unidad == 0)
    {
     valoresTemperatura[0] = valor_principal;
     valoresTemperatura[1] = (valor_principal+273.15);
     valoresTemperatura[2] = (valor_principal*1.8000 + 32.00);  
    }
    else if (Unidad == 1)
    {
     valoresTemperatura[0] = valor_principal-273.15;
     valoresTemperatura[1] = valor_principal;
     valoresTemperatura[2] = ((valor_principal- 273.15)* 1.8000) + 32.00;  
    }
    else if (Unidad == 2)
    {
     valoresTemperatura[0] = (valor_principal-32)/1.8;
     valoresTemperatura[1] = ((valor_principal-32)/1.8)+273.15;
     valoresTemperatura[2] = valor_principal;  
    }
    return valoresTemperatura;
    }
    
}
 

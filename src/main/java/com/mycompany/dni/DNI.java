/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.dni;

/**
 *
 * @author Usuario
 */
public class DNI {

    public static void main(String[] args) {
        /*System.out.println("Hello World!");
        int numeroDni = 31002739;  // Aquí va el número del DNI
        char letra = obtenerLetraDni(numeroDni);
        System.out.println("La letra correspondiente al DNI " + numeroDni + " es: " + letra);
        */
        String numeroDni = "31002739G";
        boolean resultado = DNI.validarDNI(numeroDni);
        System.out.println(resultado);
        
    }




    // Método para obtener la letra del DNI
    public static char obtenerLetraDni(int numeroDni) {
        // Letras posibles
        char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 
                         'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        
        // Calculamos el resto de la división del número por 23
        int resto = numeroDni % 23;
        
        // Retornamos la letra correspondiente según el resto
        return letras[resto];
    }
   public static boolean validarDNI(String dni){
       String numero = dni.substring(0, 8);
       char letra = dni.charAt(8);
       int numeroDNI = Integer.parseInt(numero);
       char letraCalculada = DNI.obtenerLetraDni(numeroDNI);
       if (letraCalculada == letra){
           return true;
       }else{
           return false;
       }
       
   }
        
    

    
}


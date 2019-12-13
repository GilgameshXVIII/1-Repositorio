/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1ºproyecto;

/**
 *
 * @author admin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String cadena="recreo";
        String otra="recreoz";
        //String cadena=new String("Hola");
        /*
        int pos=-1;
        int tam=cadena.length();
        System.out.println("El tamaño de la cadena es:"+tam);
        
        for(int i=0;i<cadena.length();i++){
            if (cadena.charAt(i)=='ñ'){
                  pos=i;
                  break;}
        }
        if (pos!=-1)
            System.out.println("He encontrado una ñ en la posición:"+pos);
    
        // Pasar una cadena a mayúsculas
        cadena=cadena.toUpperCase();
        // Pasar un caracter a mayúsculas
        char letra='a';
        letra=Character.toUpperCase(letra);
       
        
        otra=otra.replaceAll("a", "A");
        System.out.println("La cadena con los reemplazamientos es:"+ otra);
        */
        if (cadena.compareToIgnoreCase(otra)==0)
            System.out.println("Son iguales");
        else
            if (cadena.compareToIgnoreCase(otra)>0)
                System.out.println("La primera cadena es mayor que la segunda");
            else
                System.out.println("La primera cadena es menor que la segunda");
    
    }
    
}

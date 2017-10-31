/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz;

import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class Main {
    public static void main(String[] args) {
        WebGallery w = new WebGallery();
        Scanner teclado = new Scanner(System.in);
        int x = 0;
        String n = "";
        String c = "";
        
        while(true){
          System.out.println("si desea crear un cuenta ingrese 1 si desea inisiar sesion 2");  
          x=teclado.nextInt(x);
          if(x==1){
             while (true){
                System.out.println("ingrse 1 para artista o 2 para comprador");
              x=teclado.nextInt();
              if(x==1){
                  System.out.println("ingrese el nombre y la contraseña");
                  n=teclado.next();
                  c=teclado.next();
                  w.NuevoArtista(n,c);
                  
                }
              else if (x==2){
                  System.out.println("ingrese el nombre y la contraseña");
                  n=teclado.next();
                  c=teclado.next();
                  w.NuevoComprador(n,c);
                 
              }
              else{
                  System.out.println("digito no valido");
               }
              }
          }
         else if (x==2){
                  
            }
          
          else if(x==2){
              
          }
          else{
              System.out.println("digito no valido");
          }
        }
        
    }
}

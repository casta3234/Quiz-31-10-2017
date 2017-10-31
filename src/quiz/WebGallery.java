/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz;

import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class WebGallery {
    private ArrayList <Artista> artista;
    private ArrayList <Comprador> comprador;

    public WebGallery() {
        this.artista = new ArrayList<>();
        this.comprador = new ArrayList<>();
    }
    
    public void NuevoArtista(String nombre,String Contraseña){
    Artista a = new Artista(nombre, Contraseña);
    this.artista.add(a);
    }
    
    public void NuevoComprador(String nombre,String Contraseña){
    Comprador c = new Comprador(nombre, Contraseña);
    this.comprador.add(c);
    }
    
    public int IniciarUsuario(String nombre,String Contraseña){
        int x = 0;
        for (Artista a : this.artista ) {
            if ((a.getNombre()==nombre)&&(a.getContraseña()==Contraseña)){
                x=1;
                break;
            }
        }
        if(x==0){
            for (Comprador c : this.comprador ) {
                if ((c.getNombre()==nombre)&&(c.getContraseña()==Contraseña)){
                    x=2;
                    break;
                }
            }
        }
        return x;
    }

}

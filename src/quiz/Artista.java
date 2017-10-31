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
public class Artista extends Usuario {
    private ArrayList<Obra> obra; 
    public Artista(String nombre, String contraseña) {
        super(nombre, contraseña);
        this.obra = new ArrayList<>();
        
        
    }

    @Override
    public String toString() {
        String infoObras = " ";
          for (Obra o : this.obra) {
            infoObras += o.toString();
        }
        return super.toString()+this.obra.size()+infoObras;
                
     }

    
}


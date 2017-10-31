/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz;

/**
 *
 * @author Estudiante
 */
public class Obra {
    private String nombre,estilo,tecnica;
    private double valor;

    public Obra(String nombre, String estilo, String tecnica, double valor) {
        this.nombre = nombre;
        this.estilo = estilo;
        this.tecnica = tecnica;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Obra{" + "nombre=" + nombre + ", estilo=" + estilo + ", tecnica=" + tecnica + ", valor=" + valor + '}';
    }
    
}

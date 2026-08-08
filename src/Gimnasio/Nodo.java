/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gimnasio;

/**
 *
 * @author aleja
 */
public class Nodo {

    private Inscripcion dato;
    private Nodo siguiente;

    public Nodo() {
        this.siguiente = null;
    }

    public Inscripcion getDato() {
        return dato;
    }

    public void setDato(Inscripcion dato) {
        this.dato = dato;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

}

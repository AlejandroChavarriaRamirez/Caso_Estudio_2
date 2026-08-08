/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gimnasio;

/**
 *
 * @author aleja
 */

public class ListaInscripciones {

    private Nodo inicio;
    private Nodo fin;

    public ListaInscripciones() {
        this.inicio = null;
        this.fin = null;
    }

    public boolean vacia() {
        return inicio == null;
    }

    public void insertarInicio(Inscripcion i) {
        Nodo nuevo = new Nodo();
        nuevo.setDato(i);
        if (vacia()) {
            inicio = nuevo;
            fin = nuevo;
        } else {
            nuevo.setSiguiente(inicio);
            inicio = nuevo;
        }
    }

    public void insertarFinal(Inscripcion i) {
        Nodo nuevo = new Nodo();
        nuevo.setDato(i);
        if (vacia()) {
            inicio = nuevo;
            fin = nuevo;
        } else {
            fin.setSiguiente(nuevo);
            fin = nuevo;
        }
    }

    public void insertarMedio(Inscripcion i) {
        Nodo nuevo = new Nodo();
        nuevo.setDato(i);
        if (vacia() || inicio.getSiguiente() == null) {
            insertarFinal(i);
        } else {
            Nodo aux = inicio;
            nuevo.setSiguiente(aux.getSiguiente());
            aux.setSiguiente(nuevo);
        }
    }

    public void mostrar() {
        if (!vacia()) {
            Nodo aux = inicio;
            while (aux != null) {
                System.out.println("Clase: " + aux.getDato().getClase().getNombre()
                        + " / Tipo: " + aux.getDato().getClase().getTipoEntrenamiento()
                        + " / Duracion: " + aux.getDato().getClase().getDuracion()
                        + " / Horario: " + aux.getDato().getClase().getHorario());
                System.out.println("Cliente: " + aux.getDato().getCliente().getNombre()
                        + " / Identificacion: " + aux.getDato().getCliente().getIdentificacion()
                        + " / Telefono: " + aux.getDato().getCliente().getTelefono()
                        + " / Correo: " + aux.getDato().getCliente().getCorreo());
                System.out.println("Fecha inscripcion: " + aux.getDato().getFechaInscripcion()
                        + " / Nivel: " + aux.getDato().getNivelDificultad());
                System.out.println("-------------------------------");
                aux = aux.getSiguiente();
            }
        } else {
            System.out.println("Lista vacia");
        }
    }
    
    public void modificar(String identificacion, Inscripcion nuevaInfo) {
    Nodo aux = inicio;
    while (aux != null) {
        if (aux.getDato().getCliente().getIdentificacion().equals(identificacion)) {
            aux.setDato(nuevaInfo);
        }
        aux = aux.getSiguiente();
    }
}

}

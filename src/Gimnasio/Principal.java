/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Gimnasio;

/**
 *
 * @author aleja
 */
public class Principal {

    public static void main(String[] args) {

        ListaInscripciones lista = new ListaInscripciones();

        Clase clase1 = new Clase();
        clase1.setNombre("Spinning");
        clase1.setTipoEntrenamiento("Cardio");
        clase1.setDuracion("45 min");
        clase1.setHorario("6:00 am");

        Cliente cliente1 = new Cliente();
        cliente1.setNombre("Marco Rojas");
        cliente1.setIdentificacion("101110111");
        cliente1.setTelefono("8888-1111");
        cliente1.setCorreo("marco@correo.com");

        Inscripcion inscripcion1 = new Inscripcion();
        inscripcion1.setClase(clase1);
        inscripcion1.setCliente(cliente1);
        inscripcion1.setFechaInscripcion("01/08/2026");
        inscripcion1.setNivelDificultad("Intermedio");

        Clase clase2 = new Clase();
        clase2.setNombre("Yoga");
        clase2.setTipoEntrenamiento("Flexibilidad");
        clase2.setDuracion("60 min");
        clase2.setHorario("7:00 am");

        Cliente cliente2 = new Cliente();
        cliente2.setNombre("Laura Solis");
        cliente2.setIdentificacion("202220222");
        cliente2.setTelefono("8888-2222");
        cliente2.setCorreo("laura@correo.com");

        Inscripcion inscripcion2 = new Inscripcion();
        inscripcion2.setClase(clase2);
        inscripcion2.setCliente(cliente2);
        inscripcion2.setFechaInscripcion("02/08/2026");
        inscripcion2.setNivelDificultad("Principiante");

        Clase clase3 = new Clase();
        clase3.setNombre("CrossFit");
        clase3.setTipoEntrenamiento("Fuerza");
        clase3.setDuracion("50 min");
        clase3.setHorario("5:00 pm");

        Cliente cliente3 = new Cliente();
        cliente3.setNombre("Diego Vargas");
        cliente3.setIdentificacion("303330333");
        cliente3.setTelefono("8888-3333");
        cliente3.setCorreo("diego@correo.com");

        Inscripcion inscripcion3 = new Inscripcion();
        inscripcion3.setClase(clase3);
        inscripcion3.setCliente(cliente3);
        inscripcion3.setFechaInscripcion("03/08/2026");
        inscripcion3.setNivelDificultad("Avanzado");

        lista.insertarInicio(inscripcion1);
        lista.insertarFinal(inscripcion2);
        lista.insertarMedio(inscripcion3);

        System.out.println("=== Lista antes de modificar ===");
        lista.mostrar();

        Cliente clienteMod = new Cliente();
        clienteMod.setNombre("Laura Solis");
        clienteMod.setIdentificacion("202220222");
        clienteMod.setTelefono("8888-9999");
        clienteMod.setCorreo("laura.solis@correo.com");

        Inscripcion inscripcionMod = new Inscripcion();
        inscripcionMod.setClase(clase2);
        inscripcionMod.setCliente(clienteMod);
        inscripcionMod.setFechaInscripcion("02/08/2026");
        inscripcionMod.setNivelDificultad("Intermedio");

        lista.modificar("202220222", inscripcionMod);

        System.out.println("=== Lista despues de modificar ===");
        lista.mostrar();

    }

}

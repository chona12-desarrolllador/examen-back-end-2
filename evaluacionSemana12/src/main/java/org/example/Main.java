package org.example;

import org.example.modelos.*;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Cliente objetoCliente = new Cliente("Oscar", "1013457371", "oscar12@gmail.com", "324 3723519", "calle falsa 123", LocalDate.of(1999, 05, 14), "Masculino", true);
        Cliente objetoCliente2 = new Cliente("Mariana", "1013457673", "Mari34@gmail.com", "325 3745621", "avenida no exite 34", LocalDate.of(2000, 12, 21), "Femenino", false);

        Pelicula objetoPelicula = new Pelicula("Bebe con tos vs Bomba Atomica", "Dios", "Accion", "Cuatro horas", "Aleman y Español", "PG", "2025", "Batalla del año entre los maximos adversarios");
        Pelicula objetoPelicula2 = new Pelicula("Ecos del mañana", "Laura Mendez", "Ciencia Ficcion / Drama", "Dos horas", "Japones", "PG", "2024", "Un habitante de calle escucha en su vasito mensajes del pasado");

        Sala objetoSala = new Sala("2", "250", "2d", "Segundo piso, ala norte", 15000.0, "Disponible", 12.5, "DTS:X" );
        Sala objetoSala2 = new Sala("1", "500", "IMAX", "Segundo piso, ala norte", 25000.0, "Mantenimiento", 22.0, "IMAX 12.0");

        Asiento objetoAsiento = new Asiento("A", "5", true, "Disponible", "Rechinable", 2000.0, "cuero", "centro");
        Asiento objetoAsiento2 = new Asiento("C", "10", false, "Ocupado", "Normal", 1000.0, "tela", "lateral" );

        Reserva objetoReserva = new Reserva(1, "Oscar", "Bebe con tos vs Bomba atomica", "VIP", "15 de octubre");
        Reserva obetoReserva2 = new Reserva(2, "Mariana", "Ecos del pasado", "Normal", "20 de octubre");

        System.out.println(objetoCliente);
        System.out.println(objetoCliente2);

        System.out.println(objetoPelicula);
        System.out.println(objetoPelicula2);

        System.out.println(objetoSala);
        System.out.println(objetoSala2);

        System.out.println(objetoAsiento);
        System.out.println(objetoAsiento2);

        System.out.println(objetoReserva);
        System.out.println(obetoReserva2);



    }
}
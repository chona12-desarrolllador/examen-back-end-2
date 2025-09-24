package org.example;

import org.example.modelos.Cliente;
import org.example.modelos.Pokemon;
import org.example.modelos.Vendedor;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    Pokemon objeto = new Pokemon("pokemon feo",1,"PIKACHU",30000.0,"carta","ELECTRICO");
    Pokemon objeto2 = new Pokemon("pokemon sobrevalorado",2,"CHarmander",30000.0,"carta","FUEGO");

    Cliente objetoCliente = new Cliente("Berlin",4.0, LocalDate.of(2004,10,6),1,"Pipe SAN","Alemania");
    Cliente objetoCliente2 = new Cliente();

    Vendedor objetoVendedor = new Vendedor("manolo@gmail.com",1,"Manolo",600,1000000.0,"1013457371");
    Vendedor objetoVendedor2 = new Vendedor();


    }
}


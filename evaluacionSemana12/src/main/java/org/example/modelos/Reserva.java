package org.example.modelos;

public class Reserva {
    private Integer idReserva;
    private String cliente;
    private String pelicula;
    private String asiento;
    private String fecha;

    public Reserva() {
    }

    public Reserva(Integer idReserva, String cliente, String pelicula, String asiento, String fecha) {
        this.idReserva = idReserva;
        this.cliente = cliente;
        this.pelicula = pelicula;
        this.asiento = asiento;
        this.fecha = fecha;
    }

    public Integer getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(Integer idReserva) {
        this.idReserva = idReserva;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getPelicula() {
        return pelicula;
    }

    public void setPelicula(String pelicula) {
        this.pelicula = pelicula;
    }

    public String getAsiento() {
        return asiento;
    }

    public void setAsiento(String asiento) {
        this.asiento = asiento;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "ID: " + idReserva + "Cliente: " + cliente + "Pelicula: " + pelicula + "Asiento: " + asiento + "Fecha: " + fecha ;
    }

}

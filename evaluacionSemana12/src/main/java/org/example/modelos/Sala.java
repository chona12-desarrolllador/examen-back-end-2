package org.example.modelos;

public class Sala {
    private String numero;
    private String capacidad;
    private String tipo;
    private String ubicacion;
    private Double precioEntrada;
    private String estado;
    private Double pantalla;
    private String sistemaAudio;

    public Sala() {
    }

    public Sala(String numero, String capacidad, String tipo, String ubicacion, Double precioEntrada, String estado, Double pantalla, String sistemaAudio) {
        this.numero = numero;
        this.capacidad = capacidad;
        this.tipo = tipo;
        this.ubicacion = ubicacion;
        this.precioEntrada = precioEntrada;
        this.estado = estado;
        this.pantalla = pantalla;
        this.sistemaAudio = sistemaAudio;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Double getPrecioEntrada() {
        return precioEntrada;
    }

    public void setPrecioEntrada(Double precioEntrada) {
        this.precioEntrada = precioEntrada;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Double getPantalla() {
        return pantalla;
    }

    public void setPantalla(Double pantalla) {
        this.pantalla = pantalla;
    }

    public String getSistemaAudio() {
        return sistemaAudio;
    }

    public void setSistemaAudio(String sistemaAudio) {
        this.sistemaAudio = sistemaAudio;
    }

    @Override
    public String toString() {
        return "Numero de sala: " + numero + "Capacidad de la sala: " + capacidad + "Tipo de sala: " + tipo + "Ubicacion: " + ubicacion + "Precio Entrada: " + precioEntrada + "Estado: " + estado + "Pantalla: " + pantalla + "Sistema de Audio: " + sistemaAudio ;
    }

}

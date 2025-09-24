package org.example.modelos;

public class Asiento {
    private String fila;
    private String numero;
    private Boolean esVIP;
    private String estado;
    private String tipo;
    private Double precio;
    private String material;
    private String ubicacion;

    public Asiento() {
    }

    public Asiento(String fila, String numero, Boolean esVIP, String estado, String tipo, Double precio, String material, String ubicacion) {
        this.fila = fila;
        this.numero = numero;
        this.esVIP = esVIP;
        this.estado = estado;
        this.tipo = tipo;
        this.precio = precio;
        this.material = material;
        this.ubicacion = ubicacion;
    }

    public String getFila() {
        return fila;
    }

    public void setFila(String fila) {
        this.fila = fila;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Boolean getEsVIP() {
        return esVIP;
    }

    public void setEsVIP(Boolean esVIP) {
        this.esVIP = esVIP;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    @Override
    public String toString() {
        return "Fila: " + fila + "Numero: " + numero + "ES vip: " + esVIP + "Estado: " + estado + "Tipo: " + tipo + "Precio: " + precio + "Material: " + material + "Ubicacion: " + ubicacion ;
    }

}

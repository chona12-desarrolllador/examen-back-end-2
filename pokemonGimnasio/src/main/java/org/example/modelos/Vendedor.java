package org.example.modelos;

public class Vendedor {
    private Integer id;
    private String nombre;
    private String telefono;
    private String correo;
    private Double salarioMensual;
    private Integer numeroVentasAlMes;

    public Vendedor() {
    }

    public Vendedor(String correo, Integer id, String nombre, Integer numeroVentasAlMes, Double salarioMensual, String telefono) {
        this.correo = correo;
        this.id = id;
        this.nombre = nombre;
        this.numeroVentasAlMes = numeroVentasAlMes;
        this.salarioMensual = salarioMensual;
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getNumeroVentasAlMes() {
        return numeroVentasAlMes;
    }

    public void setNumeroVentasAlMes(Integer numeroVentasAlMes) {
        this.numeroVentasAlMes = numeroVentasAlMes;
    }

    public Double getSalarioMensual() {
        return salarioMensual;
    }

    public void setSalarioMensual(Double salarioMensual) {
        this.salarioMensual = salarioMensual;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}



package org.example.modelos;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

public class Cliente {
    private String nombre;
    private String documento;
    private String correo;
    private String numeroCelular;
    private String direccion;
    private LocalDate fechaNacimiento;
    private String genero;
    private boolean subscripcionActiva;

    public Cliente() {
    }

    public Cliente(String nombre, String documento, String correo, String numeroCelular, String direccion, LocalDate fechaNacimiento, String generosPreferidos, boolean subscripcionActiva) {
        this.nombre = nombre;
        this.documento = documento;
        this.correo = correo;
        this.numeroCelular = numeroCelular;
        this.direccion = direccion;
        this.fechaNacimiento = fechaNacimiento;
        this.genero = generosPreferidos;
        this.subscripcionActiva = subscripcionActiva;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNumeroCelular() {
        return numeroCelular;
    }

    public void setNumeroCelular(String numeroCelular) {
        this.numeroCelular = numeroCelular;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public List<String> getGenero() {
        return Collections.singletonList(genero);
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public boolean isSubscripcionActiva() {
        return subscripcionActiva;
    }

    public void setSubscripcionActiva(boolean subscripcionActiva) {
        this.subscripcionActiva = subscripcionActiva;
    }

    @Override
    public String toString() {
        return "nombre: " + nombre + ", documento: " + documento + ", correo: " + correo + ", numeroCelular: " + numeroCelular + ", direccion: " + direccion + "fecha de nacimineto: " + fechaNacimiento + "genero: " + genero + ", subscripcionActiva: " + subscripcionActiva ;
    }

}


package org.example.modelos;

import java.time.LocalDate;

public class Cliente {
    private Integer id;
    private String nombres;
    private LocalDate fechaDeNacimiento;
    private String pais;
    private String ciudad;
    private Double clasificacion;

    public Cliente() {
    }

    public Cliente(String ciudad, Double clasificacion, LocalDate fechaDeNacimiento, Integer id, String nombres, String pais) {
        this.ciudad = ciudad;
        this.clasificacion = clasificacion;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.id = id;
        this.nombres = nombres;
        this.pais = pais;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public Double getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(Double clasificacion) {
        this.clasificacion = clasificacion;
    }

    public LocalDate getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
}



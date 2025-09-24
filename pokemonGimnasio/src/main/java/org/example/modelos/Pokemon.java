package org.example.modelos;

public class Pokemon {

    private Integer id;
    private String name;
    private String tipo;
    private String tipoPokmeon;
    private Double precio;
    private String descripcion;

    public Pokemon() {
    }

    public Pokemon(String descripcion, Integer id, String name, Double precio, String tipo, String tipoPokmeon) {
        this.descripcion = descripcion;
        this.id = id;
        this.name = name;
        this.precio = precio;
        this.tipo = tipo;
        this.tipoPokmeon = tipoPokmeon;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipoPokmeon() {
        return tipoPokmeon;
    }

    public void setTipoPokmeon(String tipoPokmeon) {
        this.tipoPokmeon = tipoPokmeon;
    }
}

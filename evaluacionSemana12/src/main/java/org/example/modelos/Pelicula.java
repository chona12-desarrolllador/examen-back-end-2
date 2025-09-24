package org.example.modelos;

public class Pelicula {
    private String titulo;
    private String director;
    private String genero;
    private String duracion;
    private String idioma;
    private String clasificacion;
    private String anoEstreno;
    private String sinopsis;

    public Pelicula() {
    }

    public Pelicula(String titulo, String director, String genero, String duracion, String idioma, String clasificacion, String anoEstreno, String sinopsis) {
        this.titulo = titulo;
        this.director = director;
        this.genero = genero;
        this.duracion = duracion;
        this.idioma = idioma;
        this.clasificacion = clasificacion;
        this.anoEstreno = anoEstreno;
        this.sinopsis = sinopsis;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public String getAnoEstreno() {
        return anoEstreno;
    }

    public void setAnoEstreno(String anoEstreno) {
        this.anoEstreno = anoEstreno;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    @Override
    public String toString() {
        return "Titulo: " + titulo + "Director " + director + "Genero: " + genero + "Duracion: " + duracion + "Idioma: " + idioma + "Clasificacion: " + clasificacion + "Año de estreno: " + anoEstreno + "Sinopsis: " + sinopsis ;
    }

}

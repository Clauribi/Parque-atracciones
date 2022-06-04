package com.company;

public class Atraccion  {
    private String nombre;
    private Integer estatura;
    private Integer capacidad;
    private Integer duracion;

    public ZonaTematica zona;

    public Atraccion(String nombre, Integer estatura, Integer capacidad, Integer duracion) throws Exception {
        if (estatura<=0) throw new Exception("error: la estatura no puede ser inferior o igual a 0");
        if (capacidad<=0) throw new Exception("error: la capacidad no puede ser inferior o igual a 0");
        if (duracion<=0) throw new Exception("error: la duracion no puede ser inferior o igual a 0");
        this.nombre = nombre;
        this.estatura = estatura;
        this.capacidad = capacidad;
        this.duracion = duracion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEstatura() {
        return estatura;
    }

    public void setEstatura(Integer estatura) {
        this.estatura = estatura;
    }

    public Integer getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(Integer capacidad) {
        this.capacidad = capacidad;
    }

    public Integer getDuracion() {
        return duracion;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }
    public void imprimirAtraccion(){
        System.out.println("Atraccion:");
        System.out.println("Nombre: "+getNombre());
        System.out.println("Etatura minima: "+getEstatura()+"cm");
        System.out.println("Capacidad maxima: "+getCapacidad()+"personas");
        System.out.println("Duracion "+getDuracion()+"min");
    }
}

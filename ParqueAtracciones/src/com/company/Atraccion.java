package com.company;

public class Atraccion  {
    private String nombre;
    private Integer estatura;
    private Integer capacidad;
    private Integer duracion;



    public Atraccion(String nombre, Integer estatura, Integer capacidad, Integer duracion) throws InvalidParamException {
        if(nombre==null) throw new InvalidParamException("Nombre no puede ser null");
        this.nombre = nombre;
        if (estatura<=0) throw new InvalidParamException("Estatura no puede ser inferior o igual a 0");
        this.estatura = estatura;
        if (capacidad<=0) throw new InvalidParamException("Capacidad no puede ser inferior o igual a 0");
        this.capacidad = capacidad;
        if (duracion<=0) throw new InvalidParamException("Duracion no puede ser inferior o igual a 0");
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Atraccion{" +
                "nombre='" + nombre + '\'' +
                ", estatura=" + estatura +
                ", capacidad=" + capacidad +
                ", duracion=" + duracion +
                '}';
    }
}

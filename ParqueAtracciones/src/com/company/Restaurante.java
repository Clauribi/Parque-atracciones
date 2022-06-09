package com.company;

public class Restaurante {
    private String nombre;
    private String horario;
    private Float precioMedio;

    public Restaurante(String nombre, String horario, Float precioMedio) throws InvalidParamException {
        if (nombre==null) throw new InvalidParamException("Nombre no puede ser null");
        this.nombre = nombre;
        if (horario==null) throw new InvalidParamException("Horario no puede ser null");
        this.horario = horario;
        if (precioMedio<=0) throw new InvalidParamException("Precio medio no puede ser inferior o igual a 0");
        this.precioMedio = precioMedio;
    }

    @Override
    public String toString() {
        return "Restaurante{" +
                "nombre='" + nombre + '\'' +
                ", horario='" + horario + '\'' +
                ", precioMedio=" + precioMedio +
                '}';
    }
}

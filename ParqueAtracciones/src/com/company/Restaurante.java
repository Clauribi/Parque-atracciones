package com.company;

public class Restaurante {
    private String nombre;
    private String horario;
    private Float precioMedio;

    public ZonaTematica zona;

    public Restaurante(String nombre, String horario, Float precioMedio) throws Exception {
        if (precioMedio<=0) throw new Exception("error: el precio medio no puede ser inferior o igual a 0");
        this.nombre = nombre;
        this.horario = horario;
        this.precioMedio = precioMedio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Float getPrecioMedio() {
        return precioMedio;
    }

    public void setPrecioMedio(Float precioMedio) {
        this.precioMedio = precioMedio;
    }
    public void imprimirRestaurante(){
        System.out.println("Restaurante:");
        System.out.println("Nombre: "+getNombre());
        System.out.println("Horario: "+getHorario());
        System.out.println("Precio medio: "+getPrecioMedio()+"€");
    }
}

package com.company;

import java.util.ArrayList;

public class ZonaTematica {
    private String nombre;
    private String descripcion;
    private String color;

    public ArrayList<Espectaculo> espectaculo;
    public void agregarEsp(ArrayList<Espectaculo> esp){
        espectaculo = esp;
    }
    public ArrayList<Atraccion> atraccion;
    public void agregarAtrac(ArrayList<Atraccion> atrac){
        atraccion = atrac;
    }
    public ArrayList<Restaurante> restaurante;
    public void agregarRest(ArrayList<Restaurante> rest){
        restaurante = rest;
    }

    public ZonaTematica(String nombre, String descripcion, String color) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void imprimirZonaTematica(){
        System.out.println("Zona Tematica:");
        System.out.println("Nombre: "+getNombre());
        System.out.println("Descripcion: "+getDescripcion());
        System.out.println("Color: "+getColor());
    }
}

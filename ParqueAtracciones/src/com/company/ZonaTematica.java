package com.company;

import java.util.ArrayList;

public class ZonaTematica {
    private String nombre;
    private String descripcion;
    private String color;
    private ArrayList<Espectaculo> shows;
    private ArrayList<Atraccion> atraccions;
    private ArrayList<Restaurante> restaurants;

    //constructor 1. listas shows, atracc, restaurantes
    public ZonaTematica(String nombre, String descripcion, String color, ArrayList<Espectaculo> shows, ArrayList<Atraccion> atraccions, ArrayList<Restaurante> restaurants) throws InvalidParamException {
        validateZona(nombre, descripcion, color);
        if(shows==null) throw new InvalidParamException("shows no puede ser null");
        if(shows.isEmpty()) throw new InvalidParamException("lista show no puede estar vacia");
        this.shows = shows;
        if(atraccions==null) throw new InvalidParamException("Atracciones no puede ser null");
        if(atraccions.isEmpty()) throw new InvalidParamException("lista atracciones no puede estar vacia");
        this.atraccions = atraccions;
        if(restaurants==null) throw new InvalidParamException("Restaurantes no puede ser null");
        if(restaurants.isEmpty()) throw new InvalidParamException("lista restaurantes no puede estar vacia");
        this.restaurants = restaurants;
    }
    //constructor 2. solo con un show, atraccion y restaurante
    public ZonaTematica(String nombre, String descripcion, String color, Espectaculo shows, Atraccion atraccions, Restaurante restaurants) throws InvalidParamException {
        validateZona(nombre, descripcion, color);
        if(shows==null) throw new InvalidParamException("shows no puede ser null");
        this.shows = new ArrayList<>();
        this.shows.add(shows);
        if(atraccions==null) throw new InvalidParamException("Atracciones no puede ser null");
        this.atraccions = new ArrayList<>();
        this.atraccions.add(atraccions);
        if(restaurants==null) throw new InvalidParamException("Restaurantes no puede ser null");
        this.restaurants = new ArrayList<>();
        this.restaurants.add(restaurants);
    }

    private void validateZona(String nombre, String descripcion, String color) throws InvalidParamException {
        if(nombre ==null) throw new InvalidParamException("Nombre no puede ser null");
        this.nombre = nombre;
        if(descripcion ==null) throw new InvalidParamException("Descripcion no puede ser null");
        this.descripcion = descripcion;
        if(color ==null) throw new InvalidParamException("Color no puede ser null");
        this.color = color;
    }

    @Override
    public String toString() {
        return "ZonaTematica{" +
                "nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", color='" + color + '\'' +
                ", shows=" + shows +
                ", atraccions=" + atraccions +
                ", restaurants=" + restaurants +
                '}';
    }
}

package com.company;

import java.util.ArrayList;

public class Espectaculo {
    private String nombre;
    private String tipoEspectaculo;
    private Integer minutos;
    private ArrayList<Pase> pases;

    // constructor 1. 0 pases
    public Espectaculo(String nombre, String tipoEspectaculo, Integer minutos) throws InvalidParamException {
        validatePases(nombre, tipoEspectaculo, minutos);
    }
    // constructor 2. varios pases
    public Espectaculo(String nombre, String tipoEspectaculo, Integer minutos, ArrayList<Pase> pases) throws InvalidParamException {
        validatePases(nombre, tipoEspectaculo, minutos);
        if (pases != null) this.pases = pases;
    }
    // constructor 3. solo 1 pase
    public Espectaculo(String nombre, String tipoEspectaculo, Integer minutos, Pase pases) throws InvalidParamException {
        validatePases(nombre, tipoEspectaculo, minutos);
        this.pases = new ArrayList<>();
        if (pases != null) this.pases.add(pases);
    }

    private void validatePases(String nombre, String tipoEspectaculo, Integer minutos) throws InvalidParamException {
    if(nombre ==null) throw new InvalidParamException("Nombre no puede ser null");
    this.nombre = nombre;
    if(tipoEspectaculo == null) throw new InvalidParamException("Tipo de espectaculo no puede ser null");
    this.tipoEspectaculo = tipoEspectaculo;
    if (minutos <=0) throw new InvalidParamException("Minutos del espectaculo no pueden ser inferior o igual a 0");
    this.minutos = minutos;
    }

    @Override
    public String toString() {
        return "Espectaculo{" +
                "nombre='" + nombre + '\'' +
                ", tipoEspectaculo='" + tipoEspectaculo + '\'' +
                ", minutos=" + minutos +
                ", pases=" + pases +
                '}';
    }
}

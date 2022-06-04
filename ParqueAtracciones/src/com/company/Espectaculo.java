package com.company;

import java.util.ArrayList;

public class Espectaculo {
    private String nombre;
    private String tipoEspectaculo;
    private Integer minutos;
    public ArrayList<Pase> pases;
    public ZonaTematica zona;

    public Espectaculo(String nombre, String tipoEspectaculo, Integer minutos) throws Exception {
        if (minutos<=0) throw new Exception("error: los minutos del espectaculo no pueden ser inferior o igual a 0");
        this.nombre = nombre;
        this.tipoEspectaculo = tipoEspectaculo;
        this.minutos = minutos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoEspectaculo() {
        return tipoEspectaculo;
    }

    public void setTipoEspectaculo(String tipoEspectaculo) {
        this.tipoEspectaculo = tipoEspectaculo;
    }

    public Integer getMinutos() {
        return minutos;
    }

    public void setMinutos(Integer minutos) {
        this.minutos = minutos;
    }

    public void imprimirEspectaculo(){
        System.out.println("Espectaculo:");
        System.out.println("Nombre: "+getNombre());
        System.out.println("TipoEspectaculo: "+getTipoEspectaculo());
        System.out.println("Minutos: "+getMinutos()+"min");
    }
}

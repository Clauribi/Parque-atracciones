package com.company;

import java.util.*;

public class Pase {
    private String fecha;
    private double horaInicio;
    private double horaFin;
    public ArrayList<Entrada> entradaShow = new ArrayList();
    public Espectaculo show;

    public Pase(ArrayList<Entrada> entradaShow) {

        this.entradaShow = entradaShow;
    }

    public Pase(String fecha, double horaInicio, double horaFin) throws Exception {
        if (horaInicio>=horaFin) throw new Exception("La hora de inicio no puede ser superior a la hora fin");
        this.fecha = fecha;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(double horaInicio) {
        this.horaInicio = horaInicio;
    }

    public double getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(double horaFin) {
        this.horaFin = horaFin;
    }

    public void imprimirPase(){
        System.out.println("Pase:");
        System.out.println("Fecha: "+ getFecha());
        System.out.println("Hora inicio: " +getHoraInicio());
        System.out.println("Hora fin: " +getHoraFin());
    }
}

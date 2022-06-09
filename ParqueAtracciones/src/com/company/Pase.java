package com.company;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;

public class Pase {
    private LocalDate fecha;
    private LocalTime horaInicio;
    private LocalTime horaFin;
    private ArrayList<Entrada> entradaShow;
    // constructor 1. lista de entradas
    public Pase(LocalDate fecha, LocalTime horaInicio, LocalTime horaFin, ArrayList<Entrada> entradaShow) throws InvalidParamException {
        validateEntradas(fecha, horaInicio, horaFin);
        if (entradaShow==null) throw new InvalidParamException("Entrada no puede ser null");
        if (entradaShow.isEmpty()) throw new InvalidParamException("Entrada no puede estar vacia. min.1");
        this.entradaShow = entradaShow;
    }
    //constructor 2. solo una entrada
    public Pase(LocalDate fecha, LocalTime horaInicio, LocalTime horaFin) throws InvalidParamException {
        validateEntradas(fecha, horaInicio, horaFin);
        if (entradaShow==null) throw new InvalidParamException("Entrada no puede ser null");
        this.entradaShow = new ArrayList<>();
        this.entradaShow.add(entradaShow);
    }
    private void validateEntradas(LocalDate fecha, LocalTime horaInicio, LocalTime horaFin) throws InvalidParamException {
        if(fecha ==null) throw new InvalidParamException("Fecha no puede ser null");
        this.fecha = fecha;
        if(horaInicio ==null) throw new InvalidParamException("Hora inicio no puede ser null");
        this.horaInicio = horaInicio;
        if (horaInicio.isAfter(horaFin)) throw new InvalidParamException("hora inicio no puede ser sup a hora fin");
        if(horaFin ==null) throw new InvalidParamException("Hora fin no puede ser null");
        this.horaFin = horaFin;
    }

    @Override
    public String toString() {
        return "Pase{" +
                "fecha=" + fecha +
                ", horaInicio=" + horaInicio +
                ", horaFin=" + horaFin +
                ", entradaShow=" + entradaShow +
                '}';
    }
}


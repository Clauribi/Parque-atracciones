package com.company;

import java.time.LocalDate;
import java.util.*;

public class Ticket {
    private LocalDate fecha;
    private Float precio;
    private ArrayList<Entrada> entradaShow;

    //constructor 1. sin entrada
    public Ticket(LocalDate fecha, Float precio) throws InvalidParamException {
        validateTicket(fecha, precio);
    }
    //constructor 2. con una entrada
    public Ticket(LocalDate fecha, Float precio, Entrada entradaShow) throws InvalidParamException {
        validateTicket(fecha, precio);
        this.entradaShow = new ArrayList<>();
        if(entradaShow!= null) this.entradaShow.add(entradaShow);
    }
    // constructor 3. varias entradas
    public Ticket(LocalDate fecha, Float precio, ArrayList<Entrada> entradaShow) throws InvalidParamException {
        validateTicket(fecha, precio);
        if (entradaShow != null) this.entradaShow = entradaShow;
    }
    private void validateTicket(LocalDate fecha, Float precio) throws InvalidParamException {
        if (fecha ==null) throw new InvalidParamException("Fecha no puede ser null");
        this.fecha = fecha;
        if (precio <=0) throw new InvalidParamException("error: el precio no puede ser inferior o igual a 0");
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "fecha=" + fecha +
                ", precio=" + precio +
                ", entradaShow=" + entradaShow +
                '}';
    }
}

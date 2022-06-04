package com.company;

import java.util.*;

public class Ticket {
    private String fecha;
    private Float precio;
    public Cliente comprador;
    public ArrayList<Entrada> entradaShow;

    public Ticket(String fecha, Float precio) throws Exception {
        if (precio<=0) throw new Exception("error: el precio no puede ser inferior o igual a 0");
        this.fecha = fecha;
        this.precio = precio;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }
    public void imprimirTicket(){
        System.out.println("Ticket parque de atracciones");
        System.out.println("Fecha: " +getFecha());
        System.out.println("Precio: " +getPrecio()+"€");
    }
}

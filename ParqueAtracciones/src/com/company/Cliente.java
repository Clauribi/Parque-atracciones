package com.company;
import java.util.*;

public class Cliente {
    private String nombre;
    private String apellidos;
    public ArrayList<Ticket> tickets;

    public Cliente(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;

    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public ArrayList<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(ArrayList<Ticket> tickets) {
        this.tickets = tickets;
    }

    public void imprimirCliente() {
        System.out.println("Cliente:");
        System.out.println("Nombre: "+getNombre());
        System.out.println("Apellidos: "+getApellidos());

    }



}

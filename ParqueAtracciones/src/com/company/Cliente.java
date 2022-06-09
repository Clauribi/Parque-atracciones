package com.company;
import java.util.*;

    public class Cliente {
        private String nombre;
        private String apellidos;
        private ArrayList<Ticket> tickets;

    //constructor 1. varios tickets
    public Cliente(String nombre, String apellidos, ArrayList<Ticket> tickets) throws InvalidParamException {
        validateCliente(nombre, apellidos);
        if(tickets==null) throw new InvalidParamException("tickets no puede ser null");
        if (tickets.isEmpty()) throw new InvalidParamException("lista tickets no puede estar vacia.min 1");
        this.tickets = tickets;
        }
    //constructor 2. solo un ticket
    public Cliente(String nombre, String apellidos, Ticket tickets) throws InvalidParamException {
        validateCliente(nombre, apellidos);
        if (tickets == null) throw new InvalidParamException("tickets no puede ser null");
        this.tickets = new ArrayList<>();
        this.tickets.add(tickets);
    }
    private void validateCliente(String nombre, String apellidos) throws InvalidParamException {
        if (nombre ==null) throw new InvalidParamException("Nombre no puede ser null");
        this.nombre = nombre;
        if (apellidos ==null) throw new InvalidParamException("Apellidos no puede ser null");
        this.apellidos = apellidos;
    }

        @Override
        public String toString() {
            return "Cliente{" +
                    "nombre='" + nombre + '\'' +
                    ", apellidos='" + apellidos + '\'' +
                    ", tickets=" + tickets +
                    '}';
        }
    }








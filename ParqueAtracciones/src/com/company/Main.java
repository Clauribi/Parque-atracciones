package com.company;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) throws Exception {
    Cliente cliente1 = new Cliente("Antonio", "Lopez Ramito");
    cliente1.imprimirCliente();
    System.out.println();
    ArrayList<Ticket> tickets = new ArrayList();
    tickets.add(new Ticket("06/06/2022", 30.50f));
    tickets.add(new Ticket("07/06/2022", 30.50f));
    for (Ticket e: tickets){
        e.imprimirTicket();
    }
    System.out.println();
    ArrayList<Entrada> entradas = new ArrayList<>();
    entradas.add(new Entrada(1, 4.95f, "vendida"));
    entradas.add(new Entrada(2,10.95f,"vendida"));
    for (Entrada e: entradas){
        e.imprimirEntrada();
    }
    System.out.println();
    ArrayList<Pase> pases = new ArrayList<>();
    pases.add(new Pase("06/06/2022",12.00,13.00));
    pases.add(new Pase("07/06/2022",13.00,14.00));
    for (Pase e: pases){
        e.imprimirPase();
    }
    System.out.println();
    ZonaTematica zona1 = new ZonaTematica("Circo", "el circo de animales y payasos", "multicolor");
    zona1.imprimirZonaTematica();
    System.out.println();
    ArrayList<Espectaculo> shows = new ArrayList<>();
    shows.add(new Espectaculo("circo del sol","musical",60));
    for (Espectaculo e: shows){
        e.imprimirEspectaculo();
    }
    System.out.println();
    ArrayList<Atraccion> atracciones = new ArrayList<>();
    atracciones.add(new Atraccion("el canguro loco",135, 200, 10));
    atracciones.add(new Atraccion("la noria",150,100,15));
    for (Atraccion e: atracciones){
        e.imprimirAtraccion();
    }
    System.out.println();
    ArrayList<Restaurante> restaurantes = new ArrayList<>();
    restaurantes.add(new Restaurante("Burger","10.00-23.00", 20f));
    restaurantes.add(new Restaurante("Deluxe","10.00-22.00",30f));
    for (Restaurante e: restaurantes) {
        e.imprimirRestaurante();
    }
    }
}

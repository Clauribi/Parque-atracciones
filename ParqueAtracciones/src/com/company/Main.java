package com.company;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) throws InvalidParamException {
    Cliente client1 = new Cliente("Antonio","Garcia Lopez",new Ticket(LocalDate.now(),25.5f,
            new Entrada(15,5.5f,"disponible")));
        System.out.println(client1);
    ZonaTematica capitalFest = new ZonaTematica("capitalFest","es un festival de musica indie pop","naranja",
            new  ArrayList<>(){{add(new Espectaculo("Izal","concierto",120))
            ;add(new Espectaculo("Lori Meyers","concierto",120,new Pase(LocalDate.now(),
                    LocalTime.of(12,00),LocalTime.of(13,00))));}},
            new ArrayList<>(){{add(new Atraccion("Espuma",135,20,60))
            ;add(new Atraccion("Agua",150,20,60));}},
            new ArrayList<>(){{add(new Restaurante("BenditaBurguer","12.00-17.00",20.5f))
    ;add(new Restaurante("koi","13.00-20.00",15.95f));}});
        System.out.println(capitalFest);




    }
}

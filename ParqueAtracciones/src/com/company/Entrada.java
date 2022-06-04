package com.company;

public class Entrada {
    private Integer asiento;
    private Float precio;
    private String estado;
    public Ticket ticket;
    public Pase pase;

    public Entrada(Integer asiento, Float precio, String estado) throws Exception {
    if (estado != "disponible"&& estado != "vendida") throw new Exception("No existe el estado " + estado);
    if (precio<=0) throw new Exception("error: el precio no puede ser inferior o igual a 0");
    this.asiento = asiento;
    this.precio = precio;
    this.estado = estado;
    }

    public Integer getAsiento() {
        return asiento;
    }

    public void setAsiento(Integer asiento) {
        this.asiento = asiento;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    public void imprimirEntrada(){
        System.out.println("Entrada Show:");
        System.out.println("Asiento:"+getAsiento());
        System.out.println("Precio:"+getPrecio()+"€");
        System.out.println("Estado:"+getEstado());

    }
}

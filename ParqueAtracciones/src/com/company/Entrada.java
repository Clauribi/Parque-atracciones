package com.company;

public class Entrada {
    private Integer asiento;
    private Float precio;
    private String estado;

    public Entrada(Integer asiento, Float precio, String estado) throws InvalidParamException {
    if (asiento <=0) throw new InvalidParamException("Asiento no puede ser inferior o igual a 0");
    this.asiento = asiento;
    if (precio <=0) throw new InvalidParamException("Precio no puede ser inferior o igual a 0");
    this.precio = precio;
    if ((!estado.equals("disponible"))&& (!estado.equals("vendida"))) throw new InvalidParamException("No existe el estado " + estado);
    this.estado = estado;
}
    @Override
    public String toString() {
        return "Entrada{" +
                "asiento=" + asiento +
                ", precio=" + precio +
                ", estado='" + estado + '\'' +
                '}';
    }
}


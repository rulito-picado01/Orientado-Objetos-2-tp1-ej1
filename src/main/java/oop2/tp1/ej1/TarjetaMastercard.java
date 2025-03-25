package oop2.tp1.ej1;

import java.util.Map;

public class TarjetaMastercard implements Tarjeta {

    @Override
    public double calcularDescuento(Map<String, Integer> costo) {
        return costo.get("platos") * 0.02;
    }
}

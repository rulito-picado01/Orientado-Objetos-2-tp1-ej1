package oop2.tp1.ej1;

import java.util.Map;

public class TarjetaVisa implements Tarjeta {

    @Override
    public double calcularDescuento(Map<String, Integer> costo) {
        return costo.get("bebidas") * 0.03;
    }
}

package oop2.tp1.ej1;

import java.util.Map;

public class Pago {
    private Pedido pedido;
    private Tarjeta tarjeta;
    private double propina;

    public Pago(Pedido pedido, Tarjeta tarjeta, int propina) {
        this.pedido = pedido;
        this.tarjeta = tarjeta;
        this.propina = propina / 100.0;
    }

    public double calcularTotal(Menu menu) {
        Map<String, Integer> costo = pedido.calcularCosto(menu);
        double descuento = tarjeta.calcularDescuento(costo);
        double subtotal = costo.get("bebidas") + costo.get("platos") - descuento;
        return Math.round(subtotal * (1 + propina) * 100.0) / 100.0;
    }
}


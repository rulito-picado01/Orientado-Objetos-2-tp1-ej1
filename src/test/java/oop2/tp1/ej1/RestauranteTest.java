package oop2.tp1.ej1;

public class RestauranteTest {
    public static void main(String[] args) {
        Menu menu = new Menu();
        Mesa mesa1 = new Mesa(1);
        Pedido pedido = new Pedido(mesa1.getId());
        mesa1.asignarPedido(pedido);

        pedido.agregarItem("bebidas", "coca-cola", 2, menu);
        pedido.agregarItem("platos", "hamburguesa", 1, menu);
        pedido.confirmarPedido();

        Pago pagoVisa = new Pago(pedido, new TarjetaVisa(), 5);
        System.out.println("Total con Visa: " + pagoVisa.calcularTotal(menu));

        Pago pagoMastercard = new Pago(pedido, new TarjetaMastercard(), 5);
        System.out.println("Total con Mastercard: " + pagoMastercard.calcularTotal(menu));

        Pago pagoComarca = new Pago(pedido, new TarjetaComarcaPlus(), 5);
        System.out.println("Total con Comarca Plus: " + pagoComarca.calcularTotal(menu));

        Pago pagoViedma = new Pago(pedido, new TarjetaGenerica(), 5);
        System.out.println("Total con Viedma: " + pagoViedma.calcularTotal(menu));
    }
}

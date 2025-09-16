
package comdiegocano.pruebaconcepto;


// src/app/MainApp.java
public class MainApp {
    public static void main(String[] args) {
        System.out.println("=== ERP IntegraMet - PoC ===");

        // Pedido 1
        Cliente cliente1 = new Cliente(1, "Emily Chen", "XAXX010101000", "Calle Por ahi 123");
        Pedido pedido1 = new Pedido(101, cliente1, "2025-09-14", "Pendiente", 2500.50);

        // Pedido 2
        Cliente cliente2 = new Cliente(2, "David López", "LOPD850101AAA", "Av. Tal 45");
        Pedido pedido2 = new Pedido(102, cliente2, "2025-09-14", "Pendiente", 7800.00);

        // Pedido 3
        Cliente cliente3 = new Cliente(3, "Maria Rodriguez", "RODM700101BBB", "Calle Central 50");
        Pedido pedido3 = new Pedido(103, cliente3, "2025-09-14", "Pendiente", 12000.75);

        // Pedido 4
        Cliente cliente4 = new Cliente(4, "Juan Lerdo", "LERJ900101CCC", "Av. Quien sabe 202");
        Pedido pedido4 = new Pedido(104, cliente4, "2025-09-14", "Pendiente", 3400.99);

        // Pedido 5
        Cliente cliente5 = new Cliente(5, "Proveedor X", "PRVX950101DDD", "Parque Industrial 77");
        Pedido pedido5 = new Pedido(105, cliente5, "2025-09-14", "Pendiente", 15600.20);

        // Simulación de la capa de negocio
        GestionPedidos gestionPedidos = new GestionPedidos();
        gestionPedidos.procesarPedido(pedido1);
        gestionPedidos.procesarPedido(pedido2);
        gestionPedidos.procesarPedido(pedido3);
        gestionPedidos.procesarPedido(pedido4);
        gestionPedidos.procesarPedido(pedido5);
    }
}


package comdiegocano.pruebaconcepto;


// src/infrastructure/PedidoRepositorio.java
public class PedidoRepositorio {
    public void guardarPedido(Pedido pedido) {
        System.out.println("[Datos] Insertando pedido en la base de datos (simulado con MySQL)...");
        System.out.println("[Datos] Pedido de " + pedido.getCliente().getNombre() + " guardado correctamente.");
    }
}

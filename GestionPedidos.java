
package comdiegocano.pruebaconcepto;

// src/service/GestionPedidosService.java
public class GestionPedidos {
    private PedidoRepositorio pedidoRepositorio = new PedidoRepositorio();

    public void procesarPedido(Pedido pedido) {
        System.out.println("[Negocio] Procesando pedido de: " + pedido.getCliente().getNombre());
        System.out.println("[Negocio] Total del pedido: $" + pedido.getTotal());

        //Simulación de guardar en la base de datos
        pedidoRepositorio.guardarPedido(pedido);

        
        System.out.println("[Negocio] Pedido enviado a producción...");
    }
}

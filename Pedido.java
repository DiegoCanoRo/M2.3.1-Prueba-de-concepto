
package comdiegocano.pruebaconcepto;


// src/domain/Pedido.java
public class Pedido {
    private int idPedido;
    private Cliente cliente;
    private String fecha;
    private String estado;
    private double total;

    public Pedido(int idPedido, Cliente cliente, String fecha, String estado, double total) {
        this.idPedido = idPedido;
        this.cliente = cliente;
        this.fecha = fecha;
        this.estado = estado;
        this.total = total;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public double getTotal() {
        return total;
    }
}

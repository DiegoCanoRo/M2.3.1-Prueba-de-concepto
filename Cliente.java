
package comdiegocano.pruebaconcepto;

// src/domain/Cliente.java
public class Cliente {
    private int idCliente;
    private String nombre;
    private String rfc;
    private String direccion;

    public Cliente(int idCliente, String nombre, String rfc, String direccion) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.rfc = rfc;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }
}

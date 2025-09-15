# M2.3.1-Prueba-de-concepto
### Diagrama de Clases
```plantuml
@startuml
class MainApp {
    +main(String[] args)
}

class Cliente {
    -int idCliente
    -String nombre
    -String rfc
    -String direccion
    +Cliente(int, String, String, String)
    +getNombre() : String
}

class Pedido {
    -int idPedido
    -Cliente cliente
    -String fecha
    -String estado
    -double total
    +Pedido(int, Cliente, String, String, double)
    +getCliente() : Cliente
    +getTotal() : double
}

class GestionPedidos {
    -PedidoRepository pedidoRepository
    +procesarPedido(Pedido)
}

class PedidoRepository {
    +guardarPedido(Pedido)
}

MainApp --> Cliente
MainApp --> Pedido
MainApp --> GestionPedidos
GestionPedidos --> PedidoRepository
Pedido --> Cliente
@enduml

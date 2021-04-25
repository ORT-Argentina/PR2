package ar.edu.ort.implementacion.soporte;

import ar.edu.ort.base.IPrecio;
import ar.edu.ort.implementacion.ProductoCompuesto;
import ar.edu.ort.implementacion.ProductoPeso;
import ar.edu.ort.implementacion.ProductoUnitario;

public class Pedido extends ProductoCompuesto {

    private String cliente;

    /**
     * Constructor parametrizado de un pedido.
     *
     * @param cliente String nombre del cliente.
     */
    public Pedido(String cliente) {
        super();
        this.cliente = cliente;
    }

    /**
     * Getter del cliente.
     *
     * @return String nombre del cliente.
     */
    public String getCliente() {
        return cliente;
    }

    /**
     * Setter del cliente.
     *
     * @param cliente String nombre del cliente.
     */
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    /**
     * Metodo para añadir un producto al pedido.
     *
     * @param producto IPrecio objeto a añadir que implementa esa interfaz.
     */
    @Override
    public void addProducto(IPrecio producto) {
        super.addProducto(producto);
    }

    /**
     * Metodo para eliminar un producto del pedido.
     *
     * @param producto IPrecio objeto a eliminar que implementa esa interfaz.
     */
    @Override
    public void removeProducto(IPrecio producto) {
        super.removeProducto(producto);
    }

    /**
     * Metodo que nos sirve para fijar el numero de unidades de un
     * ProductoUnitario de nuestro pedido.
     *
     * @param producto ProductoUnitario que se desea establecer la cantidad.
     * @param cantidadFinal int numero de unidades finales que se desean.
     */
    public void estableceCantidad(IPrecio producto, int cantidadFinal) {
        if (producto instanceof ProductoUnitario) {
            ((ProductoUnitario) super.getProductos().get(super.getProductos().indexOf(producto))).setCantidad(cantidadFinal);
        }
    }

    /**
     * Metodo que establece el peso final de un ProductoPeso.
     *
     * @param producto ProductoPeso a establecer el peso final.
     * @param pesoFinal double peso final del producto.
     */
    public void establecePeso(IPrecio producto, double pesoFinal) {
        if (producto instanceof ProductoPeso) {
            ((ProductoPeso) super.getProductos().get(super.getProductos().indexOf(producto))).setPeso(pesoFinal);
        }
    }
}

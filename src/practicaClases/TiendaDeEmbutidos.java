package practicaClases;

import java.util.ArrayList;
import java.util.List;

/*7)* Crear una clase para gestionar una tienda de embutidos.
    · La tienda vende salchichones, chorizos y morcillas, de los cuales tiene una
    cantidad en la tienda para ir vendiendo.
    · La tienda podrá hacer ventas, para lo que habrá que indicar qué se vende
    y la cantidad que se va a vender.
    · En cada venta se podrán vender varios tipos de productos, cada uno con
    una cantidad asociada, pero no se podrá repetir en la misma venta más de una vez el mismo producto.
    · Por ejemplo se podrá hacer una venta de 3 salchichones. Otra venta podrían ser
     2 salchichones, 5 chorizos y 1 morcilla, pero no puede venderse
     1 salchichon, 1 salchichon, 2 morcillas.
    · Cuando se haga una venta, se actualizará el stock de cada embutido.
    · Si al ir a hacer una venta, no hubiera cantidad suficiente de algún producto,
     esta no se podrá hacer y se indicará por pantalla.
    · No hace falta guardar las ventas en sí, solo hay que ir actualizando
    la cantidad si y solo si toda la venta se puede hacer.
    · Por último, la tienda podrá consultar las cantidades de cada producto, para
    ello podrá llamar a una función que muestre las cantidades restantes
    todas a la vez.
    EXTRA · Usar un objeto para encapsular la venta y/o producto.*/


// --- CLASE PRODUCTO ---
// Esta clase representa un tipo de embutido y su cantidad.
class Producto {
    String nombre;
    int cantidad;

    public Producto(String nombre, int cantidad) {
        this.nombre = nombre.toLowerCase(); // Lo pasamos a minúsculas para comparar fácil
        this.cantidad = cantidad;
    }
}

// --- CLASE VENTA ---
// Encapsula los productos que un cliente quiere comprar.
class Venta {
    List<Producto> listaProductos = new ArrayList<>();

    public void agregarProducto(String nombre, int cantidad) {
        // Corrección: Comprobar si el producto ya está en la lista para no repetir.
        for (Producto p : listaProductos) {
            if (p.nombre.equals(nombre.toLowerCase())) {
                System.out.println("Error: No puedes añadir '" + nombre + "' dos veces a la misma venta.");
                return;
            }
        }
        listaProductos.add(new Producto(nombre, cantidad));
    }
}

// --- CLASE TIENDA ---
public class TiendaDeEmbutidos {
    int stockSalchichones;
    int stockChorizos;
    int stockMorcillas;

    public TiendaDeEmbutidos(int s, int c, int m) {
        this.stockSalchichones = s;
        this.stockChorizos = c;
        this.stockMorcillas = m;
    }

    public void realizarVenta(Venta venta) {
        boolean sePuedeVender = true;

        // PASO 1: Comprobar si hay stock de T0DO antes de tocar nada.
        for (Producto p : venta.listaProductos) {
            if (p.nombre.equals("salchichon") && p.cantidad > stockSalchichones) sePuedeVender = false;
            if (p.nombre.equals("chorizo") && p.cantidad > stockChorizos) sePuedeVender = false;
            if (p.nombre.equals("morcilla") && p.cantidad > stockMorcillas) sePuedeVender = false;
        }

        // PASO 2: Si t0do está OK, restamos el stock.
        if (sePuedeVender) {
            for (Producto p : venta.listaProductos) {
                if (p.nombre.equals("salchichon")) stockSalchichones -= p.cantidad;
                if (p.nombre.equals("chorizo")) stockChorizos -= p.cantidad;
                if (p.nombre.equals("morcilla")) stockMorcillas -= p.cantidad;
            }
            System.out.println("¡Venta realizada con éxito!");
        } else {
            System.out.println("Error: No hay stock suficiente para completar toda la venta.");
        }
    }

    public void stockEmbutidos() {
        System.out.println("\n--- ESTADO DEL INVENTARIO ---");
        System.out.println("* Salchichones: " + stockSalchichones);
        System.out.println("* Chorizos: " + stockChorizos);
        System.out.println("* Morcillas: " + stockMorcillas);
        System.out.println("-----------------------------\n");
    }
}
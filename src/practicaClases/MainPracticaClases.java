package practicaClases;

import java.util.ArrayList;

public class MainPracticaClases {
    public static void main(String[] args) {
        System.out.println("En MainPracticaClases");

        // Creamos el objeto
        SoccerTeam miEquipo = new SoccerTeam("Real Madrid", "Courtois", "Rüdiger",
                "Bellingham", "Mbappé", true, true, 1902);

        // Llamamos al mét0do para que nos muestre t0do bonito
        miEquipo.showTeamData();

//----------------------------------------------------------------------------------------------------------------------
          // Creamos a los Jedi usando el constructor
        Jedi jedi1 = new Jedi("Luke Skywalker", "azul");
        Jedi jedi2 = new Jedi("Mace Windu", "morado");
        Jedi jedi3 = new Jedi("Yoda", "verde");
        Jedi jedi4 = new Jedi("Qui-Gon Jinn", "verde");
        Jedi jedi5 = new Jedi("Obi Wan Kenobi", "azul");

        // Usamos el mét0do showInfo para cada uno
        jedi1.showInfo();
        jedi2.showInfo();
        jedi3.showInfo();
        jedi4.showInfo();
        jedi5.showInfo();
//----------------------------------------------------------------------------------------------------------------------
Molometro miMolometro = new Molometro();
        System.out.println(miMolometro.molaONoMola());
        miMolometro.mola();
        miMolometro.mola();
        System.out.println(miMolometro.molaONoMola());
        miMolometro.noMola();
        miMolometro.noMola();
        miMolometro.noMola();
        miMolometro.noMola();
        miMolometro.noMola();
        System.out.println(miMolometro.molaONoMola());
//----------------------------------------------------------------------------------------------------------------------
        // Creamos un grifo con 2 litros
        Grifo3000 miGrifo = new Grifo3000(2);

        // Intento 1: Abrir sin abrir la válvula
        miGrifo.abrirGrifo();

        // Abrimos válvula y gastamos agua
        miGrifo.cambiarValvula(true);
        miGrifo.abrirGrifo(); // Gasta 1 litro (queda 1)
        miGrifo.abrirGrifo(); // Gasta 1 litro (queda 0)

        // Intento 2: Abrir cuando ya no queda agua
        miGrifo.abrirGrifo();

//----------------------------------------------------------------------------------------------------------------------
        Puerta miPuerta = new Puerta();

        // Probamos a abrirla dos veces
        miPuerta.abrir();
        miPuerta.abrir(); // Aquí debería avisar que ya está abierta

        // Preguntamos cómo está
        String respuesta = miPuerta.consultarEstado();
        System.out.println(respuesta);

        // La cerramos
        miPuerta.cerrar();
        miPuerta.cerrar(); // Aquí debería avisar que ya está cerrada

//----------------------------------------------------------------------------------------------------------------------
        ConsomeDePollo miCaldo = new ConsomeDePollo(3); // Se crea sabiendo que a los 3 tiene sustancia

        System.out.println(miCaldo.getReceta());

        miCaldo.añadirIngrediente("Pollo");
        miCaldo.añadirIngrediente("Sal");
        miCaldo.añadirIngrediente("Agua"); // Aquí llega a 3 ingredientes

        System.out.println(miCaldo.getReceta()); // Debería decir que ya tiene sustancia

//----------------------------------------------------------------------------------------------------------------------
        TiendaDeEmbutidos miTienda = new TiendaDeEmbutidos(10, 10, 10);

        // Ejemplo: Intentar vender algo que sí hay
        Venta ventaValida = new Venta();
        ventaValida.agregarProducto("salchichon", 2);
        ventaValida.agregarProducto("chorizo", 5);
        miTienda.realizarVenta(ventaValida);

        // Ejemplo: Intentar vender algo que NO hay (debería fallar toda la venta)
        Venta ventaInvalida = new Venta();
        ventaInvalida.agregarProducto("morcilla", 15); // No hay tantas
        miTienda.realizarVenta(ventaInvalida);

        miTienda.stockEmbutidos();

//----------------------------------------------------------------------------------------------------------------------
        JuegoBolos juegoBolos = new JuegoBolos();
        juegoBolos.nuevoJuego();
//----------------------------------------------------------------------------------------------------------------------
        System.out.println("\n");
        System.out.println("=== INICIO DE PRUEBAS DE SISTEMA (FRIGORIFICO) ===\n");

        // 1. Setup inicial
        Frigorifico frigo = new Frigorifico("IceMaster-3000", 5.0, 2.0, 12.0, 2);

        // 2. Pruebas de temperatura
        frigo.ajustarTemperatura(15.0); // Debería fallar
        frigo.ajustarTemperatura(3.0);  // Debería funcionar

        // 3. Gestión de bandejas
        Bandeja b1 = new Bandeja("Frutas", 3, 5.0, TipoAlimento.CARNE);
        Bandeja b2 = new Bandeja("Carnicería", 5, 10.0, TipoAlimento.VERDURA);

        frigo.añadirBandeja(b1);
        frigo.añadirBandeja(b2);
        frigo.añadirBandeja(new Bandeja("Sobra", 1, 1, null)); // Debería fallar por capacidad de frigo

        // 4. Llenado y validaciones
        Bandeja t1 = frigo.buscarBandeja("Lácteos");
        if (t1 != null) {
            t1.añadirAlimento(new Alimento("Naranja", TipoAlimento.FRUTA, 3.000));
            t1.añadirAlimento(new Alimento("Cheddar", TipoAlimento.QUESO, 0.400));
            t1.añadirAlimento(new Alimento("Filete", TipoAlimento.CARNE, 0.500)); // Debería fallar (tipo prohibido)
        }

        // 5. Lista de la compra
        ListaCompra miCompra = new ListaCompra();
        miCompra.definirRequisito("Cheddar", 1, 3.60); // Tengo 1, faltan 3
        miCompra.definirRequisito("Leche", 6, 1.10);  // Tengo 0, faltan 6
        frigo.analizarNecesidades(miCompra);

        // 6. Prueba de caducidad por calor
        frigo.ajustarTemperatura(10.0); // Esto activará la caducidad del Queso (Embutido)
        frigo.listarBandejas();
        frigo.listarContenidoTotal();

        System.out.println("\n=== FIN DE PRUEBAS ===");

        //----------------------------------------------------------------------------------------------------------------------

    }
}
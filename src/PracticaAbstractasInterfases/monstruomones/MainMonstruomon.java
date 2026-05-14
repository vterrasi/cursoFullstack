package practicaAbstractasInterfases.monstruomones;

import java.util.List;
import java.util.Arrays;
import java.util.Scanner;

public class MainMonstruomon {
    public static void main(String[] args) {
        // 1. CREAMOS LOS ATAQUES (usando los datos de tu lista)
        // Agua
        Ataque chorroAgua = new Ataque("Chorro de Agua", "agua", "Un disparo a presión que empapa al rival.",10, -1);
        Ataque olaGigante = new Ataque("Ola Gigante", "agua", "Una masa de agua enorme que aplasta todo a su paso.",50, 2); // Extra: uso limitado

        // Fuego
        Ataque llamarada = new Ataque("Llamarada", "fuego", "Una gran lengua de fuego que lo quema todo.",40, 3);
        Ataque chispaInf = new Ataque("Chispa Infernal", "fuego", "Pequeñas brasas que saltan y queman la piel del enemigo.",10, -1);

        // Rayo
        Ataque chispazo = new Ataque("Chispazo", "rayo", "Una descarga eléctrica rápida que salta entre las manos.",12, -1);
        Ataque trueno = new Ataque("Trueno", "rayo", "Un rayo que cae del cielo con un estruendo ensordecedor.",45, 2);

        // Tierra
        Ataque terremoto = new Ataque("Terremoto", "tierra", "El suelo tiembla con fuerza, haciendo que el rival pierda el equilibrio.",52, 1);
        Ataque muroBarro = new Ataque("Muro de Barro", "tierra", "Una ola de lodo pesado que cae encima del enemigo.",15, -1);

        // Neutral
        Ataque placaje = new Ataque("Placaje", "neutral", "Un golpe con todo el cuerpo, sencillo pero efectivo.", 32, -1);
        Ataque mordisco = new Ataque("Mordisco", "neutral", "Un ataque físico usando los dientes para hacer daño directo.", 22, -1);
        Ataque aranazo = new Ataque("Arañazo", "neutral", "Un golpe rápido con las garras que marca al enemigo.", 12, -1);

        // 2. CREAMOS LOS MONSTRUOMONES (Instanciando las clases hijas)
        // Elegimos 5 representantes icónicos de tu lista
        Monstruomon aquadino = new MonstruomonAgua("Aquadino", 100, 20, 15);
        Monstruomon flamerion = new MonstruomonFuego("Flamerion", 90, 35, 5);
        Monstruomon voltioRat = new MonstruomonRayo("Voltio-Rat", 75, 40, 5);
        Monstruomon rocosaurio = new MonstruomonTierra("Rocosaurio", 140, 18, 22);
        Monstruomon normalin = new MonstruomonNeutral("Normalín", 100, 20, 20);

        // 3. ASIGNAMOS ATAQUES (Repartiendo la estrategia)
        aquadino.getAtaques().addAll(Arrays.asList(chorroAgua, olaGigante, placaje));
        flamerion.getAtaques().addAll(Arrays.asList(llamarada, chispaInf, mordisco));
        voltioRat.getAtaques().addAll(Arrays.asList(chispazo, trueno, placaje));
        rocosaurio.getAtaques().addAll(Arrays.asList(terremoto, muroBarro, mordisco));
        normalin.getAtaques().addAll(Arrays.asList(aranazo, placaje, mordisco));

        //Un pequeño empujón final (El Menú de Selección)
        //(Aquí ya es la parte en que me ofrece el menú de selección (while))

// --- PASO 4: INTERACCIÓN CON EL USUARIO (Velia) ---
        Scanner sc = new Scanner(System.in);
        System.out.println("--- 🐉 BIENVENIDX A MONSTRUOMON 🐉 ---");
        System.out.println("Velia, elige a tu primer compañero:");
        System.out.println("1. Aquadino 💧 | 2. Voltio-Rat ⚡⚡ | 3. Flamerion 🔥 | 4. Rocosaurio 🪨 | 5. Normalín 🙂");

        int eleccion = sc.nextInt();

        // Ahora el switch sí sabe quiénes son 'aquadino' y 'voltioRat' porque ya existen arriba
        Monstruomon miPrimerMonstruo = switch(eleccion) {
            case 1 -> aquadino;
            case 2 -> voltioRat;
            case 3 -> flamerion;
            case 4 -> rocosaurio;
            default -> normalin;
        };

        System.out.println("¡Has elegido a " + miPrimerMonstruo.getNombre() + "!");

        // --- PASO 5: CONFIGURAR EQUIPOS Y COMBATE ---
        MaestroMonstruomon maestroJugador = new MaestroMonstruomon("Velia");
        maestroJugador.capturar(miPrimerMonstruo); // Capturamos el que elegiste

        MaestroMonstruomon maestroRival = new MaestroMonstruomon("PC Pro");
        List<Monstruomon> bolsaRivales = Arrays.asList(flamerion, aquadino, voltioRat, rocosaurio, normalin);
        int indiceAzar = (int) (Math.random() * bolsaRivales.size());
        Monstruomon rivalElegido = bolsaRivales.get(indiceAzar);

        maestroRival.capturar(rivalElegido);
        Combate combate = new Combate(maestroJugador.getEquipo().get(0), rivalElegido);

        combate.iniciar();
        combate.finalizarCombate(); // Para ver esas estadísticas tan chulas 🌟
    }
}

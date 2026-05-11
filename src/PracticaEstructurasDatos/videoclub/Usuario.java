package PracticaEstructurasDatos.videoclub;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nombre;
    private String contrasena;
    private boolean esAdmin;
    private List<Alquiler> misAlquileres;

    public Usuario(String nombre, String contrasena, boolean esAdmin) {
        this.nombre = nombre;
        this.contrasena = contrasena;
        this.esAdmin = esAdmin;
        this.misAlquileres = new ArrayList<>();
    }

    public String getNombre() { return nombre; }
    public String getContrasena() { return contrasena; }
    public boolean esAdmin() { return esAdmin; }
    public List<Alquiler> getMisAlquileres() { return misAlquileres; }
    public void agregarAlquiler(Alquiler a) { misAlquileres.add(a); }
}
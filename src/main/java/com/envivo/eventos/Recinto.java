package com.envivo.eventos;

import java.util.ArrayList;
import java.util.List;

public class Recinto {
    private final String id;
    private final String nombre;
    private final String direccion;
    private final List<Seccion> secciones = new ArrayList<>();

    public Recinto(String id, String nombre, String direccion) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public void agregarSeccion(Seccion s) { secciones.add(s); }

    public List<Seccion> getSecciones() { return List.copyOf(secciones); }

    public String getId() { return id; }
    public String getNombre() { return nombre; }
    public String getDireccion() { return direccion; }
}

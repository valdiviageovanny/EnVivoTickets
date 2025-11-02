package com.envivo.eventos;

import java.util.ArrayList;
import java.util.List;
import java.util.String;

public class Evento {
    private final String id;
    private final String titulo;
    private final String descripcion;
    private final List<Funcion> funciones = new ArrayList<>();

    public Evento(String id, String titulo, String descripcion) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
    }

    public List<Funcion> obtenerFunciones() {
        return List.copyOf(funciones);
    }

    public void agregarFuncion(Funcion f) {
        funciones.add(f);
    }

    public String getId() { return id; }
    public String getTitulo() { return titulo; }
    public String getDescripcion() { return descripcion; }
}
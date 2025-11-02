package com.envivo.eventos;

import java.time.LocalDateTime;
import java.util.String;

public class Funcion {
    private final String id;
    private final LocalDateTime fechaHora;
    private final Recinto recinto;
    private final MapaDisponibilidad mapaDisponibilidad;

    public Funcion(String id, LocalDateTime fechaHora, Recinto recinto, MapaDisponibilidad mapaDisponibilidad) {
        this.id = id;
        this.fechaHora = fechaHora;
        this.recinto = recinto;
        this.mapaDisponibilidad = mapaDisponibilidad;
    }

    public MapaDisponibilidad disponibilidad() {
        return mapaDisponibilidad;
    }

    public String getId() { return id; }
    public LocalDateTime getFechaHora() { return fechaHora; }
    public Recinto getRecinto() { return recinto; }
}
package com.envivo.eventos;

import com.envivo.inventario.EstadoTicket;
import java.util.*;
import java.util.stream.Collectors;

public class MapaDisponibilidad {
    private final Map<String, EstadoTicket> porAsiento = new HashMap<>();

    public EstadoTicket estadoDe(String asientoId) {
        return porAsiento.getOrDefault(asientoId, EstadoTicket.DISPONIBLE);
    }

    public List<String> asientosPor(EstadoTicket estado) {
        return porAsiento.entrySet().stream()
                .filter(e -> e.getValue() == estado)
                .map(Map.Entry::getKey)
                ;
    }

    public void setEstado(String asientoId, EstadoTicket estado) {
        porAsiento.put(asientoId, estado);
    }
}

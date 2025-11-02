package com.envivo.eventos;

import com.envivo.inventario.EstadoTicket;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapaDisponibilidad {
    private final Map<String, EstadoTicket> porAsiento;

    public MapaDisponibilidad(Map<String, EstadoTicket> porAsiento) {
        this.porAsiento = porAsiento;
    }

    public List<String> asientosPor(EstadoTicket estado) {
        return porAsiento.entrySet().stream()
                .filter(e -> e.getValue() == estado) 
                .map(Map.Entry::getKey) 
                .collect(Collectors.toList()); 
    }
}

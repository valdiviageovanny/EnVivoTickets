package com.envivo.inventario;

import com.envivo.common.Money;
import java.util.ArrayList;
import java.util.List;
import java.util.String;

public class LineaOrden {
    private final String id;
    private final String ticketId;
    private final Money precio;
    private final List<OpcionAdicional> opciones = new ArrayList<>();

    public LineaOrden(String id, String ticketId, Money precio) {
        this.id = id;
        this.ticketId = ticketId;
        this.precio = precio;
    }

    public void agregarOpcion(OpcionAdicional o) { opciones.add(o); }

    public Money total() {
        Money t = precio;
        for (OpcionAdicional o: opciones) {
            t = t.add(o.getPrecio());
        }
        return t;
    }

    public String getId() { return id; }
    public String getTicketId() { return ticketId; }
    public Money getPrecio() { return precio; }
    public List<OpcionAdicional> getOpciones() { return List.copyOf(opciones); }
}

package com.envivo.inventario;

import com.envivo.common.Money;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Orden {
    private final String id;
    private final String usuarioId;
    private final LocalDateTime fecha;
    private final List<LineaOrden> lineas = new ArrayList<>();
    private Money total;

    public Orden(String id, String usuarioId, LocalDateTime fecha, Money total) {
        this.id = id;
        this.usuarioId = usuarioId;
        this.fecha = fecha;
        this.total = total;
    }

    public void agregarLinea(LineaOrden l) { lineas.add(l); }

    public Money subtotal() {
        Money s = total;
        for (LineaOrden l: lineas) s = s.add(l.total());
        return s;
    }

    public String getId() { return id; }
    public String getUsuarioId() { return usuarioId; }
    public LocalDateTime getFecha() { return fecha; }
    public List<LineaOrden> getLineas() { return List.copyOf(lineas); }
    public Money getTotal() { return total; }
    public void setTotal(Money t) { this.total = t; }
}

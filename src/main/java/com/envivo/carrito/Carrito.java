package com.envivo.carrito;

import com.envivo.common.Money;
import com.envivo.inventario.LineaOrden;
import java.util.ArrayList;
import java.util.List;

public class Carrito {
    private final String id;
    private final String usuarioId;
    private final List<LineaOrden> lineas = new ArrayList<>();

    public Carrito(String id, String usuarioId) {
        this.id = id;
        this.usuarioId = usuarioId;
    }

    public void agregar(LineaOrden l) { lineas.add(l); }
    public void quitar(LineaOrden l) { lineas.remove(l); }

    public Money calcularTotal() {
        Money total = Money.of(0, "USD");
        for (LineaOrden l: lineas) total = total.add(l.total());
        return total;
    }

    public String getId() { return id; }
    public String getUsuarioId() { return usuarioId; }
    public List<LineaOrden> getLineas() { return List.copyOf(lineas); }
}

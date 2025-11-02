package com.envivo.precios;

import com.envivo.common.Money;
import com.envivo.inventario.Orden;
import java.util.ArrayList;
import java.util.List;

public class ServicioPromociones {
    private final List<Promocion> promos = new ArrayList<>();

    public void agregar(Promocion p) { promos.add(p); }

    public Money aplicarASubtotal(Orden orden) {
        Money descuento = Money.of(0, "USD");
        for (Promocion p : promos) {
            descuento = descuento.add(p.aplicar(orden));
        }
        return descuento;
    }
}
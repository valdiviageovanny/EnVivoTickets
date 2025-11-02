package com.envivo.precios;

import com.envivo.common.Money;
import com.envivo.inventario.Orden;

public class ReglaPromocion implements Promocion {
    private final String nombre;
    private final String criterio; // placeholder

    public ReglaPromocion(String nombre, String criterio) {
        this.nombre = nombre;
        this.criterio = criterio;
    }

    @Override
    public Money aplicar(Orden orden) {
        // Placeholder: flat 5 USD off if matches some criterion
        return Money.of(5, "USD");
    }

    public String getNombre() { return nombre; }
    public String getCriterio() { return criterio; }
}
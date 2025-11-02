package com.envivo.precios;

import com.envivo.common.Money;
import com.envivo.eventos.Funcion;
import com.envivo.eventos.Seccion;

public class PrecioPorSeccion implements EstrategiaPrecio {
    @Override
    public Money calcular(Funcion funcion, Seccion seccion, Money base, int demanda) {
        // Example: VIP => +20% (placeholder rule by name)
        if (seccion.getNombre().toUpperCase().contains("VIP")) {
            return new Money(base.getAmount().multiply(java.math.BigDecimal.valueOf(1.20)), base.getCurrency());
        }
        return base;
    }
}

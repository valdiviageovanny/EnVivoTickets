package com.envivo.precios;

import com.envivo.common.Money;
import com.envivo.eventos.Funcion;
import com.envivo.eventos.Seccion;

public class PrecioPorDemanda implements EstrategiaPrecio {
    @Override
    public Money calcular(Funcion funcion, Seccion seccion, Money base, int demanda) {
        // +10% if high demand (placeholder)
        if (demanda > 80) {
            return new Money(base.getAmount().multiply(java.math.BigDecimal.valueOf(1.10)), base.getCurrency());
        }
        return base;
    }
}
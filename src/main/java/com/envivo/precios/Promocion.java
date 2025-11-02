package com.envivo.precios;

import com.envivo.common.Money;
import com.envivo.inventario.Orden;

public interface Promocion {
    Money aplicar(Orden orden);
}
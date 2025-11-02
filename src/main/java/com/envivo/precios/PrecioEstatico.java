package com.envivo.precios;

import com.envivo.common.Money;
import com.envivo.eventos.Funcion;
import com.envivo.eventos.Seccion;

public class PrecioEstatico implements EstrategiaPrecio {
    @Override
    public Money calcular(Funcion funcion, Seccion seccion, Money base, int demanda) {
        return base; // price = base
    }
}
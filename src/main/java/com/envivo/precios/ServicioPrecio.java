package com.envivo.precios;

import com.envivo.common.Money;
import com.envivo.eventos.Funcion;
import com.envivo.eventos.Seccion;
import com.envivo.inventario.Orden;

public class ServicioPrecio {
    private final EstrategiaPrecio estrategia;
    private final ServicioPromociones promos;

    public ServicioPrecio(EstrategiaPrecio estrategia, ServicioPromociones promos) {
        this.estrategia = estrategia;
        this.promos = promos;
    }

    public Money cotizar(Funcion funcion, Seccion seccion) {
        return estrategia.calcular(funcion, seccion, seccion.getBasePrice(), 0);
    }

    public Money aplicarPromos(Orden orden) {
        return promos.aplicarASubtotal(orden);
    }
}
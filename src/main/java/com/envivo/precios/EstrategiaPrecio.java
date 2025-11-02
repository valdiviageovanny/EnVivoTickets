package com.envivo.precios;

import com.envivo.common.Money;
import com.envivo.eventos.Funcion;
import com.envivo.eventos.Seccion;

public interface EstrategiaPrecio {
    Money calcular(Funcion funcion, Seccion seccion, Money base, int demanda);
}

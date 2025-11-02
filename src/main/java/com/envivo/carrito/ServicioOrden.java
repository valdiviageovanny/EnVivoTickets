package com.envivo.carrito;

import com.envivo.common.*;
import com.envivo.inventario.Orden;

import java.time.LocalDateTime;

public class ServicioOrden {
    public Orden crearDesde(Carrito carrito) {
        var orden = new Orden(StringUtils.randomString(), carrito.getUsuarioId(), LocalDateTime.now(), Money.of(0, "USD"));
        carrito.getLineas().forEach(orden::agregarLinea);
        orden.setTotal(carrito.calcularTotal());
        return orden;
    }
}

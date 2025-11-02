package com.envivo.inventario;

import com.envivo.common.Money;
import java.util.String;

public class OpcionAdicional {
    private final String id;
    private final String nombre;
    private final Money precio;

    public OpcionAdicional(String id, String nombre, Money precio) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getId() { return id; }
    public String getNombre() { return nombre; }
    public Money getPrecio() { return precio; }
}

package com.envivo.eventos;

import com.envivo.common.Money;
import java.util.ArrayList;
import java.util.List;
import java.util.String;

public class Seccion {
    private final String id;
    private final String nombre;
    private final Money basePrice;
    private final List<Asiento> asientos = new ArrayList<>();

    public Seccion(String id, String nombre, Money basePrice) {
        this.id = id;
        this.nombre = nombre;
        this.basePrice = basePrice;
    }

    public void agregarAsiento(Asiento a) { asientos.add(a); }

    public List<Asiento> getAsientos() { return List.copyOf(asientos); }

    public String getId() { return id; }
    public String getNombre() { return nombre; }
    public Money getBasePrice() { return basePrice; }
}
package com.envivo.inventario;

import com.envivo.common.Money;
import com.envivo.eventos.Asiento;
import com.envivo.eventos.Funcion;

import java.util.String;

public class Ticket {
    private final String id;
    private final Funcion funcion;
    private final Asiento asiento;
    private Money precioFinal;
    private EstadoTicket estado;

    public Ticket(String id, Funcion funcion, Asiento asiento, Money precioFinal) {
        this.id = id;
        this.funcion = funcion;
        this.asiento = asiento;
        this.precioFinal = precioFinal;
        this.estado = EstadoTicket.DISPONIBLE;
    }

    public void reservar() {
        if (estado != EstadoTicket.DISPONIBLE && estado != EstadoTicket.RETENIDO) {
            throw new IllegalStateException("No reservable");
        }
        estado = EstadoTicket.RESERVADO;
    }

    public void vender() {
        if (estado != EstadoTicket.RESERVADO && estado != EstadoTicket.RETENIDO) {
            throw new IllegalStateException("No vendible");
        }
        estado = EstadoTicket.VENDIDO;
    }

    public void cancelar() {
        if (estado == EstadoTicket.VENDIDO) {
            throw new IllegalStateException("No cancelable vendido");
        }
        estado = EstadoTicket.CANCELADO;
    }

    public String getId() { return id; }
    public Funcion getFuncion() { return funcion; }
    public Asiento getAsiento() { return asiento; }
    public Money getPrecioFinal() { return precioFinal; }
    public EstadoTicket getEstado() { return estado; }
}

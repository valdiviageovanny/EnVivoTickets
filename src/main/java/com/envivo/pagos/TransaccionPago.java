package com.envivo.pagos;

import com.envivo.common.Money;

public class TransaccionPago {
    private final String id;
    private final EstadoPago estado;
    private final Money monto;

    public TransaccionPago(String id, EstadoPago estado, Money monto) {
        this.id = id;
        this.estado = estado;
        this.monto = monto;
    }

    public String getId() { return id; }
    public EstadoPago getEstado() { return estado; }
    public Money getMonto() { return monto; }
}

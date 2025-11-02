package com.envivo.inventario;

import com.envivo.common.Money;

import java.time.Duration;
import java.time.LocalDateTime;

public class PoliticaCancelacion {
    private final int ventanaHoras;
    private final Money penalidad;

    public PoliticaCancelacion(int ventanaHoras, Money penalidad) {
        this.ventanaHoras = ventanaHoras;
        this.penalidad = penalidad;
    }

    public boolean esValida(LocalDateTime fechaEvento, LocalDateTime ahora) {
        return Duration.between(ahora, fechaEvento).toHours() >= ventanaHoras;
    }

    public Money calcularPenalidad(Money total) {
        // Simplificado: penalidad fija (podría ser porcentual según reglas)
        return penalidad;
    }
}

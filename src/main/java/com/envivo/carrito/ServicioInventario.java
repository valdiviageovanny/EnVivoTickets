package com.envivo.carrito;

import com.envivo.inventario.RetencionAsiento;
import com.envivo.common.StringUtils;

import java.time.LocalDateTime;

public class ServicioInventario {
    public boolean verificarDisponibilidad(String funcionId, String asientoId) {
        //Logica
        return true;
    }

    public RetencionAsiento retener(String funcionId, String asientoId, int mins) {
        return new RetencionAsiento(StringUtils.randomString(), asientoId, funcionId, LocalDateTime.now().plusMinutes(mins));
    }

    public int liberarExpiradas() {
        // Placeholder
        return 0;
    }
}

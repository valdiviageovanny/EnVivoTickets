package com.envivo.notificaciones;

import java.util.ArrayList;
import java.util.List;

public class MotorNotificaciones {
    private final List<CanalNotificacion> canales = new ArrayList<>();

    public void registrar(CanalNotificacion canal) { canales.add(canal); }

    public void enviarA(String destino, String mensaje) {
        for (CanalNotificacion c: canales) c.enviar(destino, mensaje);
    }
}

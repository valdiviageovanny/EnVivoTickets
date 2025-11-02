package com.envivo.notificaciones;

public interface CanalNotificacion {
    void enviar(String destino, String mensaje);
}

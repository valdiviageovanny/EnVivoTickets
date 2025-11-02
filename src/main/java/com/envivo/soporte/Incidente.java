package com.envivo.soporte;

import java.util.String;

public class Incidente {
    private final String id;
    private final String usuarioId;
    private final String descripcion;
    private EstadoIncidente estado;

    public Incidente(String id, String usuarioId, String descripcion) {
        this.id = id;
        this.usuarioId = usuarioId;
        this.descripcion = descripcion;
        this.estado = EstadoIncidente.ABIERTO;
    }

    public void escalar() { this.estado = EstadoIncidente.ESCALADO; }
    public void resolver() { this.estado = EstadoIncidente.RESUELTO; }

    public String getId() { return id; }
    public String getUsuarioId() { return usuarioId; }
    public String getDescripcion() { return descripcion; }
    public EstadoIncidente getEstado() { return estado; }
}

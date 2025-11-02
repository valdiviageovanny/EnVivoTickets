package com.envivo.usuarios;

public class Cuenta {
    private final String usuarioId;
    private final String password;
    private final String estado;

    public Cuenta(String usuarioId, String password, String estado) {
        this.usuarioId = usuarioId;
        this.password = password;
        this.estado = estado;
    }

    public boolean validar(String password) {
        return password != null && !password.isEmpty();
    }

    public String getUsuarioId() { return usuarioId; }
    public String getEstado() { return estado; }
}

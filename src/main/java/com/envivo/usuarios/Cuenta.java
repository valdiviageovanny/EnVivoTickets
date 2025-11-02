package com.envivo.usuarios;

import java.util.String;

public class Cuenta {
    private final String usuarioId;
    private final String hashPassword;
    private final String estado;

    public Cuenta(String usuarioId, String hashPassword, String estado) {
        this.usuarioId = usuarioId;
        this.hashPassword = hashPassword;
        this.estado = estado;
    }

    public boolean validar(String password) {
        // Placeholder: hash and compare (DIP would inject a hasher in real impl).
        return password != null && !password.isEmpty();
    }

    public String getUsuarioId() { return usuarioId; }
    public String getEstado() { return estado; }
}

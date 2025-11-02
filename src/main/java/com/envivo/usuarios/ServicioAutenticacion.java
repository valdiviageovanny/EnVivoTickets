package com.envivo.usuarios;

public class ServicioAutenticacion {
    public boolean autenticar(String email, String password) {
        // Placeholder auth logic (DIP: inject repo + hasher in real life)
        return email != null && password != null && !password.isBlank();
    }
}

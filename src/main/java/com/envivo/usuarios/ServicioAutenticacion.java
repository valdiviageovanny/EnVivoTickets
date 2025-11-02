package com.envivo.usuarios;

public class ServicioAutenticacion {
    public boolean autenticar(String email, String password) {
        return email != null && password != null && !password.isBlank();
    }
}

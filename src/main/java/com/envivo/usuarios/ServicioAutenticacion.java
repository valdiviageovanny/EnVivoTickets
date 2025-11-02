package com.envivo.usuarios;

public class ServicioAutenticacion {
    public boolean autenticar(String email, String password) {
<<<<<<< HEAD
        // Placeholder auth logic (DIP: inject repo + hasher in real life)
=======
>>>>>>> 7911bb8ce69823e20b5baf5ede18b3bf50087729
        return email != null && password != null && !password.isBlank();
    }
}

package com.envivo.usuarios;

<<<<<<< HEAD
import java.util.String;

public class Cuenta {
    private final String usuarioId;
    private final String hashPassword;
    private final String estado;

    public Cuenta(String usuarioId, String hashPassword, String estado) {
        this.usuarioId = usuarioId;
        this.hashPassword = hashPassword;
=======
public class Cuenta {
    private final String usuarioId;
    private final String password;
    private final String estado;

    public Cuenta(String usuarioId, String password, String estado) {
        this.usuarioId = usuarioId;
        this.password = password;
>>>>>>> 583a26d682aa572920a177f777a4790a2b29a4cf
        this.estado = estado;
    }

    public boolean validar(String password) {
<<<<<<< HEAD
        // Placeholder: hash and compare (DIP would inject a hasher in real impl).
=======
>>>>>>> 583a26d682aa572920a177f777a4790a2b29a4cf
        return password != null && !password.isEmpty();
    }

    public String getUsuarioId() { return usuarioId; }
    public String getEstado() { return estado; }
}

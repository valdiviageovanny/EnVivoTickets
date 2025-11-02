package com.envivo.usuarios;

import java.util.Set;

public class Usuario {
    private final String id;
    private final String nombre;
    private final String email;
    private final Set<Rol> roles;

    public Usuario(String id, String nombre, String email, Set<Rol> roles) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.roles = Set.copyOf(roles);
    }

    public String getId() { return id; }
    public String getNombre() { return nombre; }
    public String getEmail() { return email; }
    public Set<Rol> getRoles() { return roles; }

    public boolean tieneRol(Rol r) { return roles.contains(r); }
}

package com.envivo.pagos;

public class MedioPago {
    private final String tipo;
    private final String token;

    public MedioPago(String tipo, String token) {
        this.tipo = tipo;
        this.token = token;
    }

    public String getTipo() { return tipo; }
    public String getToken() { return token; }
}

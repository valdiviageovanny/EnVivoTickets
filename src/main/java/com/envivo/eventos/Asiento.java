package com.envivo.eventos;

public class Asiento {
    private final String id;
    private final String fila;
    private final String numero;

    public Asiento(String id, String fila, String numero) {
        this.id = id;
        this.fila = fila;
        this.numero = numero;
    }

    public String getId() { return id; }
    public String getFila() { return fila; }
    public String getNumero() { return numero; }
}

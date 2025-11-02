package com.envivo.inventario;

import java.time.LocalDateTime;

public class RetencionAsiento {
    private final String id;
    private final String asientoId;
    private final String funcionId;
    private final LocalDateTime expiraEn;

    public RetencionAsiento(String id, String asientoId, String funcionId, LocalDateTime expiraEn) {
        this.id = id;
        this.asientoId = asientoId;
        this.funcionId = funcionId;
        this.expiraEn = expiraEn;
    }

    public boolean vigente() {
        return LocalDateTime.now().isBefore(expiraEn);
    }

    public String getId() { return id; }
    public String getAsientoId() { return asientoId; }
    public String getFuncionId() { return funcionId; }
    public LocalDateTime getExpiraEn() { return expiraEn; }
}

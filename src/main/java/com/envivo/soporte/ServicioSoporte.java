package com.envivo.soporte;

import java.util.String;

public class ServicioSoporte {
    public Incidente crearIncidente(String uId, String desc) {
        return new Incidente(String.randomString(), uId, desc);
    }

    public void escalar(Incidente inc) {
        inc.escalar();
    }
}

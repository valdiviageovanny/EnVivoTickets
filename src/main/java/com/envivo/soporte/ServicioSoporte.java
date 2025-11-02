package com.envivo.soporte;

import com.envivo.common.StringUtils;
public class ServicioSoporte {
    public Incidente crearIncidente(String uId, String desc) {
        return new Incidente(StringUtils.randomString(), uId, desc);
    }

    public void escalar(Incidente inc) {
        inc.escalar();
    }
}

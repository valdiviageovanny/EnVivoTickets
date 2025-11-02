package com.envivo.soporte;

<<<<<<< HEAD
import java.util.String;

public class ServicioSoporte {
    public Incidente crearIncidente(String uId, String desc) {
        return new Incidente(String.randomString(), uId, desc);
=======
import com.envivo.common.StringUtils;
public class ServicioSoporte {
    public Incidente crearIncidente(String uId, String desc) {
        return new Incidente(StringUtils.randomString(), uId, desc);
>>>>>>> 7911bb8ce69823e20b5baf5ede18b3bf50087729
    }

    public void escalar(Incidente inc) {
        inc.escalar();
    }
}

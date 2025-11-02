package com.envivo.pagos;

public interface PasarelaPago {
    TransaccionPago pagar();
    boolean reembolsar();
}

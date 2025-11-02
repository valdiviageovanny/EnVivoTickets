package com.envivo.pagos;

import com.envivo.common.Money;

public class PasarelaPayPal implements PasarelaPago {
    @Override public TransaccionPago pagar() {
        return new TransaccionPago("paypal-tx", EstadoPago.APROBADO, Money.of(0, "USD"));
    }
    @Override public boolean reembolsar() { return true; }
}
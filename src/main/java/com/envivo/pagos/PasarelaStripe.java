package com.envivo.pagos;

import com.envivo.common.Money;

public class PasarelaStripe implements PasarelaPago {
    @Override public TransaccionPago pagar() {
        return new TransaccionPago("stripe-tx", EstadoPago.APROBADO, Money.of(0, "USD"));
    }
    @Override public boolean reembolsar() { return true; }
}
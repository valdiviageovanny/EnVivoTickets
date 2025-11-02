package com.envivo.pagos;

public class ServicioPago {
    private final PasarelaPago pasarela;

    public ServicioPago(PasarelaPago pasarela) {
        this.pasarela = pasarela;
    }

    public TransaccionPago procesar() {
        return pasarela.pagar();
    }
}
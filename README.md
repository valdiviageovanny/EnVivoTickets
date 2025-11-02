# EnVivoTickets

**EnVivoTickets** es un sistema para la compra de boletos en línea para una variedad de espectáculos en vivo, incluyendo **teatro**, **microteatro**, **stand-up** y otros eventos de entretenimiento. Los usuarios pueden adquirir boletos para diferentes funciones de un mismo evento, gestionando la disponibilidad de asientos, los precios, las promociones, y las políticas de cancelación y reprogramación.

## Funcionalidades Clave

- **Compra de boletos**: Los usuarios pueden seleccionar asientos disponibles, agregar boletos al carrito y completar la compra.
- **Disponibilidad en tiempo real**: Los asientos se muestran con su disponibilidad actualizada, y se reservan temporalmente durante el proceso de compra.
- **Precios y promociones**: El sistema permite precios estáticos o dinámicos, dependiendo de la demanda o las secciones del evento. También se aplican promociones en el proceso de compra.
- **Opciones adicionales**: Los usuarios pueden seleccionar paquetes que incluyen bebidas o estacionamiento al momento de la compra.
- **Notificaciones**: El sistema envía notificaciones de cambios en la programación, como modificaciones en el elenco, reprogramaciones o cancelaciones.
- **Soporte al cliente**: Los usuarios pueden reportar incidentes relacionados con el pago o acceso a eventos.

## Estructura del Proyecto

El proyecto se organiza en los siguientes módulos principales:

1. **Usuarios**: Gestión de la autenticación, roles y acceso de los usuarios.
2. **Eventos**: Modelado de eventos, funciones, recintos y disponibilidad de asientos.
3. **Inventario y Carrito**: Gestión de boletos, órdenes, y el carrito de compras del usuario.
4. **Precios y Promociones**: Estrategias de precios y gestión de promociones aplicadas a los boletos.
5. **Pagos**: Integración de pasarelas de pago como **Stripe** y **PayPal**.
6. **Notificaciones**: Envío de notificaciones a los usuarios sobre eventos, compras y cambios.
7. **Soporte**: Gestión de incidentes y problemas reportados por los usuarios.

## Instalación

### Requisitos

- **Java 11 o superior**: Para compilar y ejecutar el proyecto.
- **Maven** o **Gradle**: Dependiendo del gestor de dependencias que estés utilizando.

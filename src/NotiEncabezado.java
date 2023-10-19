public class NotiEncabezado extends NotificacionDecorator{
    public NotiEncabezado(Notificacion notificacionDecorada) {
        super(notificacionDecorada);
    }

    @Override
    public void enviar(String mensaje) {
        String mensajeConEncabezado = "Encabezado: " + mensaje;
        super.enviar(mensajeConEncabezado);
    }
}

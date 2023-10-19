public abstract class NotificacionDecorator implements Notificacion{
    private Notificacion notificacionDecorada;

    public NotificacionDecorator(Notificacion notificacionDecorada) {
        this.notificacionDecorada = notificacionDecorada;
    }

    @Override
    public void enviar(String mensaje) {
        notificacionDecorada.enviar(mensaje);
    }
}

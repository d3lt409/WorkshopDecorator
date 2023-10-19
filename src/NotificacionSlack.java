public class NotificacionSlack extends NotificacionDecorator{


    public NotificacionSlack(Notificacion notificacionDecorada) {
        super(notificacionDecorada);
    }

    @Override
    public void enviar(String mensaje) {
        System.out.println("Enviando mensaje a través de Slack: ");
        super.enviar(mensaje);
    }
}

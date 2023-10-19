public class NotificacionFacebook extends NotificacionDecorator{

    public NotificacionFacebook(Notificacion notificacionDecorada) {
        super(notificacionDecorada);
    }

    @Override
    public void enviar(String message) {
        System.out.println("Mensaje enviado por Facebook");
        super.enviar(message);
    }

}

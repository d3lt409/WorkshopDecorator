public class Main {
    public static void main(String[] args) {
        // Crear notificaciones base
        Notificacion notificacionTexto = new SMSMensaje();
        Notificacion notificacionFacebook = new NotificacionFacebook();
        Notificacion notificacionSlack = new NotificacionSlack();

        // Enviar notificaciones básicas
        notificacionTexto.enviar("Mensaje de texto sin decorar");
        notificacionFacebook.enviar("Mensaje de Facebook sin decorar");
        notificacionSlack.enviar("Mensaje de Slack sin decorar");

        // Decorar notificaciones
        Notificacion notificacionDecorada1 = new NotiEncabezado(notificacionTexto);
        Notificacion notificacionDecorada2 = new NotiEncabezado(notificacionFacebook);

        // Enviar notificaciones decoradas
        notificacionDecorada1.enviar("Mensaje de texto decorado");
        notificacionDecorada2.enviar("Mensaje de Facebook decorado");
    }
}

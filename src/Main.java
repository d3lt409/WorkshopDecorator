public class Main {
    public static void main(String[] args) {
        // Crear notificaciones base
        Notificacion noti = new NotificacionFacebook(new NotificacionSlack(new SMSMensaje(new NotiEncabezado())));

        // Enviar notificaciones básicas
        noti.enviar("Mensaje de texto sin decorar");
        System.out.println("--------------------------------");
        noti.enviar("Mensaje de Facebook sin decorar");
        System.out.println("--------------------------------");
        noti.enviar("Mensaje de Slack sin decorar");
        System.out.println("--------------------------------");
        // Enviar notificaciones decoradas
        noti.enviar("Mensaje de texto decorado");
        System.out.println("--------------------------------");
        noti.enviar("Mensaje de Facebook decorado");
        System.out.println("--------------------------------");
    }
}

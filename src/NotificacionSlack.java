public class NotificacionSlack implements Notificacion{
    @Override
    public void enviar(String mensaje) {
        System.out.println("Enviando mensaje a través de Slack: " + mensaje);
    }
}

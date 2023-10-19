public class NotificacionFacebook  implements  Notificacion{
    @Override
    public void enviar(String mensaje) {
        System.out.println("Enviando mensaje a través de Facebook: " + mensaje);
    }
}

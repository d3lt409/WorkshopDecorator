public class SMSMensaje implements Notificacion {
    @Override
    public void enviar(String mensaje) {
        System.out.println("enviar mensaje de texto" + mensaje);
    }

}

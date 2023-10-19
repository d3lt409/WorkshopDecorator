public class SMSMensaje extends NotificacionDecorator {

    public SMSMensaje(Notificacion notificacionDecorada) {
        super(notificacionDecorada);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void enviar(String mensaje) {
        System.out.println("enviar mensaje de texto: ");
        super.enviar(mensaje);
    }

}

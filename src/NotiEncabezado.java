public class NotiEncabezado implements Notificacion{

    public NotiEncabezado(){}

    @Override
    public void enviar(String mensaje) {
        System.out.println("Mensaje: " + mensaje);
    }
}

package Patron_Factory;

public class Email_Notificacion implements Notificacion{
    @Override
    public void Enviar_Mensaje (String Mensaje) {
        System.out.println("Mensaje enviado por medio del Email.");
    }
}

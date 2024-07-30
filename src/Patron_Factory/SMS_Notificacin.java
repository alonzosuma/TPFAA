package Patron_Factory;

public class SMS_Notificacin implements Notificacion{
    @Override
    public void Enviar_Mensaje (String Mensaje) {
        System.out.println("Mensaje enviado por SMS");
    }
}

package Patron_Factory;

public class App_Notificacion implements Notificacion{
    @Override
    public void Enviar_Mensaje (String Mensaje) {
        System.out.println("Mensaje enviado por medio de la App.");
    }
}
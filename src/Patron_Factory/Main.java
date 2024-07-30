package Patron_Factory;

public class Main {
    public static void main (String [] args) {
        Notificacion_Factory Factory = new Notificacion_Factory();

        Notificacion Email = Factory.Crear_Notificacion("Email");
        Email.Enviar_Mensaje("Mensaje por correo");

        Notificacion SMS = Factory.Crear_Notificacion("SMS");
        SMS.Enviar_Mensaje("Mensaje por SMS");

        Notificacion App = Factory.Crear_Notificacion("App");
        App.Enviar_Mensaje("Mensaje por la App");

        Notificacion_Factory_I Urgente_Notificacion = new Urgente_Notificacion_Factory();
        Notificacion Uregente_Email = Urgente_Notificacion.Crear_Email_Notificacion();
        Uregente_Email.Enviar_Mensaje("Mensaje urgente por email");

        Notificacion_Factory_I Regular_Factory = new Regular_Notificacion_Factory();
        SMS_Notificacin Regular_SMS = Regular_Factory.Crear_SMS_Notificacion();
        Regular_SMS.Enviar_Mensaje("Mesaje regular por mensaje");
    }
}
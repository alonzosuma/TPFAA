package Patron_Factory;

public interface Notificacion_Factory_I {
    Email_Notificacion Crear_Email_Notificacion();
    SMS_Notificacin Crear_SMS_Notificacion ();
    App_Notificacion Crear_App_Notificacion ();
}
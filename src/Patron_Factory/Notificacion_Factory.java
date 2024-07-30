package Patron_Factory;

public class Notificacion_Factory {


    public Notificacion Crear_Notificacion (String Tipo_Mensaje){
        switch (Tipo_Mensaje.toLowerCase()) {
            case "email":
                return new Email_Notificacion();
            case "sms":
                return new SMS_Notificacin();
            case "app":
                return new App_Notificacion();
            default:
                throw new IllegalArgumentException("Tipo de notificación desnocido: " + Tipo_Mensaje);
        }
    }
}
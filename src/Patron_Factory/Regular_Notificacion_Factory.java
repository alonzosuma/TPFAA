package Patron_Factory;

public class Regular_Notificacion_Factory implements Notificacion_Factory_I{
    @Override
    public Email_Notificacion Crear_Email_Notificacion(){
        return new Email_Notificacion();
    }

    @Override
    public SMS_Notificacin Crear_SMS_Notificacion(){
        return new SMS_Notificacin();
    }

    @Override
    public App_Notificacion Crear_App_Notificacion(){
        return new App_Notificacion();
    }
}

package co.edu.uniquindio.patroncomportamiento;

public class ManejadorAdministracion extends Manejador {

    @Override
    public void enviarEmail(Mail elMail) {

    }

    @Override
    public void enviarMail(Mail email) {
        if ((email.getDestino().equalsIgnoreCase("administracion@gmail.com")) ||
        (email.getSubject().equalsIgnoreCase("administracion")))
        {System.out.println("envio de email a administracion");
        }
        else
        {
            if (this.getSiguiente() != null) {
                //llamamos al metodo en el siguiente objeto
                this.getSiguiente().enviarMail(email);
            }

        }

    }
}

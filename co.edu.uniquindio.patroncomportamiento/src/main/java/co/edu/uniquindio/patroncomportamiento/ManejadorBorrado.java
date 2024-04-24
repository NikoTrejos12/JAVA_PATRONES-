package co.edu.uniquindio.patroncomportamiento;

public class ManejadorBorrado extends Manejador {

    @Override
    public void enviarMail(Mail email)
    {System.out.println("mail no reconocido .... marcado como spam");
    }
}

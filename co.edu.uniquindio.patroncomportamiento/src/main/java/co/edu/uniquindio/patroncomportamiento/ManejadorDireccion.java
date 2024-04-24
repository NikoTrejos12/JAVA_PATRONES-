package co.edu.uniquindio.patroncomportamiento;

public class ManejadorDireccion extends Manejador {

    @Override
            public void enviarEmail(Mail email)
    {
        if ((email.getDestino().equalsIgnoreCase("direcion@gmail.com")) ||
        (email.getSubject().equalsIgnoreCase("direccion")))
        {
            System.out.println("enviando mail a direccion ");
        }
        else
        {
            if (this.getSiguiente() != null)
            {
                //llamamos al metodo en el siguiente objeto
                this.getSiguiente().enviarMail( email);
            }
        }
    }

    @Override
    public void enviarMail(Mail email) {

    }
}

package co.edu.uniquindio.patroncomportamiento;

public class ManejadorProfesorado  extends Manejador{

    @Override
    public void enviarEmail(Mail email) {
        if ((email.getDestino().equalsIgnoreCase("profesorado@gmail.com")) ||
                (email.getSubject().equalsIgnoreCase("profesorado"))) {
            System.out.println("enviando mail a profesorado");
        } else {
            if (this.getSiguiente() != null) {
                //llamamos al metodo en el siguiente objeto
                this.getSiguiente().enviarMail(email);
            }
        }
    }

    @Override
    public void enviarMail(Mail email) {

    }
}

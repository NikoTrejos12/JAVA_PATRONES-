package co.edu.uniquindio.patroncomportamiento;

public abstract class Manejador {

    protected Manejador siguienteManejador;
    public Manejador getSiguiente(){
        return this.siguienteManejador;
    }
    public void setSiguiente(Manejador m){
        this.siguienteManejador= m;
    }
    public abstract void enviarEmail(Mail elMail);

    public abstract void enviarMail(Mail email);
}

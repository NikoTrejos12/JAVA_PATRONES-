package co.edu.uniquindio.patroncomportamiento;

public class Mail {

    private String origen ;
    private String destino;
    private String subject;


    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Mail(String origen, String destino, String subject) {
        this.origen = origen;
        this.destino = destino;
        this.subject = subject;

    }
}

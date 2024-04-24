package co.edu.uniquindio.patroncomportamiento;

public class Main {
    public static void main(String[] args) {

        EnviarMail proceso = new EnviarMail();
        proceso.comprobar(new Mail("nicolas@gmail.com", "administraccion@gmail.com", "reclamo"));
        proceso.comprobar(new Mail("nicolas@gmail.com", "profesorado@gmail.com", "alumnos"));
        proceso.comprobar(new Mail("otro@gmail.com", "direccionn@gmail.com", "feriados"));
        proceso.comprobar(new Mail("austral@gmail.com", "administraccion@gmail.com", "reclamo"));

    }
}

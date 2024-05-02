package co.edu.uniquindio.patroncomportamiento;

public class Main {
    public static void main(String[] args) {

        {
            Manejador m1 = new ManejadorAprobado();
            Manejador m2 = new ManejadorDenegado();
            Manejador m3 = new ManejadorPendiente();
            m1.setSiguiente(m2);
            m2.setSiguiente(m3);
            m1.comprobar("APROBADO");
            m1.comprobar("APROBADO");
            m1.comprobar("DENEGADO");
            m1.comprobar(null);
            m1.comprobar("DENEGADO");
        }
    }
}




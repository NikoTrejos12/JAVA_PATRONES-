package co.edu.uniquindio.patroncomportamiento;

public class EnviarMail {

    Manejador inicial;

    public EnviarMail(){

        this.inicial = new ManejadorProfesorado();
        Manejador administracion = new ManejadorAdministracion();
        Manejador direccion= new ManejadorDireccion();
        Manejador borrado = new ManejadorBorrado();

        inicial.setSiguiente( direccion);
        direccion.setSiguiente ( administracion);
        administracion.setSiguiente( borrado);

    }
    public void comprobar(Mail email){
        inicial.enviarMail( email);
        //va tomar como parametro el email y va tomar y va llamra el inicial
    }



}

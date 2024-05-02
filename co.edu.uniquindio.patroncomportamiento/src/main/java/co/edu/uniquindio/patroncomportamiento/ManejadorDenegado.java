package co.edu.uniquindio.patroncomportamiento;

public class ManejadorDenegado extends Manejador {

    public ManejadorDenegado() {
    }
    @Override
    public void comprobar(String estado)
    {
        if( estado == null )
        {
            System.out.println("Solicitud pendiente");
        }
        else
        {
            if( this.getSiguiente() != null )
            {
                // Llamamos al método en el siguiente objeto
                this.getSiguiente().comprobar( estado );
            }
        }
    }
}





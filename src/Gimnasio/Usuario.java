
package Gimnasio;


public class Usuario {
    //Atributos de Usuario
    protected String nombre;
    protected String apellidoPaterno;
    protected String apellidoMaterno;
    protected String domicilio;
    protected String numCelular;

    public Usuario(String nombre, String apellidoPaterno, String apellidoMaterno, String domicilio, String numCelular) {
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.domicilio = domicilio;
        this.numCelular = numCelular;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public String getNumCelular() {
        return numCelular;
    }
    
    
    

    
    
    
    
}
    

package modelo;

import java.security.SecureRandom;
import java.util.Date;

public class Postulante {
    
    private String email;
    private String nombres;
    private String apellidos;
    private String direccion;
    private String nacimiento;
    private String clave;
    
    private GradoEstudio grado;
    private PostulacionArreglo postulaciones;
    

    //constructor
    public Postulante(String email, String nombres, String apellidos, String direccion, String nacimiento) {
        this.email = email;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.nacimiento = nacimiento;
        
    }
    
    //metodos
    private void generarClave(){
    
        this.clave=this.apellidos.substring(0,4)+this.nombres.substring(0,4);
    
    }
    
    private boolean asignarGradoEstudio(GradoEstudio grado){
    
        this.grado=grado;
    return true;
    }
    
    private boolean postular(Oferta oferta){
        Date date = new Date();
        Postulacion nuevapostulacion = new Postulacion(date,oferta);
        
        this.postulaciones.AgregarPostulacion(nuevapostulacion);
        
        return true;
    }
    
    
    //getters y setteers

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(String nacimiento) {
        this.nacimiento = nacimiento;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
    
    
}

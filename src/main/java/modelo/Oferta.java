
package modelo;

import java.util.Date;


public class Oferta {
    private String puesto;
    private String descripcion;
    private String area;
    private Date fechaInicio;
    private Date fechaTermino;
    
    private RequisitoArreglo requisitos;

    public Oferta(String puesto, String descripcion, String area, Date fechaInicio, Date fechaTermino) {
        this.puesto = puesto;
        this.descripcion = descripcion;
        this.area = area;
        this.fechaInicio = fechaInicio;
        this.fechaTermino = fechaTermino;
    }
    
    public boolean AgregarRequisito(int orden,String descripcion){
        
        this.requisitos.AgregarRequisito(orden, descripcion);
        
        return true;
    }

    public RequisitoArreglo getRequisitos() {
        return requisitos;
    }
    
    
   

}

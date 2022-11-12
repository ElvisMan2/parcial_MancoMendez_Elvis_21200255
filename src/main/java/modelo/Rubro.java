
package modelo;


public class Rubro {
    private String nombre;
    private boolean estado;

// constructor
    public Rubro(String nombre) {
        this.nombre = nombre;
        this.estado=false;
    }

//metodos    
    public boolean habilitar(){
    this.estado=true;
    return this.estado;
    }
    
    
    public boolean deshabilitar(){
    this.estado=false;
    return this.estado;
    }

// getter y setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    
    
}

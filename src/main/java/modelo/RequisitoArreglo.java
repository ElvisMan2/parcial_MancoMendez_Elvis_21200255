
package modelo;


public class RequisitoArreglo {
    private int indice;
    private Requisito[] requisitos;

    // constructor
    public RequisitoArreglo(int tamanio) {
        this.requisitos=new Requisito[tamanio];
    }
    
    //metodos
    public boolean AgregarRequisito(int orden, String descripcion){
        
        this.requisitos[orden].setDescripcion(descripcion);
        this.requisitos[orden].setEstado(true);
        
        return true;
    }
    

    
    
    
}


package modelo;


public class PostulacionArreglo {
    
    private Postulacion[] postulaciones;
    private int indice;

    public PostulacionArreglo(int tam) {
        this.postulaciones=new Postulacion[tam];
        this.indice=0;
    }
    
    public boolean AgregarPostulacion(Postulacion postulacion){
    boolean result=false;
    
        if(lleno()){
            crecer();
        }
        this.postulaciones[this.indice] = postulacion;
        this.indice++;
        result = true;
        
        return result;
    
    
    }
    
    private  boolean lleno(){
        boolean result = false;
        if(this.indice == this.postulaciones.length){
            result = true;
        }
        return result;
    }
    
    public void crecer(){
        Postulacion[] nuevo = new Postulacion[indice*2];
        int i=0;
        for(Postulacion obj: this.postulaciones){
            nuevo[i]= obj;
            i++;
        }
        this.postulaciones = nuevo;
    }
    
}


package modelo;


public class OfertaArreglo {
    
    private Oferta[] ofertas;
    private int indice;

    public OfertaArreglo(int tam) {
        this.ofertas=new Oferta[tam];
        this.indice=0;
    }
    
    public boolean AgregarOferta(Oferta oferta){
    boolean result=false;
    
        if(lleno()){
            crecer();
        }
        this.ofertas[this.indice] = oferta;
        this.indice++;
        result = true;
        
        return result;
    
    
    }
    
    
    private  boolean lleno(){
        boolean result = false;
        if(this.indice == this.ofertas.length){
            result = true;
        }
        return result;
    }
    
    public void crecer(){
        Oferta[] nuevo = new Oferta[indice*2];
        int i=0;
        for(Oferta obj: this.ofertas ){
            nuevo[i]= obj;
            i++;
        }
        this.ofertas = nuevo;
    }
    
}

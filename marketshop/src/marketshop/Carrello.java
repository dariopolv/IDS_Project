
package marketshop;

public class Carrello {
    public int codcarr; //codice carrello
    public float finalprice; //prezzo finale da pagare
    public String codicefisc;
    
    public Carrello(){
            
    }
    
    public void setCodiceF(String codicefisc){
    
        this.codicefisc = codicefisc; //associa il carrello al cliente
        
    }
    
    public int getCodiceC(){
    
        return codcarr; //associa il carrello all'ordine
    
    }
    
}

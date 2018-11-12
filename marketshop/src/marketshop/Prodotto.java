
package marketshop;

public class Prodotto {
    
    public int codprod; //codice prodotto
    public String nomepr; //nome prodotto
    public int quant; //quantità disponibile
    public int categoria; //codice categoria appartenenza prodotto
    public float price; //prezzo prodotto
    public String descr; //descrizione prodotto
    
    public Prodotto(){

    }
    
    /*public void setCodicePro(int codprod){
        this.codprod = codprod;//imposta codice prodotto
    }
    public int getCodicePro(){
       return codprod; //serve per associare il codice prodotto al carrello
                       //  "   per associare al prodotto tutti i dettagli
    }
    
    public void setQnt(int quant){
        this.quant = quant;//imposta disponibilità del prodotto  
    }
    public int getQnt(){
        return quant;//serve per modificare la disponibilità del prodotto
    }
    
    public void setPre(float price){
        this.price = price;//imposta il prezzo del prodotto 
    }
    public float getPre(){
        return price;//serve a calcolare il prezzo finale del carrello    
    }
    */ // bisogna capi se faglielo legge direttamente dal database o impostallo
    
}

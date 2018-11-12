
package marketshop;

public class Supermercato {
    
    public int ID; //identificativo del supermercato
    public String nome; //nome del supermercato 
    public String luogo; //dove è situato il supermercato
    public String numtel; // numero telefono supermercato
    public String openh; //orario apertura supermercato
    public String closeh; //orario chiusura supermercato
    
    public Supermercato(int ID,String nome,String luogo,String numtel,String openh,String closeh){
    
        this.ID = ID;
        this.nome = nome;
        this.luogo = luogo;
        this.numtel = numtel;
        this.openh = openh;
        this.closeh = closeh;
    
    }
}

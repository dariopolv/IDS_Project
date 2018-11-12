
package marketshop;

public class Cliente {

    public String codfisc;  //codice fiscale cliente, identificativo del login
    protected String nome; //nome cliente
    protected String cognome; //congome cliente
    protected String resid; //residenza cliente
    protected String pwd;
    
    public Cliente(String codfisc, String nome, String cognome, String resid,String pwd){
        
        this.codfisc = codfisc;
        this.nome = nome;
        this.cognome = cognome;
        this.resid = resid;
        this.pwd = pwd;

    
    }
    
    public String getCodiceFisc(){
        
        return codfisc;// associa cliente al carrello
        
    }
}

//Leonardo Pereira Jorge RA: 2503689
public class Corretor extends Pessoa {
    private String CRECI;
    
    //Construtor
    public Corretor(){
        super();
        CRECI = "";
    }
    
    //Sobrecarga
    public Corretor(String CRECI){
        super();
        this.CRECI = CRECI;
    }
    
    
    //Getters e setters
    public String getCRECI(){
        return CRECI;
    }
    
    public void setCRECI(String CRECI){
        this.CRECI = CRECI;
    }
}

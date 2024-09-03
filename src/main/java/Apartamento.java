//Leonardo Pereira Jorge RA: 2503689
public class Apartamento extends Imovel {
    private int andarLoc;
    private String condominioNome;
    private float condominioVal;

    // Construtor
    public Apartamento(){
        super();
        andarLoc = 0;
        condominioNome = "";
        condominioVal = 0;
    }
    
    //Sobrecarga
    public Apartamento(String IPTU, float metroQ, int qtdQuartos, int qtdBanheiros, int qtdSalas, String rua, int numero, int andarLoc, int andares, String petF, String condominioNome, float condominioVal) {
        super();
        this.andarLoc = andarLoc;
        this.condominioNome = condominioNome;
        this.condominioVal = condominioVal;
    }

    // Getters e setters
    public int getAndarLoc() { 
        return andarLoc; 
    }
    public void setAndarLoc(int andarLoc) { 
        this.andarLoc = andarLoc; 
    }
    public String getCondominioNome() { 
        return condominioNome; 
    }
    public void setCondominioNome(String condominioNome) { 
        this.condominioNome = condominioNome; 
    }
    public float getCondominioVal() { 
        return condominioVal; 
    }
    public void setCondominioVal(float condominioVal) { 
        this.condominioVal = condominioVal; 
    }
}


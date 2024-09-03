//Leonardo Pereira Jorge RA: 2503689
public class Imovel {
    private String IPTU;
    private float metroQ;
    private int qtdQuartos;
    private int qtdBanheiros;
    private int qtdSalas;
    private String rua;
    private int numero;
    private int andares;
    private String nContrato;

    // Construtor
    public Imovel(){
        IPTU = "";
        metroQ = 0;
        qtdQuartos = 0;
        qtdBanheiros = 0;
        qtdSalas = 0;
        rua = "";
        numero = 0;
        andares = 0;
        nContrato = "";
	}
    
    //Sobrecarga
    public Imovel(String IPTU, float metroQ, int qtdQuartos, int qtdBanheiros, int qtdSalas, String rua, int numero, String nContrato) {
        this.IPTU = IPTU;
        this.metroQ = metroQ;
        this.qtdQuartos = qtdQuartos;
        this.qtdBanheiros = qtdBanheiros;
        this.qtdSalas = qtdSalas;
        this.rua = rua;
        this.numero = numero;
        this.nContrato = nContrato;
    }
    //Sobrescrita
    public String Imovel(String nContrato){
        return this.nContrato = nContrato;
    }

    // Getters e setters
    public String getNContrato(){
        return nContrato;
    }
    
    public void setNContrato(String nContrato){
        this.nContrato = nContrato;
    }
    public String getIPTU() { 
        return IPTU; 
    }
    public void setIPTU(String IPTU) { 
        this.IPTU = IPTU; 
    }
    public float getMetroQ() { 
        return metroQ; 
    }
    public void setMetroQ(float metroQ) { 
        this.metroQ = metroQ; 
    }
    public int getQtdQuartos() { 
        return qtdQuartos; 
    }
    public void setQtdQuartos(int qtdQuartos) { 
        this.qtdQuartos = qtdQuartos; 
    }
    public int getQtdBanheiros() {
        return qtdBanheiros; 
    }
    public void setQtdBanheiros(int qtdBanheiros) { 
        this.qtdBanheiros = qtdBanheiros; 
    }
    public int getQtdSalas() { 
        return qtdSalas; 
    }
    public void setQtdSalas(int qtdSalas) { 
        this.qtdSalas = qtdSalas; 
    }
    public String getRua() { 
        return rua; 
    }
    public void setRua(String rua) { 
        this.rua = rua; 
    }
    public int getNumero() { 
        return numero; 
    }
    public void setNumero(int numero) { 
        this.numero = numero; 
    }
    public int getAndares() { 
        return andares; 
    }
    public void setAndares(int andares) { 
        this.andares = andares; 
    }
} 


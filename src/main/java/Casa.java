//Leonardo Pereira Jorge RA: 2503689
public class Casa extends Imovel{
    private int idadeImv;

    // Construtor
    public Casa(){
        super();
        idadeImv = 0;
    }
    
    //Sobrecarga
    public Casa(String IPTU, float metroQ, int qtdQuartos, int qtdBanheiros, int qtdSalas, String rua, int numero, int andares, int idadelmv) {
        super();
        this.idadeImv = idadelmv;
    }

    // Getters e setters
    public int getIdadeImv() { 
        return idadeImv; 
    }
    public void setIdadeImv(int idadelmv) { 
        this.idadeImv = idadelmv; 
    }
}


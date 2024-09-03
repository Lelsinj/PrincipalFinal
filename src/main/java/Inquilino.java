//Leonardo Pereira Jorge RA: 2503689
public class Inquilino extends Pessoa{
    private String dataSaida;
    
    //Construtor
    public Inquilino(){
        super();
        dataSaida = "";
    }
    
    //Sobrecarga
    public Inquilino(String nContrato, String dataSaida){
        super();
        this.dataSaida = dataSaida;
    }
    
    
    //Getters e setters 
    public String getDataSaida(){
        return dataSaida;
    }
    
    public void setDataSaida(String dataSaida){
        this.dataSaida = dataSaida;
    }
}

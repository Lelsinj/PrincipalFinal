//Leonardo Pereira Jorge RA: 2503689
public class Pessoa {
    private  String nome;
    private long CPF;
    
    //Construtor
    public Pessoa(){
        nome = "";
        CPF = 0;
    }
    
    //Sobrecarga
    public Pessoa(String nome, long CPF){
        this.nome = nome;
        this.CPF = CPF;
    }

//Getters e setters
public String getNome() { 
        return nome; 
}
public void setNome(String nome) { 
        this.nome = nome; 
}
public long getCPF() { 
        return CPF; 
    }
    public void setCPF(long CPF) { 
        this.CPF = CPF; 
    }
}